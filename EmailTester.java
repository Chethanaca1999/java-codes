package com.xworkz.interface1;

public class EmailTester {

	public static void main(String[] args) {
		
		
		
		 EmailDao dao=new EmailDao();
		 
		 dao.create("chthnca@gmail.com");
		 dao.create("chethan@gmail.com");
		 dao.create("Vijaynm@gmail.com");
		 dao.create("tejusm@gmail.in");
		 
		 
		
		 
		 
       MailInterfa search=new SearchByCom();
       boolean boo=dao.find(search, "com");
       System.out.println("The Entered mail is end with com"+ "  "+"---->"+boo + "\n");
      // System.out.println(search);
       
       MailInterfa mail23=new SearchByMail();
       boolean boo1=dao.find(mail23, "chthnca@gmail.com");
       System.out.println("The Entered mail is there"+ "  "+"---->"+boo1 +"\n");
       //System.out.println(mail23);
       
       
       MailInterfa mail234=new SearchByIn();
       boolean boo2=dao.find(mail234, "tejusm@gmail.");
       System.out.println("The Entered mail is end with in"+ "  "+"---->"+boo2);
      
       
       
       
       
       
       
	}
}
