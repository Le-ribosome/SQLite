package com.example.demo.database.query;

import java.util.List;

import com.example.demo.database.DBOpenHelper;
import com.example.demo.database.tables.FermentableTable;
import com.example.demo.dto.Fermentable;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class FermentableQueryImpl implements QueryContract.FermentableQuery {

	private DBOpenHelper databaseHelper = DBOpenHelper.getInstance();
	
	
	@Override
	public void createFermentable(Fermentable fermentable, QueryResponse<Boolean> response) {
		SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

		ContentValues contentValues = getContentValuesForFermentable(fermentable);

		try {
			long id = sqLiteDatabase.insertOrThrow(FermentableTable.TABLE_NAME, null, contentValues);
			if (id > 0) {
				response.onSuccess(true);
				fermentable.setId((int) id);
			} else
				response.onFailure("Failed to create student. Unknown Reason!");
		} catch (SQLiteException e) {
			response.onFailure(e.getMessage());
		} finally {
			sqLiteDatabase.close();
		}

	}

    private ContentValues getContentValuesForFermentable(Fermentable f){
        ContentValues contentValues = new ContentValues();

        contentValues.put(FermentableTable.KEY_COL_LASTMODIF, f.getLast_modif());
        
        contentValues.put(FermentableTable.KEY_COL_NAME, f.getName());
        contentValues.put(FermentableTable.KEY_COL_VENDEUR, f.getVendeur());
        contentValues.put(FermentableTable.KEY_COL_AMOUNT, f.getAmount());
        contentValues.put(FermentableTable.KEY_COL_TYPE, f.getType().toString());
        contentValues.put(FermentableTable.KEY_COL_YIELD, f.getFyield());
        contentValues.put(FermentableTable.KEY_COL_RECOMMENDMASH, f.isRecommendMash());
        contentValues.put(FermentableTable.KEY_COL_COLOR, f.getColor());
        contentValues.put(FermentableTable.KEY_COL_USEAFTERBOIL, f.isUseAfterBoil());
        

        return contentValues;
    }

    private Fermentable getStudentFromCursor(Cursor cursor){
        int id = cursor.getInt(cursor.getColumnIndex(FermentableTable.KEY_COL_ID));
        String name = cursor.getString(cursor.getColumnIndex(STUDENT_NAME));
        int regNum = cursor.getInt(cursor.getColumnIndex(STUDENT_REGISTRATION_NUM));
        String phone = cursor.getString(cursor.getColumnIndex(STUDENT_PHONE));
        String email = cursor.getString(cursor.getColumnIndex(STUDENT_EMAIL));

        return new Fermentable();
    }

	@Override
	public void readFermentable(int FermentableId, QueryResponse<Fermentable> response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllFermentable(QueryResponse<List<Fermentable>> response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFermentable(Fermentable fermentable, QueryResponse<Boolean> response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFermentable(int FermentableId, QueryResponse<Boolean> response) {
		// TODO Auto-generated method stub
		
	}

}
