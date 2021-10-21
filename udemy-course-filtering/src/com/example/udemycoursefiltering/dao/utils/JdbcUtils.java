package com.example.udemycoursefiltering.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {

	public static Connection connection = null;
	public static Statement statement = null;
	public static PreparedStatement preparedStatement = null;
	
	public static String url = "jdbc:mysql://localhost:3306/courses";
	public static String name ="root";
	public static String password ="55310588";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,name,password);
	}

	public static Statement getStatement() {
		try {
			connection = getConnection();
			System.out.println("db baglantýsý baþarýlý");
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}

	public static PreparedStatement getPreparedStatement(String column) {
		String sql = "SELECT "+column+" FROM couse_list";
		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
	}

	public static void connectionAndPrepareStatement() {
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void connectionAndStatement() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void connectionClose() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void statementClose() {
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void preparedStatementClose() {
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
