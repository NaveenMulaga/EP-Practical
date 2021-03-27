package com.klu.main;

import java.util.Scanner;
import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class Studentmain {
	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentBean st = new StudentBean();
		StudentInsertion c = new StudentInsertion();
		while (true) {
			System.out.println("1.INSERT");
			System.out.println("2.DELETE");
			System.out.println("3.UPDATE");
			System.out.println("4.DISPLAY");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter---> Id_number Name Email Department Address Mobilenumber");
				int regno = sc.nextInt();
				String name = sc.next();
				String email = sc.next();
				String department = sc.next();
				String address = sc.next();
				long mobilenum = sc.nextLong();
				st.setRegno(regno);
				st.setName(name);
				st.setEmail(email);
				st.setDepartment(department);
				st.setAddress(address);
				st.setMobilenum(mobilenum);
				int insertion = c.StudentInsert(st);
				if (insertion > 0) {
					System.out.println("Insertion successful");
				} else
					System.out.println("Insertion unsuccessful");
				break;
			case 2:
				System.out.println("Enter Id for deletion");
				int regno1 = sc.nextInt();
				st.setRegno(regno1);
				int b = c.StudentDelete(st);
				if (b > 0)
					System.out.println("Deletion successfull !!!");
				else
					System.out.println("Deletion failed !!!");
				break;
			case 3:
				System.out.println("Enter Id for updation");
				int id1 = sc.nextInt();
				st.setRegno(id1);
				System.out.println("Enter Name for updation");
				String name_update = sc.next();
				st.setName(name_update);
				int a1 = c.Studentupdation(st);
				if (a1 > 0)
					System.out.println("updation sucessful !!!");
				else
					System.out.println("updation failed !!!");
				break;
			case 4:
				c.Display(st);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invaild information");
			}
		}
	}
}