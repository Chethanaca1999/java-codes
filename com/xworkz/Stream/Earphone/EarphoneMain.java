package com.xworkz.Stream.Earphone;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarphoneMain {

	public static void main(String[] args) {
		
		EarphoneDto Ear=new EarphoneDto("Redmi sonic bass", 1300, 12, "Bluetooth");
		EarphoneDto Ear1=new EarphoneDto("Fastrack Reflextunes", 2695, 123, "Wireless Headphone");
		EarphoneDto Ear2=new EarphoneDto("Samsung galaxy buds", 11999, 124, "Bluetooth ear buds");
		EarphoneDto Ear3=new EarphoneDto("boatbass  heads", 299, 125, "wired");
		EarphoneDto Ear4=new EarphoneDto("Apple Earpods", 319, 1245, "wired and bluetooth");
		
		Stream<EarphoneDto> str=Stream.of(Ear,Ear1,Ear2,Ear3,Ear4);
		
		System.out.println("------------filter by where cost >500 and sorted by brand in ascending order-----------");
		
		str.filter((e)->e.getCost()>500).sorted((e,e1)->e.getBrand().compareTo(e1.getBrand())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	
		
		System.out.println("-----------print only models-------------------");
		Stream<EarphoneDto> str1=Stream.of(Ear,Ear1,Ear2,Ear3,Ear4);	
		str1.sorted((e,e1)->e.getBrand().compareTo(e1.getBrand())).map((e)->e.getBrand()).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	}
}
