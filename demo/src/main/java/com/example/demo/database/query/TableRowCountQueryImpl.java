package com.example.demo.database.query;

import com.example.demo.database.DBOpenHelper;
import com.example.demo.database.tables.FermentableTable;
import com.example.demo.dto.db.TableRowCount;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

public class TableRowCountQueryImpl implements QueryContract.TableRowCountQuery {

    @Override
    public void getTableRowCount(QueryResponse<TableRowCount> response) {
        DBOpenHelper databaseHelper = DBOpenHelper.getInstance();
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

        try {
            long fermentableCount = DatabaseUtils.queryNumEntries(sqLiteDatabase, FermentableTable.TABLE_NAME);

            TableRowCount tableRowCount = new TableRowCount(fermentableCount);
            response.onSuccess(tableRowCount);

        } catch (Exception e){
            response.onFailure(e.getMessage());
        } finally {
            sqLiteDatabase.close();
        }

    }
}
