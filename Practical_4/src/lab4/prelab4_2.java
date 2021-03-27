package lab4;

import java.sql.*;
import java.util.*;

public class prelab4_2 {
	final static String forNameURL = "com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) throws Exception {
		Class.forName(forNameURL);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep", "root", "190031094@");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps;
		while (true) {
			System.out.println("Enter a number :");
			System.out.println("1. INSERTION");
			System.out.println("2. DISPLAY");
			System.out.println("3. EXIT");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("1. Enter number of records :");
				int n = sc.nextInt();
				for (int j = 0; j < n; j++) {
					System.out.println("Enter ID number :");
					int x = sc.nextInt();
					System.out.println("Enter Name");
					String y = sc.next() + sc.nextLine();
					System.out.println("Enter Age");
					int z = sc.nextInt();
					ps = con.prepareStatement("insert into prelab4_2 values(?,?,?)");
					ps.setInt(1, x);
					ps.setNString(2, y);
					ps.setInt(3, z);
					int k = ps.executeUpdate();
					if (k > 0) {
						System.out.println("INSERTION SUCCESSFULL !!!!!\n");
					} else
						System.out.println("INSERTION FAILED !!!!!\n");
				}
				break;
			case 2:
				ps = con.prepareStatement("select * from prelab4_2 where age<21");
				ResultSet rs = ps.executeQuery();
				System.out.println("ID \tNAME \tAGE");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getNString(2) + "\t" + rs.getInt(3));
				}
				System.out.println("------------------------------------------------------------\n");
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}