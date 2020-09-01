package com.live.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
public static void main(String[] args) {
	jdbcInsertMySql();
}
private static void jdbcInsertMySql() {
	// CHECKED exceptions : compiler force checks that certain exceptions are
	// handled
	// Step 1 : Load the driver

	try {
		//Deprecated
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");			
		System.out.println("Successfully loaded the driver!");
		//Step 2: Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","mysql");
		System.out.println("Successfully connected to the database!");
		//Step 3: Create a statement (sql query)
		Statement statement = connection.createStatement();
		//Step 4: Create the query
		String sqlUserQuery = "insert into user values (101, 'john')";
		//Step 5: Execute Query and get the ResultSet
		int noOfRowsInserted = statement.executeUpdate(sqlUserQuery);
		if(noOfRowsInserted == 1) {
			System.out.println("Successfully inserted the user!");
		}
		else {
			System.out.println("Failed inserting user..... it is terrible!!!");
		}
	} catch (ClassNotFoundException e) {
		System.out.println("The driver class was not found : " + e);
	} catch (SQLException e) {
		System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
	}
}
}
