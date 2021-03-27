package com.klu.Bean;

public class StudentBean {
	private static int regno;
	private static String name, email, department, address;
	private static long mobilenum;

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		StudentBean.email = email;
	}

	public static String getDepartment() {
		return department;
	}

	public static void setDepartment(String department) {
		StudentBean.department = department;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		StudentBean.address = address;
	}

	public static long getMobilenum() {
		return mobilenum;
	}

	public static void setMobilenum(long mobilenum) {
		StudentBean.mobilenum = mobilenum;
	}

	public static int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		StudentBean.regno = regno;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		StudentBean.name = name;
	}
}