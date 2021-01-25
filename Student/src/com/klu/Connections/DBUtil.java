package com.klu.Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	final static String forNameURL="com.mysql.cj.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/ep";
	final static String username="root";
	final static String password="190031094@";
	public static Connection DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(forNameURL);
		Connection con=DriverManager.getConnection(dBURL,username,password);
		return con;
	}	
}
