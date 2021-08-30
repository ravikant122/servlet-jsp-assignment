package com.student.dao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionFactory {
	private static Connection connection = null;

	public DBConnectionFactory() {

	}

	public static Connection getConnection() {
		InputStream inStream = DBConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();

		try {
			properties.load(inStream);
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		String driverName = properties.getProperty("jdbc.driverName");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
