package com.xworkz.Dao.iplTeams;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class IplDao {
	
	Collection<String> col=new ArrayList<String>();
	
	
	public boolean create(String name)
	{
		return col.add(name);
	}
	
	public boolean read(String name)
	{
		return col.contains(name);
	}
	
	public boolean ignoreCaseSentive(String name)
	{
		Iterator<String> itr = col.iterator();
		
		while(itr.hasNext())
		{
			String val=itr.next();
			if(val.equalsIgnoreCase(name))
			{
				System.out.println("the ipl team name is ="+"  " +val);
				return true;
			}
		}
		return false;
		
	 }
	
	public boolean ignoreCaseSensitiveAndSpaces(String name)
	{
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			String valu=it.next();
			valu=name.replace(" ", "");
			if(valu.equalsIgnoreCase(name))
			{
				System.out.println("inside ignoreCaseSensitiveAndSpaces method");
				return true;
			}
			
		}return false;
	}

}
