package com.xworkz.map.adhar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Adhar {
public static void main(String[] args) {
	Map ma =new HashMap<>();
	
	
	ma.put("1234 1235 2345", "Chethana ");
	ma.put("2345 4567 6789", "viji");
	ma.put("1256 2345 3456", "teja");
	
	Set se =ma.keySet();
	se.forEach((e)->{
		System.out.println("The adhar numbers are:-"+""+e);
	});
			
	
}
}
