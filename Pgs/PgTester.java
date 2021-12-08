package com.xworkz.Dao.Pgs;

public class PgTester {
	
	public static void main(String[] args) {
		
		PgDao pg=new PgDao();
		pg.create("Diamond Villa");
		pg.create("Silver Villa");
		pg.create("Golden villa");
		pg.create("Annapoorna pg");
		
		
		boolean found=pg.read("Diamond Villa");
		System.out.println(found);
		
		
		boolean found1=pg.caseSensitive("diamond villa");
		System.out.println(found1);
		
		boolean found2=pg.caseSensitiveAndTrimmed("Golden Villa");
		System.out.println(found2);
		
	}

}
