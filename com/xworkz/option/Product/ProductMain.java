package com.xworkz.option.Product;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ProductMain {
	
	public static void main(String[] args) {
		
		ProductDTO dto=new ProductDTO(1, "sandisk", "pendrive", "500", "32gb");
		ProductDTO dto1=new ProductDTO(2, "tar", "jeep", "12laks", "1");
		ProductDTO dto2=new ProductDTO(3, "v-one", "bag", "500", "1");
		ProductDTO dto3=new ProductDTO(5, "bata", "flipflop", "250", "1pair");
		ProductDTO dto5=new ProductDTO(4, "jackie", "innerwear", "400", "1");
		ProductDTO dto6=new ProductDTO(4, "jackie", "innerwear", "400", "1");
		ProductDTO dto7=new ProductDTO(4, "jackie", "innerwear", "400", "1");
		
		
		Set<ProductDTO> se=new HashSet<ProductDTO>();
		se.add(dto);
		se.add(dto7);
		se.add(dto6);
		se.add(dto5);
		se.add(dto1);
		se.add(dto3);
		se.add(dto2);
		
		
		System.out.println(se.size());
		Optional<ProductDTO> optio=se.stream().filter((e)->e.getId()>3).sorted((w,w1)->w.getName().compareTo(w1.getName())).findFirst();
		System.out.println(optio);
	
	}

}
