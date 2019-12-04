package com.example.demo.database;

import com.example.demo.database.DBOpenHelper.Constants;

import android.database.sqlite.SQLiteDatabase;

public class DatabaseDataWorker {

	
	private SQLiteDatabase mDb;
	public DatabaseDataWorker(SQLiteDatabase db) {mDb = db;};
	
	
//    private static final String DATABASE_CREATE = "create table "
//    	    + Constants.MY_TABLE + "(" + Constants.KEY_COL_ID
//    	    + " integer primary key autoincrement, " + Constants.KEY_COL_AGE
//    	    + " INTEGER, " + Constants.KEY_COL_NAME + " TEXT, "
//    	    + Constants.KEY_COL_FIRSTNAME + " TEXT, "
//    	    + Constants.KEY_COL_EYES_COLOR + " TEXT, "
//    	    + Constants.KEY_COL_HAIR_COLOR + " TEXT) ";
    
	public void insertHumans() {
		insertHuman("26", "Minou","Alexis", "Vert", "Noir");
		insertHuman("25", "Minette","Pauline", "Marron", "Noir");
	}
	
    private void insertCourse(String courseId, String title) {
        ContentValues values = new ContentValues();
        values.put(NoteKeeperDatabaseContract.CourseInfoEntry.COLUMN_COURSE_ID, courseId);
        values.put(NoteKeeperDatabaseContract.CourseInfoEntry.COLUMN_COURSE_TITLE, title);

        long newRowId = mDb.insert(NoteKeeperDatabaseContract.CourseInfoEntry.TABLE_NAME, null, values);
    }
    
}
