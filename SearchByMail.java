package com.xworkz.interface1;

public class SearchByMail implements MailInterfa {

	@Override
	public boolean searching(String mail1, String mail2) {
		
		if(mail1.equalsIgnoreCase(mail2)) return true;
		
		return false;
	}

	
	
}
