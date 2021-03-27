package com.market.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.market.Bean.Bean;
import com.market.Connections.DBUtil;
@SuppressWarnings("unused")
public class MarketCRUD {
	public static int Insert(Bean market) throws ClassNotFoundException, SQLException {
		Connection conn =  DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=conn.prepareStatement("insert into market values(?,?,?)");
		st.setInt(1, Bean.getItemid());
		st.setString(2,Bean.getItemname());
		st.setFloat(3, Bean.getCostofitem());
		int a =st.executeUpdate();
		conn.close();
		return a;
	}
  
	public static ResultSet Display() throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=conn.prepareStatement("select * from market");
		ResultSet b=st.executeQuery();
		System.out.println(" Item_ID \tItem_Name \tCost_of_Item");
		while(b.next()) {
			System.out.println(b.getInt(1)+"\t\t"+b.getString(2)+"\t\t"+b.getFloat(3));
			
		}
		conn.close();
		return b;
	}
		
		public static void Totalcost() throws ClassNotFoundException, SQLException{
			Connection conn=DBUtil.DBConnection();
			//prepared statement
			PreparedStatement st=conn.prepareStatement("select sum(costofitem) from market");
			ResultSet c=st.executeQuery();
			while(c.next()) {
				System.out.println("Total Cost of All Items :" +c.getFloat(1));
			}
			conn.close();
			}

	
}