package skill;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetailsDAO {
	public int insert(StudentBean sb) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBconnection();
		String sql="insert into Student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,sb.getId());
		ps.setString(2,sb.getName());
		ps.setString(3,sb.getEmail());
		int i=ps.executeUpdate();
		return i;
	}
	public int address_insert(AddressBean ab) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBconnection();
		String sql="insert into address values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,ab.getId());
		ps.setString(2,ab.getStreet());
		ps.setString(3,ab.getCity());
		ps.setString(4,ab.getDistrict());
		ps.setInt(5,ab.getPincode());
		ps.setString(6,ab.getState());
		int i=ps.executeUpdate();
		return i;
	}
}
