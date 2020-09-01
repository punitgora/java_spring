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
