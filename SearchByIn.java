package com.xworkz.interface1;

public class SearchByIn implements MailInterfa {

	@Override
	public boolean searching(String mail1, String mail2) {
		
		String num2=  mail1.substring(mail1.length()-2, mail1.length());
		System.out.println("ignore cases..............?");
		if(num2.equalsIgnoreCase(mail2)) return true;
		
		return false;
	}
	
	

}
