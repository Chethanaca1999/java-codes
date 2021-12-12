package com.xworkz.interface1.president;

public class PresidentDto {
	
	private String name;
	private String Country;
	private String age;
	private String cLanguage;
	public PresidentDto(String name, String country, String age, String cLanguage) {
		super();
		this.name = name;
		this.Country = country;
		this.age = age;
		this.cLanguage = cLanguage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getcLanguage() {
		return cLanguage;
	}
	public void setcLanguage(String cLanguage) {
		this.cLanguage = cLanguage;
	}
	@Override
	public String toString() {
		return "PresidentDto [name=" + name + ", Country=" + Country + ", age=" + age + ", cLanguage=" + cLanguage
				+ "]";
	}
	

}
