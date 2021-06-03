package com.live.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.live.jdbc.util.DatabaseType;
import com.live.jdbc.util.DatabaseUtil;

public class PreparedStatementInsertEx {
	public static void main(String[] args) {
		try (Connection connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB)) {
			String sqlUserQuery = "insert into NEWEMPTABLE values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlUserQuery);
			for(int i = 1; i<= 10; i++) {
				preparedStatement.setInt(1, i);
				preparedStatement.setString(2, ("user"+i));
				int noOfRowsInserted = preparedStatement.executeUpdate();
				System.out.println("Inserted row " + i);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}

/*

package com.live.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

//import java.sql.*;


public class PreparedStatementEx {

	public static void main(String[] args) {
		
		//preparedStatementInsert();
		//preparedStatementDelete();
		//preparedStatementUpdate();
		
	}

	
	
	
	
	
	public static void preparedStatementInsert() {
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Successfully loaded the driver!");
			
			
			    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Rajabeta@12345");
				System.out.println("Successfully connected to the database!");
				//Step 3: Create a statement (sql query)
				String sqlUserQuery = "insert into test_db value(?,?)";
				PreparedStatement statement = connection.prepareStatement(sqlUserQuery);
				//Step 4: Create the query
			//	DELETE FROM table_name WHERE condition;
				//Step 5: Execute Query and get the ResultSet
				
				statement.setInt(1,103);
				statement.setString(2,"rajabeta");
				int noOfRowsInserted = statement.executeUpdate();
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
	public static void preparedStatementDelete() {
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Successfully loaded the driver!");
			
			
			    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Rajabeta@12345");
				System.out.println("Successfully connected to the database!");
				//Step 3: Create a statement (sql query)
				String sqlUserQuery = "DELETE FROM test_db WHERE ID=?";
				PreparedStatement statement = connection.prepareStatement(sqlUserQuery);
				//Step 4: Create the query
			//	DELETE FROM table_name WHERE condition;
				//Step 5: Execute Query and get the ResultSet
				
				statement.setInt(1,103);
				//statement.setString(2,"rajabeta");
				int noOfRowsDeleted = statement.executeUpdate();
				if(noOfRowsDeleted == 1) {
					System.out.println("Successfully deleted the user!");
				}
				else {
					System.out.println("Failed deleting  user..... it is terrible!!!");
				}
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("The driver class was not found : " + e);
		} catch (SQLException e) {
			System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
		}
	}

	
	public static void preparedStatementUpdate() {
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Successfully loaded the driver!");
			
			
			    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Rajabeta@12345");
				System.out.println("Successfully connected to the database!");
				//Step 3: Create a statement (sql query)
				String sqlUserQuery = "UPDATE test_db SET NAME = 'John Cena'  WHERE Id=?";
                                       
                                       
				PreparedStatement statement = connection.prepareStatement(sqlUserQuery);
				//Step 4: Create the query
			//	DELETE FROM table_name WHERE condition;
				//Step 5: Execute Query and get the ResultSet
				
				statement.setInt(1,101);
				//statement.setString(2,"rajabeta");
				int noOfRowsDeleted = statement.executeUpdate();
				if(noOfRowsDeleted == 1) {
					System.out.println("Successfully updated the user!");
				}
				else {
					System.out.println("Failed updating user..... it is terrible!!!");
				}
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("The driver class was not found : " + e);
		} catch (SQLException e) {
			System.out.println("The server could not be connected due to n/w or credentials or server errors!" + e);
		}
	}

	
	
	
}
*/

