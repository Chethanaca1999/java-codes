package com.xworkz.Stream.Temple;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleMain {

	public static void main(String[] args) {
		
		TempleDto dto=new TempleDto("Iskon", "Krishna", 10000, "Bangalore");
		TempleDto dto1=new TempleDto("Murudeshwara", "Mahadeva", 10000, "Mangaluru");
		TempleDto dto2=new TempleDto("Dharmastala", "Manjunatha Swamy", 1000000, "South karnataka");
		TempleDto dto3=new TempleDto("Udhupi Shri krishna", "Krishna", 100000, "Udupi");
		TempleDto dto4=new TempleDto("Vidya Shankara temple", "Sharada", 10000, "Shringeri");
		TempleDto dto5=new TempleDto("VittalaTemple", "Virupaksha", 10000, "Hampi");
		
		Stream<TempleDto> str=Stream.of(dto,dto1,dto2,dto3,dto4,dto5);
		
		System.out.println("----------filter orderd by no of visitor>1000 and sort location by ascending order------------");
		
		str.filter((e)->e.getNoOfVisitors()>1000).sorted((a,a1)->a.getLocation().compareTo(a1.getLocation())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
		
		
	}
}
