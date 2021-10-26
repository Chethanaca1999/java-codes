package com.xworkz.vivos1;
import  com.xworkz.dto.*;

public class Vivo {

	 private MobileDTO[] mobile;
	 private int index;
	 public Vivo(int size)
	 {
		 mobile=new MobileDTO[size];
	 }
	 
	 
	 public boolean createMobileDTO(MobileDTO mobile)
	 {
		 boolean isAdded=false;
		 System.out.println("insisde the  createMobileDTO()");
		 if(mobile!=null)
		 {
			 this.mobile[index++]=mobile;
			 isAdded=true;
		 }
		 else
		 {
			 System.out.println("enter the details properly ");
			 
		 }
	 return isAdded;
	 
	 }
	 
	 public void getAllMobileDetails()
	 {
		 for(int i=0;i<mobile.length;i++)
		 {
			 System.out.println(mobile[i]);
			 
		 }
	 }
	 
	 
	 // get the details by mobile id
	 
	 public MobileDTO readDeatilsByMobileID(int id)
	 {
		 MobileDTO mobile1=null;
		 if(id!=0)
		 {
			 for(int i=0;i<mobile.length;i++)
			 if(mobile[i].getMobileId()==id)
			 {
				 System.out.println("id will be founded");
				 
				mobile1=mobile[i];
				 
				 
			 }
			 else
			 {
				 System.out.println("id can't find");
			 }
			
		 } return mobile1;
	 }
	 
	 public MobileDTO readDetailsByName(String name)
	 {
		 MobileDTO mobi2=null;
		 System.out.println("inside read details by name method");
		 if(name!=null)
		 {
			 for(int i=0;i<mobile.length;i++)
			 {
				 if(mobile[i].getMobileName().equals(name))
				 {
					 System.out.println("Name will be founded");
					 mobi2=mobile[i];
				 }
			 
				 else{
					 System.out.println("Name not found");
				 }
			 }
		 }
				 return mobi2;
				 
				 }
	 //Application name using fetch deatils
	 
	 public MobileDTO readdeatailsbyApplicationName(String name)
	 {
		 MobileDTO mobi3=null;
		 System.out.println("inside read details details by application id");
		 
		 if(name!=null){
			 for(int i=0;i<mobile.length;i++)
			 {
				 if(mobile[i].getMemory().getApplication().getAppName().equals(name))
				 {
					 System.out.println("Application Name found");
					 mobi3=mobile[i];
				 }
				 else
				 {
					 System.out.println("Application Name not found");
				 }
			 }
				 
		 }
		 return mobi3;
	 }
			 }
		 
		 
	 
	 

