package com.example.demo.database.query;

public interface QueryResponse<T> {
	void onSuccess(T data);

	void onFailure(String message);
}
