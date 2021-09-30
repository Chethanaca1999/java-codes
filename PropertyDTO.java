public class PropertyDTO
{
public PropertyDTO()
{
System.out.println("object is created");
}


private String type;
private String ownerName;
private String place;

public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}


public String getOwnerName()
{
return ownerName;
}
public void setOwnerName(String ownerName)
{
this.ownerName=ownerName;
}


public String getPlace()
{
return place;
}
public void setPlace(String place)
{
this.place=place;
}
}
