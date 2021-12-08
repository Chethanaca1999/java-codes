package com.xworkz.Dao.vehicleRegistration;

public class RegistrationTeter {

	public static void main(String[] args) {
		
		RegistrationDAO reg=new RegistrationDAO();
		reg.add("ka 18 j 3483");
		reg.add("ka 66 E 8833");
		reg.add("KA 18 Z 0476");
		
		boolean found=reg.read("KA 18 j 3483");
		System.out.println(found);
		
		boolean found1=reg.findByCaseSensitive("KA 18 j 3483");
		System.out.println(found1);
		
		boolean found2=reg.findByCaseSensitiveAndTrimmed("ka18");
		System.out.println(found2);
		
		
		
	}
}
