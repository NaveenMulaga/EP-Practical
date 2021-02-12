package com.klu.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {

	public static Connection getConnection(String driver,String dburl,String username,String password) throws ClassNotFoundException, SQLException {
		
	    Class.forName(driver);
		Connection con=DriverManager.getConnection(dburl,username,password);
		return con;
	}
}
