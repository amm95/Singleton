/**
 * @author venka
 * DBConnection Singleton Class
 */
package com.indus.training.dp;

public class DBConnection implements Cloneable {
	/**
	 * private Singleton DBConnection
	 */
	private static DBConnection dbConn = null;

	private String url;

	private String userName;

	private String password;

	public static DBConnection getDbConn() throws DBConnectionException {

		if (dbConn == null) {
			throw new DBConnectionException();
		}
		return dbConn;
	}

	public static void setDbConn(String url, String userName, String password) {
		if (dbConn == null) {
			dbConn = new DBConnection(url, userName, password);
		}
	}

	private DBConnection(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object that) {
		return this == that;

	}

	@Override
	public String toString() {
		return "DBConnection [address=" + this.hashCode() + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.dbConn;
	}

}
