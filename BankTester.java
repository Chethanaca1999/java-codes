package com.xworkz.bank;
import java.util.Scanner;
public class BankTester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  card name");
	ICard card= Bank.getCard(sc.next());
	if(card!=null)
	{
	card.cSwipe();	
	}
	
	
}
}
