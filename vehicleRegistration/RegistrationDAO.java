package com.xworkz.Dao.vehicleRegistration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegistrationDAO {

	
Collection<String > col=new ArrayList<>();

public boolean add(String tempno)
{
	return col.add(tempno);
}
public boolean read(String no)
{
	return col.contains(no);
}

public boolean findByCaseSensitive(String no)
{
	Iterator<String> it1=col.iterator();
	while(it1.hasNext())
	  {
		 String tempNo=it1.next();
		 if(tempNo.equalsIgnoreCase(no))
{
			 System.out.println("The Vehicle No is" + "  " +tempNo );
return true;		

		 }
		 
	  }
	 
	 return false;
	

}


public boolean findByCaseSensitiveAndTrimmed(String no)
{
	Iterator<String > it1=col.iterator();
	while(it1.hasNext())
	{
		String value=it1.next();
		value=value.replace(" ", "");
		
		if(value.equals(no))
		{
			System.out.println(value);
			return true;
		}
	}
	return false;
}
}
