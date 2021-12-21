package com.xworkz.stram;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNum {

	public static void main(String[] args) {
		
		
	Stream<Integer > str=Stream.of(123456789,987654321,234567891,345678912,345678945,232323232,453234567,234569,234322345,234567654,948484756);
	
	Set<Integer> se=str.filter((e)->e>2345678).sorted().collect(Collectors.toSet());
	se.forEach((e)->System.out.println(e));
	}
}
