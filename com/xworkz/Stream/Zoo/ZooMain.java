package com.xworkz.Stream.Zoo;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooMain {

	public static void main(String[] args) {
		

		ZooDto zoo=new ZooDto("Jaya chamarajendra odeyar", 1, "Mysore", 100.00f);
		ZooDto zoo1=new ZooDto("Bannerugatta", 2, "Bangalore", 200.00f);
		ZooDto zoo2=new ZooDto("Lion Safari", 3, "Shivmogga", 100.00f);
		ZooDto zoo3=new ZooDto("Arignar Anna Zologic park", 4, "Vandalur", 200.00f);
		ZooDto zoo4=new ZooDto("Nandankanan zological park", 5, "Odisha", 100.00f);
		
		
		System.out.println("-----------Looping by id<5 and sorting by price in ascending order-------------------");
		
		Stream<ZooDto> str=Stream.of(zoo,zoo1,zoo2,zoo3,zoo4);
		str.filter((e)->e.getId()<5).sorted((e,e1)->e.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
		
		
		
	}
}
