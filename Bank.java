package com.xworkz.bank;

public class Bank {
	
	public static ICard getCard(String type)
	{
		if(type.equals("CanaraCard"))
		{
			return new Canara();
			
		}
		else if(type.equals("StateCard"))
		{
			return new State();
		}
		else
		{
			System.out.println("card not  found");
		}
		return null;
		
	}

}
