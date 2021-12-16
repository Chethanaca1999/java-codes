package com.xworkz.map.continent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Continent {

	public static void main(String[] args) {
		
		Map<String,String> ma=new HashMap<>();
		ma.put("Asia", "India");
		ma.put("Europe", "Australia");
		ma.put("Africa", "Egypt");
		ma.put("North America", "canada");
		ma.put("Oceania", "New-zeland");
		ma.put("South america", "Argentaina");
		ma.put("Antartica", "France");
		
		boolean cont=ma.containsKey("Asia");
		System.out.println("Entered key  is there:-"+" "+cont);
		
		boolean conta=ma.containsValue("India");
		System.out.println("Entered value is there:-"+" "+conta);
		
		
		String  val=ma.get("Asia");
		System.out.println("the value for entered key is="+" "+val);
		
		System.out.println("the size of hash map is "+" "+ma.size());
		
		Set<String> se=ma.keySet();
		
		se.forEach((e) ->{
			System.out.println("the continents are:-"+e);
		});
		
		
		
		
		
		
	}
}
