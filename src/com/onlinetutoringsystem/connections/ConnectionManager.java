package com.onlinetutoringsystem.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	static Connection con;
	static String url;

	public static Connection getConnection() {
		System.out.println("I need to start connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("i am here two");
			try {
				System.out.println("before connecting to the database");
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/onlinetutoring", "root", "12345");
				System.out.println("connection successful");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return con;
	}

	public static Connection createConnection() {
		con = null;
		String url = "jdbc:mysql://127.0.0.1:3306/onlinetutoring";
		String username = "root";
		String password = "12345";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				System.out.println("before connecting to the database");
				con = DriverManager.getConnection(url, username, password);
				System.out.println("Hey I just created a connection for you " + con);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}

