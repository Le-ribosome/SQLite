package com.example.demo.database;

import com.example.demo.database.DBOpenHelper.Constants;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseDataWorker {

	
	private SQLiteDatabase mDb;
	public DatabaseDataWorker(SQLiteDatabase db) {mDb = db;};
	 
	public void insertHumans() {
		insertHuman("26", "Minou","Alexis", "Vert", "Noir");
		insertHuman("25", "Minette","Pauline", "Marron", "Noir");
	}
	
    private void insertHuman(String humanId, String age, String name, String firstName, String eyeColor, String hairColor) {
        ContentValues values = new ContentValues();
        values.put(DBOpenHelper.Constants.KEY_COL_ID, humanId);
        values.put(DBOpenHelper.Constants.KEY_COL_AGE, age);
        values.put(DBOpenHelper.Constants.KEY_COL_NAME, name);
        values.put(DBOpenHelper.Constants.KEY_COL_FIRSTNAME, firstName);
        values.put(DBOpenHelper.Constants.KEY_COL_EYES_COLOR, eyeColor);
        values.put(DBOpenHelper.Constants.KEY_COL_HAIR_COLOR, hairColor);
        long newRowId = mDb.insert(DBOpenHelper.Constants.MY_TABLE, null, values);
    }
    
}
