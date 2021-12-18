package com.xworkz.map.MapEntry.movies;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Movies {
	public static void main(String[] args) {
		
		Map<String,Double> map=new HashMap<String,Double>();
		 map.put("Kgf",8.3);
		 map.put("Kotigobba 3", 6.8);
		 map.put("Kurukshetra", 6.7);
		 map.put("Yuvaratna", 6.7);
		 map.put("Bhajarangi2", 8.2);
		 map.put("Ugram",8.1);
		 map.put("Sakkath", 8.6);
		 map.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("------------Movie names are---------");
		 Set<String> se=map.keySet();
		 se.forEach((e)-> System.out.println(e) );
		 
		 System.out.println("----------Movies ratings are-----------");
		 
		 Collection<Double> se1=map.values();
		 se1.forEach((e)->System.out.println(e));
		 
		 System.out.println("------------Movies and their imdb ratings------------------");
		 
		 Collection<Map.Entry<String, Double>> col3=map.entrySet();
		 Iterator<Map.Entry<String, Double>>  itr=col3.iterator();
		 
		 while(itr.hasNext())
		 {
		Map.Entry<String, Double> val3	=itr.next();
		System.out.println(val3);
		 }
		 
		 System.out.println("-----------Arrangng in assending order--------------");
	
		 Map<String,Double> map1=new TreeMap<String,Double>((e,e1)->e.compareTo(e1));
		 map1.put("Kgf",8.3);
		 map1.put("Kotigobba 3", 6.8);
		 map1.put("Kurukshetra", 6.7);
		 map1.put("Yuvaratna", 6.7);
		 map1.put("Bhajarangi2", 8.2);
		 map1.put("Ugram",8.1);
		 map1.put("Sakkath", 8.6);
		 map1.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("------------Movie names are---------");
		 Set<String> se3=map1.keySet();
		 se3.forEach((e)-> System.out.println(e) );
		 
		 

		 System.out.println("-----------Arrangng in desending order--------------");
	
		 Map<String,Double> map2=new TreeMap<String,Double>((e3,e2)->e2.compareTo(e3));
		 map2.put("Kgf",8.3);
		 map2.put("Kotigobba 3", 6.8);
		 map2.put("Kurukshetra", 6.7);
		 map2.put("Yuvaratna", 6.7);
		 map2.put("Bhajarangi2", 8.2);
		 map2.put("Ugram",8.1);
		 map2.put("Sakkath", 8.6);
		 map2.put("Ratnan parpancha", 8.9);
		 
		 System.out.println("------------Movie names are---------");
		 Set<String> se4=map2.keySet();
		 se4.forEach((e)-> System.out.println(e) );
		 
	
	
	
	
	
	}

}
