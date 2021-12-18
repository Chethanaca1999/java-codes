package com.xworkz.map.MapEntry.area;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Area {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("Rajajinagar","418sq.ft");
		map.put("Baneerugatta", "100.58sq.mi");
		map.put("BTM Layout", "2.13sq.km");
		map.put("Majastic", "2184sq.ft");
		map.put("Yeshwantpura", "1200sq.ft");
		
		System.out.println("------------print keys only-----------------");
		Set<String> se=map.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("------------print values only-----------");
		Collection<String> se1=map.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("--------------print both keys and values------------");
		
		Set<Map.Entry<String, String>> se2=map.entrySet();
		Iterator<Map.Entry<String, String>> it=se2.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> val=it.next();
			System.out.println(val);
		}
System.out.println("------------------Asending order-------------------");

		Map<String,String> map1=new TreeMap<String,String>((e,e1)->e.compareTo(e1));
		map1.put("Rajajinagar","418sq.ft");
		map1.put("Baneerugatta", "100.58sq.mi");
		map1.put("BTM Layout", "2.13sq.km");
		map1.put("Majastic", "2184sq.ft");
		map1.put("Yeshwantpura", "1200sq.ft");
		
		System.out.println("------------print keys only-----------------");
		Set<String> se4=map1.keySet();
		se4.forEach((e)->System.out.println(e));

		System.out.println("------------------Desending order-------------------");

		Map<String,String> map2=new TreeMap<String,String>((e,e1)->e1.compareTo(e));
		map2.put("Rajajinagar","418sq.ft");
		map2.put("Baneerugatta", "100.58sq.mi");
		map2.put("BTM Layout", "2.13sq.km");
		map2.put("Majastic", "2184sq.ft");
		map2.put("Yeshwantpura", "1200sq.ft");
		
		System.out.println("------------print keys only-----------------");
		Set<String> se5=map2.keySet();
		se5.forEach((e)->System.out.println(e));

	
	}
	
	
	
}
