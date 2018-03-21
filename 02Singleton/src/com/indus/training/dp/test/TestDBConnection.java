package com.indus.training.dp.test;

import org.junit.Assert;
import org.junit.Test;

import com.indus.training.dp.DBConnection;
import com.indus.training.dp.DBConnectionException;

public class TestDBConnection {

	@Test
	public void testDBConnectionException() {

		try {
			DBConnection dbConn = DBConnection.getDbConn();
			Assert.fail("DBConnectionException expected when connection is not initialized" + dbConn);

		} catch (DBConnectionException dbConnEx) {
			System.out.println(dbConnEx);
		}
	}

	@Test
	public void testSetDBConnection() {

		DBConnection.setDbConn("url", "userName", "password");

		try {
			DBConnection dbConn = DBConnection.getDbConn();

			System.out.println(dbConn);

			Assert.assertNotNull(dbConn);

		} catch (DBConnectionException dbConnEx) {
			Assert.fail(dbConnEx.toString());
		}

	}

	@Test
	public void testSingleton() {

		try {

			DBConnection.setDbConn("url", "userName", "password");

			DBConnection excpectedDBConn = DBConnection.getDbConn();

			DBConnection actualDBConn = DBConnection.getDbConn();

			Assert.assertEquals(excpectedDBConn, actualDBConn);

		} catch (DBConnectionException dbConnEx) {

			Assert.fail(dbConnEx.toString());
		}

	}

	@Test
	public void testSingletonClone() {

		try {

			DBConnection.setDbConn("url", "userName", "password");

			DBConnection original = DBConnection.getDbConn();

			DBConnection clone = (DBConnection) original.clone();

			Assert.assertEquals(original, clone);
		} catch (Exception ex) {

			Assert.fail(ex.toString());
		}

	}

}
