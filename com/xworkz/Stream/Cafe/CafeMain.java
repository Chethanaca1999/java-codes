package com.xworkz.Stream.Cafe;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeMain {
	
	public static void main(String[] args) {
		
		CafeDto dto=new CafeDto("siri", "veg", "Chikkamagaluru", 4.5f, 123);
		CafeDto dto1=new CafeDto("Chethan cafe cofee day", "veg", "Chikkamagaluru", 5.0f, 1234);
		CafeDto dto2=new CafeDto("Ramanas", "non-veg", "bangalore", 1.0f, 12345);
		CafeDto dto3=new CafeDto("Nikunj stall", "veg and non veg", "gujarat", 4.3f, 123456);
		
		
		Stream<CafeDto> se= Stream.of(dto, dto1,dto2,dto3);
		
		se.filter((e)->e.getRatings()>3).sorted((e,e1)->e1.getName().compareTo(e.getName())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
		//se.collect(Collectors.toList()).forEach((e)->System.out.println(e));
		//se.forEach((e)->System.out.println(e));
		
	}

}
