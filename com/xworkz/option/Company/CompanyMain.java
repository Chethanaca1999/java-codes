package com.xworkz.option.Company;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.option.Company.CompanyDto;

public class CompanyMain {

	public static void main(String[] args) {
		
		CompanyDto dto=new CompanyDto(1, "Apple", "TimCook", 365820d);
		CompanyDto dto1=new CompanyDto(2, "Amazon", "Andy jassy", 386064d);
		CompanyDto dto2=new CompanyDto(3, "Walart", "KrishIyer", 5591551d);
		CompanyDto dto3=new CompanyDto(4, "Toyota", "Akiyo toyodaa", 256722d);
		CompanyDto dto4=new CompanyDto(5, "Apple", "TimCook", 365820d);
		CompanyDto dto5=new CompanyDto(2, "Amazon", "Andy jassy", 386064d);
		CompanyDto dto6=new CompanyDto(5, "Apple", "TimCook", 365820d);
		
		
		Set<CompanyDto> set=new LinkedHashSet<CompanyDto>();
		set.add(dto);
		set.add(dto5);
		set.add(dto4);
		set.add(dto3);
		set.add(dto2);
		set.add(dto1);
		set.add(dto6);
		boolean val=dto.equals(dto5);
		System.out.println(val);
		
		System.out.println(set.size());
		Optional<CompanyDto> opti=set.stream().filter((e)->e.getTurnOver()>30000d).sorted((q,q1)->q.getCompanyName().compareTo(q1.getCompanyName())).findFirst();
		System.out.println(opti);
		
		
	}
}
