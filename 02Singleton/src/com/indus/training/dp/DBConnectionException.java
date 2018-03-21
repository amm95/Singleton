package com.indus.training.dp;

public class DBConnectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6544249943250029531L;

	public DBConnectionException() {
		super("DBConnection Object not initialized. Please initialize using setDBConnection");

	}

}
