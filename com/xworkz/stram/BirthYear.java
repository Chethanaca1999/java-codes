package com.xworkz.stram;

import java.util.Collections;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYear {
	
	public static void main(String[] args) {
		
		Stream<Integer> str=Stream.of(2000,1999,1998,2001,1997,1990,2005,1997,1996,2016,1987,1965,1976,1954,1963,2010,2015,2020,2021,2017);
//	Set<Integer> se=new TreeSet<>((e,e1)->e.compareTo(e1));
	Set<Integer> se=	str.filter((e)->e>2005).sorted().collect(Collectors.toSet());
	 se.forEach((r)->System.out.println(r));
	
		
		
	}

}
