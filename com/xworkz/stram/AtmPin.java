package com.xworkz.stram;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPin {
	
	public static void main(String[] args) {
		
		Stream<Integer> str=Stream.of(4128,4123,6766,2988,6656,4151,5252,7373,4242,5252,9993,6463,7472,6464,5343,9876,6636,5678,6778,9867,8754);
		
		List<Integer> lis=str.filter((e)->e<5000).collect(Collectors.toList());
		lis.forEach((e)->System.out.println(e));
	}

}
