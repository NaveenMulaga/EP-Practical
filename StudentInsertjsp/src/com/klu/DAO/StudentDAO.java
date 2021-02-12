package com.klu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.klu.DBUtil.Dbconn;
import com.klu.bean.StudentBean;

public class StudentDAO {

	public int StudentInsert(StudentBean sb,String driver,String dburl,String username,String password) throws ClassNotFoundException, SQLException{
		
		Connection con=Dbconn.getConnection(driver, dburl, username, password);
		String sql="insert into student values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, sb.getRegno());
		ps.setString(2, sb.getName());
		ps.setString(3, sb.getEmail());
		ps.setString(4, sb.getDepartment());
		int i=ps.executeUpdate();
		return i;
	}
}
