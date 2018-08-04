package com.up.clinica.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{

	static {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);// devemos logar esse erro
		}
	}

	public static Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/clinicaveterinariadb", "SA", "");
			return con;
		} catch (SQLException e) {
			throw new RuntimeException(e);// devemos logar esse erro
		}
	}
}