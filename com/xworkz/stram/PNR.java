package com.xworkz.stram;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNR {

	public static void main(String[] args) {
		
		Stream<Long> str=Stream.of(8585471423l, 4542369874l, 4712456512l, 3653259874l, 6568745212l, 8974587412l, 4514257412l,4785412357l,7474127354l, 6869541235l, 8965741258l, 7373587419l, 9823574124l, 7458741247l, 9614785265l, 4185963254l, 7478745962l, 6368741258l, 6964768515l, 1474859612l, 6969857412l);
		
		Set<Long> se=str.filter((f)->f>1234567893l).sorted().collect(Collectors.toSet());
		
		se.forEach((e)->System.out.println(e));
	}
}
