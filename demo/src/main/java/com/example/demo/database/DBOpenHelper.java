package com.example.demo.database;

import com.example.demo.database.tables.FermentableTable;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.example.demo.util.MyApp;

/**
 * Classe permettant accès à la BDD
 * @author alexis
 *
 */
public class DBOpenHelper extends SQLiteOpenHelper {

	// The database name
	public static final String DATABASE_NAME = "myData.db";
	
	// The database version
	public static final int DATABASE_VERSION = 1;
	
	private static DBOpenHelper databaseHelper;
	
    /**
     * @param context
     *            = the context of the caller
     * @param name
     *            = Database's name
     * @param factory
     *            = null
     * @param version
     *            = Database's version
     */
    private DBOpenHelper() {
        super(MyApp.context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
    public static DBOpenHelper getInstance() {

        if (databaseHelper == null) {
            synchronized (DBOpenHelper.class){ //thread safe singleton
                if (databaseHelper == null)
                    databaseHelper = new DBOpenHelper();
            }
        }

        return databaseHelper;
    }

    /**
     * Create the BDD if the db file changed
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
	// Create the new database using the SQL string Database_create
    //Faire autant de db.execSql qu'il y a de tables
	db.execSQL(FermentableTable.CREATE_FERMENTABLE_TABLE);
	//DatabaseDataWorker worker = new DatabaseDataWorker(db);
	//worker.insertHumans();

    }

    /**
     * Upgrade the db if the version had changed 
     * 
     * @param oldVersion of the db
     * @param newVersion of the db
     * @param db the database to change
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	Log.w("DBOpenHelper", "Mise à jour de la version " + oldVersion
		+ " vers la version " + newVersion
		+ ", les anciennes données seront détruites ");
	// Drop the old database
	db.execSQL("DROP TABLE IF EXISTS " + FermentableTable.TABLE_NAME);
	// Create the new one
	onCreate(db);
	// or do a smartest stuff
    }
    
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);

        //enable foreign key constraints like ON UPDATE CASCADE, ON DELETE CASCADE
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

}
