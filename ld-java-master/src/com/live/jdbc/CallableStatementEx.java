package com.live.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.live.jdbc.util.DatabaseType;
import com.live.jdbc.util.DatabaseUtil;

public class CallableStatementEx {
	public static void main(String[] args) {
		try (Connection connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB)) {
			CallableStatement callableStatement = connection.prepareCall("call NEWEMPTABLEPROC(?,?)");
			//set the parameters dynamically
			callableStatement.setInt(1,201);
			callableStatement.setString(2, "Johnny");
			//execute the procedure
			callableStatement.execute();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
