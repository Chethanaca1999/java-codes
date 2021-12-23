package com.xworkz.option.Hockey;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


public class HockeyMain {
	public static void main(String[] args) {
		
		HockeyDTO dto=new HockeyDTO("RedSticks", 19, 8, "spain");
		HockeyDTO dto1=new HockeyDTO("oranje", 59, 21, "Netherland");
		HockeyDTO dto2=new HockeyDTO("Kenya Hockey Union", 10, 4, "kenya");
		HockeyDTO dto3=new HockeyDTO("the kookaburras",69, 19, "Australia");
		HockeyDTO dto4=new HockeyDTO("BharatArmy", 81, 12, "India");
		
		
		
		
		
		boolean val1=dto.getPlace().equals(dto1.getPlace());
		System.out.println("the places are equal:"+"   "+val1);
		
	
		Set<HockeyDTO> se=new HashSet<HockeyDTO>();
		se.add(dto);
		se.add(dto1);
		se.add(dto2);
		se.add(dto3);
		se.add(dto4);
		
		
		Optional<HockeyDTO> val = se.stream().filter((e)->e.getWins()>10).sorted((q,q1)->q.getPlace().compareTo(q1.getPlace())).findFirst();
		System.out.println(val);
		System.out.println("The size is"+"  "+se.size());
		
		
	}

}
