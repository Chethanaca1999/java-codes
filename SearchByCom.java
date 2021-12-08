package com.xworkz.interface1;

public class SearchByCom implements MailInterfa {

	@Override
	public boolean searching(String mail1, String mail2) {
		String num=mail1.substring(mail1.length()-3, mail1.length());
		System.out.println("ignore cases.......?");
		if(num.equalsIgnoreCase(mail2)) return true;
			
				
			
				
		return false;
	}
	
}
