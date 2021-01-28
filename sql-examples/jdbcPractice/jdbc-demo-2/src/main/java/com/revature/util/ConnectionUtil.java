package com.revature.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

public class ConnectionUtil {

	// I'm making a private constructor because this class should never be instantiated
	// This is a utility class, which will only contain static methods
	private ConnectionUtil() {
		super();
	}
	
	public static Connection getConnection() throws IOException, SQLException {
		
		DriverManager.registerDriver(new Driver());
		
		/*
		 * Using environment variables
		 */
//		String url = System.getenv("db_url");
//		String username = System.getenv("db_username");
//		String password = System.getenv("db_password");
		
		/*
		 * Using a properties file
		 */
		FileInputStream fis = new FileInputStream("src/main/resources/connection.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String url = (String) p.get("url");
		String username = (String) p.get("username");
		String password = (String) p.get("password");
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
	
}
