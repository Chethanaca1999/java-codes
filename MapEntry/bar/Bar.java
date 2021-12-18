package com.xworkz.map.MapEntry.bar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Bar {

	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("Brandy", 100);
		map.put("Vodka", 200);
		map.put("Absinthe", 250);
		map.put("Gin", 300);
		map.put("Rum", 350);
		map.put("Tequila", 400);
		map.put("Whisky", 450);
		
		System.out.println("-------Brands are--------");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			String val=it.next();
			System.out.println(val);
		}
		
		System.out.println("------Cost is------------");
		Collection<Integer> set1=map.values();
		Iterator<Integer> it1=set1.iterator();
		while(it1.hasNext())
		{
			int val2=it1.next();
			System.out.println(val2);
			
			
		}
		
		System.out.println("---------The brands and their cost is-------");
		Set<Map.Entry<String, Integer>> col2=map.entrySet();
		Iterator<Entry<String, Integer>> it2=col2.iterator();
		while(it2.hasNext())
		{
			Map.Entry<String, Integer> val2=it2.next();
			System.out.println(val2);
		}
		
		System.out.println("-------Asending Order--------");
		
		Map<String, Integer> map1=new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		map1.put("Brandy", 100);
		map1.put("Vodka", 200);
		map1.put("Absinthe", 250);
		map1.put("Gin", 300);
		map1.put("Rum", 350);
		map1.put("Tequila", 400);
		map1.put("Whisky", 450);
		
		
		Set<String> set2=map1.keySet();
		Iterator<String> it3=set2.iterator();
		while(it3.hasNext())
		{
			String val3=it3.next();
			System.out.println(val3);
		}
		
		System.out.println("-------Desending Order--------");

		Map<String, Integer> map2=new TreeMap<String, Integer>((e2,e3)->e3.compareTo(e2));
		map2.put("Brandy", 100);
		map2.put("Vodka", 200);
		map2.put("Absinthe", 250);
		map2.put("Gin", 300);
		map2.put("Rum", 350);
		map2.put("Tequila", 400);
		map2.put("Whisky", 450);
		

		Set<String> set3=map2.keySet();
		Iterator<String> it4=set3.iterator();
		while(it4.hasNext())
		{
			String val4=it4.next();
			System.out.println(val4);
		}

	
	
	}
}
