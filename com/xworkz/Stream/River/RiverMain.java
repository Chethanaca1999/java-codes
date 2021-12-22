package com.xworkz.Stream.River;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverMain {
	
	public static void main(String[] args) {
		
		RiverDto dto=new RiverDto("Ganges", "India and Bangladesh", 2510, "Western Himalayas");
		RiverDto dto1=new RiverDto("Yamuna", "India", 1376, "Uttharakshi");
		RiverDto dto2=new RiverDto("Tunga", "Karnataka", 147, "Chikkamagaluru");
		RiverDto dto3=new RiverDto("Kaveri", "Karnataka and Tamilnadu", 805, "Talakaveri");
		RiverDto dto4=new RiverDto("Krishna", "Vijaywada and Sangali", 1400, "Mahabaleshwara");
		
		Stream<RiverDto> str=Stream.of(dto,dto1,dto2,dto3,dto4);
	
		
		
		System.out.println("-------------.-Filterd by where length >100 and Sorted in desending order");
		str.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt1.getLonger().compareTo(dt2.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
		
		System.out.println("----------sorted in desending order-----------------");
		Stream<RiverDto> str1=Stream.of(dto,dto1,dto2,dto3,dto4);
		str1.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt2.getLonger().compareTo(dt1.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
		
		
		
//		str.sorted((e,e1)->
//		{
//			if(e1.getLonger()>e.getLonger())
//			
//				return 1;
//			
//			return 1;
//		});
		
	}

}
