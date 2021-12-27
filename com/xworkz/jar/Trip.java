package com.xworkz.jar;

public class Trip {
	public static void main(String[] args) {
		String trip="com.mysql.cj.jdbc.Driver";
		try
		{
			Class.forName(trip);
			System.out.println("jdbc is created");
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
