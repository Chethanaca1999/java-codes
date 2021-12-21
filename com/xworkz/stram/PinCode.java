package com.xworkz.stram;

//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PinCode {

	public static void main(String[] args) {
		
		Stream<Integer> str=Stream.of(577549,544765,544433,587652,576543,545678,598765,589087,543217,589098,577213,560010,560098,577228,560008,578765,578900,574324,577531,577512);
	     List<Integer> lis=str.filter((e)->e>577500).sorted().collect(Collectors.toList());

	     lis.forEach((e)->System.out.println(e));
	}
}
