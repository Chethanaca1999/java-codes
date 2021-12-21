package com.xworkz.stram;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNo {

	public static void main(String[] args) {
		
		Stream<Integer> roll=Stream.of(17001,17002,17003,17004,117005,17006,17007,17008,17009,1710,17011,17012,17013,17014,17015,17016,17017,17018,17019,17020);
		
	List<Integer> li=roll.filter((p)->p>=17001).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		
//		Set roll =new TreeSet<Integer>((e)->System.out.println(e));
		li.forEach(j->System.out.println(j));
		
		
		
	}
}
