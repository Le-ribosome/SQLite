package com.example.demo.database.tables;

import android.provider.BaseColumns;

public class FermentableTable implements BaseColumns {
	
	// The table Name
	public static final String TABLE_NAME = "Fermentable";
	
	// Columns names and the associated explanation for end-users 
	public static final String KEY_COL_ID = "id";
	public static final String KEY_COL_LASTMODIF = "last_modif";
	public static final String KEY_COL_NAME = "name";
	public static final String KEY_COL_VENDEUR = "vendeur";
	public static final String KEY_COL_AMOUNT = "amount";
	public static final String KEY_COL_TYPE = "type";
	public static final String KEY_COL_YIELD = "yield";
	public static final String KEY_COL_RECOMMENDMASH = "recommend_mash";
	public static final String KEY_COL_COLOR = "color";
	public static final String KEY_COL_USEAFTERBOIL = "use_after_boil";
	
    /**
     * The static string to create the table.
     */
    public static final String CREATE_FERMENTABLE_TABLE = 
    	"CREATE TABLE" + TABLE_NAME + "(" 
    	+ KEY_COL_ID + " INTERGER PRIMARY KEY AUTOINCREMENT, " 
	    + KEY_COL_LASTMODIF+ " TEXT, " 
    	+ KEY_COL_NAME + " TEXT, "
	    + KEY_COL_VENDEUR + " TEXT, "
	    + KEY_COL_AMOUNT + " INTEGER, "
	    + KEY_COL_TYPE + " TEXT"
	    + KEY_COL_YIELD + "INTEGER"
	    + KEY_COL_RECOMMENDMASH + "TEXT" //Boolean
	    + KEY_COL_COLOR + "INTEGER"
	    + KEY_COL_USEAFTERBOIL + "TEXT" //Boolean
	    +") ";
}
