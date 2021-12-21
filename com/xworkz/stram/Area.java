package com.xworkz.stram;


import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Area {

	public static void main(String[] args) {
		
		System.out.println("-------------toLower and ascending order---------------");
		
		Stream<String> str=Stream.of("Rajajinagar","Majestic","Yeashwantpura","Bannerugatta","Kuvempu","Pinya 1st stage","Pinya 2nd Stage","Kengeri","Vijaynagar","BtmLayout","Lalbhag","Mysore road","Electron City");
//		Collection li=new TreeMap((e,e1)->e.compareTo(e2));
		List<String> li=str.map(String::toLowerCase).sorted().collect(Collectors.toList());
		li.forEach((e)->System.out.println(e));
		
		System.out.println("-------------toUpper and descending order--------------------");
		Stream<String> str1=Stream.of("Rajajinagar","Majestic","Yeashwantpura","Bannerugatta","Kuvempu","Pinya 1st stage","Pinya 2nd Stage","Kengeri","Vijaynagar","BtmLayout","Lalbhag","Mysore road","Electron City");
		List<String> li1=str1.map(String::toUpperCase).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		li1.forEach((w)->System.out.println(w));
	}
}
