package com.xworkz.map.MapEntry.states;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class States {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("karnataka", 31);
		map.put("Tamilnadu", 38);
		map.put("Uttar pradesh", 71);
		map.put("sikkim", 4);
		map.put("Maharastra", 36);
		map.put("Nagaland", 12);
		map.put("Punjab", 23);
		map.put("MadyaPradesh", 55);
		map.put("AndraPradesh", 13);
		map.put("Goa", 4);
		
		Collection<String> se=map.keySet();
		Iterator<String> it=se.iterator();
		
		while(it.hasNext())
		{
			String val=it.next();
			
			
			System.out.println(val);
			
		}
		
		System.out.println("4###########################################################################");
		
		
		Collection<Integer> valu=map.values();
		
		valu.forEach((e)->{System.out.println("The value of the given map is "+" "+e);});
		
		
		
	System.out.println("###############################################################################################");
	
	
	Set<Map.Entry<String, Integer>> se1=map.entrySet();
	
	Iterator<Map.Entry<String, Integer>> itr1= se1.iterator();
	System.out.println("States"+"        "+"No.of Districts");
	while(itr1.hasNext())
	{
		Map.Entry<String, Integer> val1= itr1.next();
		
		System.out.println("Name of the state is:-"+" "+val1.getKey());
		System.out.println("Total no of districts in" +" "+val1.getKey()+" "+val1.getValue());
		
	}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-----AFTER SORTING IN DECENDING-----$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
	Map<String,Integer> map2=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
	map2.put("Karnataka", 31);
	map2.put("Tamilnadu", 38);
	map2.put("Uttar pradesh", 71);
	map2.put("Sikkim", 4);
	map2.put("Maharastra", 36);
	map2.put("Nagaland", 12);
	map2.put("Punjab", 23);
	map2.put("MadyaPradesh", 55);
	map2.put("AndraPradesh", 13);
	map2.put("Goa", 4);
	
	Set<String> se2=map2.keySet();
	Iterator<String> it2=se2.iterator();
	
	while(it2.hasNext())
	{
		String val2=it2.next();
		
		
		System.out.println(val2);
		
	}
	
	System.out.println("--------------------Asending order---------------------------");
	
	Map<String ,Integer> map3=new TreeMap<>((e,e4)->e.compareTo(e4));
	map3.put("Karnataka", 31);
	map3.put("Tamilnadu", 38);
	map3.put("Uttar pradesh", 71);
	map3.put("Sikkim", 4);
	map3.put("Maharastra", 36);
	map3.put("Nagaland", 12);
	map3.put("Punjab", 23);
	map3.put("MadyaPradesh", 55);
	map3.put("AndraPradesh", 13);
	map3.put("Goa", 4);
	
	Set<String> se3=map3.keySet();
	Iterator<String> it3=se3.iterator();
	
	while(it3.hasNext())
	{
		String val3=it3.next();
		
		
		System.out.println(val3);
		
	}
	
	}
}


