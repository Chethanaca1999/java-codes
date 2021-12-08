package com.xworkz.Dao.Gym;

public class GymTester {

	public static void main(String[] args) {
		
		GymDao gym=new GymDao();
		
		
		gym.create("D-Boss Gym");
		gym.create("Kiccha Gym");
		gym.create("Rocking Gym");
		gym.create("Appu Gym");
		gym.create("Hatric Hero Gym");
		
		
		boolean value=gym.read("Kiccha Gym");
		System.out.println(value);
		
		boolean value1=gym.ignoreCases("rocking gym");
		System.out.println(value1);
		
		boolean value2=gym.ignoreCasesAndSpaces("appugym");
		System.out.println(value2);
		
	}
}
