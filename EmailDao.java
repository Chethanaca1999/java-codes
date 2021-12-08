package com.xworkz.interface1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class EmailDao {

	
	Collection<String> col=new ArrayList<String>();
	
	public boolean create(String mail)
	{
		return col.add(mail);
	}
	
	public boolean find(MailInterfa mai,String val)
	{
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			String val2=it.next();
			if(mai.searching(val2, val))
			{
				return true;
			}
		}return false;
		
		
		
		
	}
}
