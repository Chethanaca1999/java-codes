package com.xworkz.vivos1;
import com.xworkz.dto.*;
import java.util.Scanner;

public class VivoTester {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		Vivo vi=new Vivo(size); 
		
		for(int i=0;i<size;i++)
		{
			MobileDTO mobi=new MobileDTO();
			
			System.out.println("Enter rhe mobile id");
			int id=sc.nextInt();
			mobi.setMobileId(id);
			
			System.out.println("Enter the mobile name");
			String name=sc.next();
			mobi.setMobileName(name);
			
			System.out.println("enter the cost of the mobile");
			double cost=sc.nextDouble();
            mobi.setCost(cost);
            
            
            
            //Memory dto
            
            MemoryDTO mem=new MemoryDTO();
            System.out.println("Enter the id of  the memory");
            int memoryid=sc.nextInt();
            mem.setMemoryId(memoryid);
            
            System.out.println("Enter the capacity of the memory");
             String capacity=sc.next();
             mem.setCapacity(capacity);
             
             //ApplicationDTO
             
             ApplicationDTO appli=new ApplicationDTO();
           System.out.println("Enter the application Name");
           String apName=sc.next();
        	appli.setAppName(apName);
        	
        	System.out.println("Enter the application id");
        	int Appid=sc.nextInt();
        	appli.setAppId(Appid);
        	//DataDTO
        	DataDTO data=new DataDTO();
        	System.out.println("Enter the brand name");
        	String bName=sc.next();
        	data.setBrandName(bName);
        	
        	System.out.println("Enter the process type");
        	String proc=sc.next();
        	data.setProcessor(proc);
        	
        	System.out.println("Enter rhe camera pixel");
             String cam=sc.next();
             data.setCamera(cam);
        	
             
             //relation ship
        	mobi.setMemory(mem);
        	mem.setApplication(appli);
        	appli.setData(data);
        	
            boolean isAdded=vi.createMobileDTO(mobi);
            System.out.println(isAdded);
            vi.getAllMobileDetails();
            
            
		}
		
		System.out.println("enter he id to print details");
		int id=sc.nextInt();
		System.out.println(vi.readDeatilsByMobileID(id));
		
		System.out.println("Enter the name to fetch the details");
		String name=sc.next();
		System.out.println(vi.readDetailsByName(name));
		
		//get details by entering the application name
		
		System.out.println("enter the application name");
		String aName=sc.next();
		System.out.println(vi.readdeatailsbyApplicationName(aName));
		
			
		}
		
		
	}

