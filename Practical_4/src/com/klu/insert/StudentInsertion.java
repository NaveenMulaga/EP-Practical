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
		// prepared statement
		PreparedStatement st = con.prepareStatement("insert into inlab4_2 values(?,?,?,?,?,?)");
		st.setInt(1, StudentBean.getRegno());
		st.setString(2, StudentBean.getName());
		st.setString(3, StudentBean.getEmail());
		st.setString(4, StudentBean.getDepartment());
		st.setString(5, StudentBean.getAddress());
		st.setLong(6, StudentBean.getMobilenum());
		int i = st.executeUpdate();
		con.close();
		return i;
	}

	public static int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		// prepared statement
		PreparedStatement st = con.prepareStatement("delete from inlab4_2 where regno=?");
		st.setInt(1, StudentBean.getRegno());
		int k = st.executeUpdate();
		con.close();
		return k;
	}

public static int Studentupdation(StudentBean student) throws ClassNotFoundException, 
SQLException { 
Connection con=DBUtil.DBConnection();
PreparedStatement stmt=con.prepareStatement("update inlab4_2 set name=? where regno=?"); 
stmt.setString(1,StudentBean.getName());
stmt.setInt(2,StudentBean.getRegno()); 
int u=stmt.executeUpdate(); 
return u;
}

	public static ResultSet Display(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		// prepared statement
		PreparedStatement st = con.prepareStatement("select * from inlab4_2");
		ResultSet m = st.executeQuery();
		System.out.println("Id_num\t\tName \t\tEmail \t\tDepartment \t\tAddress \t\tMobilenumber");
		while (m.next()) {
			System.out.println(m.getInt(1) + "\t\t" + m.getString(2) + "\t\t" + m.getString(3) + "\t\t" + m.getString(4)
					+ "\t\t" + m.getString(5) + "\t\t" + m.getLong(6));
		}
		con.close();
		return m;
	}
}