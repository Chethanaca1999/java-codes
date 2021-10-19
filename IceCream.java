public class IceCream
{
public IceCream()
{
System.out.println("IceCream object is created");
}


private int iceCreamId;
private String iceCreamType;
private String iceCreamName;

public int getIceCreamID()
{
return iceCreamId;
}

public void setIceCreamId(int iceCreamId)
{
this.iceCreamId=iceCreamId;
}


public String getIceCreamType()
{
return iceCreamType;
}

public void setIceCreamType(String iceCreamType)
{
this.iceCreamType=iceCreamType;
}


public String getIceCreamName()
{
return iceCreamName;
}
public void setIceCreamName(String iceCreamName)
{
this.iceCreamName=iceCreamName;
}


public String toString()
{
return "IceCream=[iceCreamId="+this.iceCreamId+",iceCreamType="+this.iceCreamType+",iceCreamName="+this.iceCreamName+"]";
}
}