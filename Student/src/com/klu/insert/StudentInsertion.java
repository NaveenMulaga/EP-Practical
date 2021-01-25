package com.klu.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;
@SuppressWarnings("unused")
public class StudentInsertion {
	
	public static int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?)");
		stmt.setInt(1,StudentBean.getRegno());
		stmt.setString(2,StudentBean.getName());
		int i=stmt.executeUpdate();
		con.close();
		return i;
	}

	public static int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement stmt=con.prepareStatement("delete from Student where regno=?");
		stmt.setInt(1,104);
		int j=stmt.executeUpdate();
		con.close();
		return j;
	}

	public static int StudentUpdate(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement stmt=con.prepareStatement("update Student set s_name=? where regno=?");
		stmt.setString(1, "Nairobi");
		stmt.setInt(2, 103);
		int k=stmt.executeUpdate();
		con.close();
		return k;
	}

	public static ResultSet StudentDisplay(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement stmt=con.prepareStatement("select * from Student");
		ResultSet l=stmt.executeQuery();
		while(l.next()) {
			System.out.println(l.getInt(1)+" "+l.getString(2));
		}
		con.close();
		return l;
	}

}
