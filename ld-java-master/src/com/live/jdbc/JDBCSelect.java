package com.live.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.live.jdbc.util.DatabaseType;
import com.live.jdbc.util.DatabaseUtil;

public class JDBCSelect {
	public static void main(String[] args) {
		jdbcSelectMySql();
		System.out.println("**********************");
		//jdbcSelectOracle();
		jdbcSelectOracleBestPractices();
	}
	private static void jdbcSelectOracleBestPractices() {
Connection connection = null;
		try {
			connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
			System.out.println("Successfully connected to the database!");
			//Step 3: Create a statement (sql query)
			Statement statement = connection.createStatement();
			//Step 4: Create the query
			String selectQuery = "select * from employees where employee_id < 106";
			//Step 5: Execute Query and get the ResultSet
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while(resultSet.next()) {
				int actorId = resultSet.getInt("employee_id");
				String firstNameString = resultSet.getString("first_name");
				System.out.println(actorId + " " + firstNameString);
			}
		}catch (SQLException e) {
			System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
		}
	}
	private static void jdbcSelectOracle() {
		// CHECKED exceptions : compiler force checks that certain exceptions are
		// handled
		// Step 1 : Load the driver

		try {
			//Deprecated
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			System.out.println("Successfully loaded the driver!");
			//Step 2: Create the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("Successfully connected to the database!");
			//Step 3: Create a statement (sql query)
			Statement statement = connection.createStatement();
			//Step 4: Create the query
			String selectQuery = "select * from employees where employee_id < 106";
			//Step 5: Execute Query and get the ResultSet
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while(resultSet.next()) {
				int actorId = resultSet.getInt("employee_id");
				String firstNameString = resultSet.getString("first_name");
				System.out.println(actorId + " " + firstNameString);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("The driver class was not found : " + e);
		} catch (SQLException e) {
			System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
		}
	}
	private static void jdbcSelectMySql() {
		// CHECKED exceptions : compiler force checks that certain exceptions are
		// handled
		// Step 1 : Load the driver
		Connection connection = null;
		try {
			//Deprecated
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");			
			System.out.println("Successfully loaded the driver!");
			//Step 2: Create the connection
			connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","mysql");
			System.out.println("Successfully connected to the database!");
			//Step 3: Create a statement (sql query)
			Statement statement = connection.createStatement();
			//Step 4: Create the query
			String sqlActorQuery = "select actor_id, first_name from actor where actor_id < 6";
			//Step 5: Execute Query and get the ResultSet
			ResultSet resultSet = statement.executeQuery(sqlActorQuery);
			while(resultSet.next()) {
				int actorId = resultSet.getInt("actor_id");
				String firstNameString = resultSet.getString("first_name");
				System.out.println(actorId + " " + firstNameString);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("The driver class was not found : " + e);
		} catch (SQLException e) {
			System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error closing the connection " + e);
			}
		}
	}
}
