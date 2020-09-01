package com.live.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
//oracle database settings
	private static final String ORACLE_USER = "hr";
	private static final String ORACLE_PASSWORD = "hr";
	private static final String ORACLE_CONNECTION_STRING = "hr";

//mysql database settings

	public static Connection getConnection(DatabaseType databaseType) {
		// CHECKED exceptions : compiler force checks that certain exceptions are
		// handled
		// Step 1 : Load the driver

		switch (databaseType) {
		case ORACLEDB: {
			Connection connection = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			} catch (ClassNotFoundException e) {
				System.out.println("The driver class was not found : " + e);
			} catch (SQLException e) {
				System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
			}
			return connection;
		}
		case MYSQLDB:
			break;
		default:
			break;
		}
		return null;
	}
}
