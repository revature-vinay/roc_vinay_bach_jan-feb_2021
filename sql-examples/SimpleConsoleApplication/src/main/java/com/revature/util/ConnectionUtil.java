package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

import com.revature.exceptions.DatabaseConnectionException;

public class ConnectionUtil {

	private ConnectionUtil() {
		super();
	}
	
	public static Connection getConnection() throws DatabaseConnectionException {
		
		Connection connection = null;
		
		try {
			DriverManager.registerDriver(new Driver());
			
			/*
			 * Using Environment Variables
			 */
			
			String url = System.getenv("db_url");
			String username = System.getenv("db_username");
			String password = System.getenv("db_password");
			
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			throw new DatabaseConnectionException("An issue occurred when trying to connect to the database");
		}
		
		return connection;
	}
	
}
