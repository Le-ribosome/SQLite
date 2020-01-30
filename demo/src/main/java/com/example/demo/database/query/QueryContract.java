package com.example.demo.database.query;

import java.util.List;

import com.example.demo.dto.Fermentable;
import com.example.demo.dto.db.TableRowCount;

public class QueryContract {

    public interface FermentableQuery {
        void createFermentable(Fermentable fermentable, QueryResponse<Boolean> response);
        void readFermentable(int FermentableId, QueryResponse<Fermentable> response);
        void readAllFermentable(QueryResponse<List<Fermentable>> response);
        void updateFermentable(Fermentable fermentable, QueryResponse<Boolean> response);
        void deleteFermentable(int FermentableId, QueryResponse<Boolean> response);
    }
    
    public interface TableRowCountQuery {
        void getTableRowCount(QueryResponse<TableRowCount> response);
    }
}
