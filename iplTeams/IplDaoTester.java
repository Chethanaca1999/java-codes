package com.xworkz.Dao.iplTeams;

public class IplDaoTester {
	public static void main(String[] args) {
		
		
		IplDao ipl=new IplDao();
		
		ipl.create("R C B");
		ipl.create("C S K");
		ipl.create("M I");
		ipl.create("K K R");
		ipl.create("K X1 P");
		ipl.create("D C");
		ipl.create("S R H");
		ipl.create("R R");
		
		boolean found=ipl.read("MI");
		System.out.println(found);
		
		boolean found1=ipl.ignoreCaseSentive("r c b");
		System.out.println(found1);
		
		
		boolean found2=ipl.ignoreCaseSensitiveAndSpaces("Rcb");
		System.out.println(found2);
		
	}

}
