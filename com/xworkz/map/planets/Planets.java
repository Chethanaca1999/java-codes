package com.xworkz.map.planets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Planets {
	
	public static void main(String[] args) {
		
		Map<String, String> ma=new HashMap<>();
		
		ma.put("Mars", "August 17 1877");
		ma.put("Eros", "August 13 1898");
		ma.put("Earth", "");
		
		boolean val=ma.containsKey("Earth");
		System.out.println("The enterd key is there:-"+" "+val);
		
		String val1=ma.get("Mars");
		System.out.println("The founded year  is="+" "+val1);
		
		Set<String> se=ma.keySet();
		se.forEach((e)->{
			
			System.out.println("The satelites are:-"+" "+e);
		});
		
	}

}
