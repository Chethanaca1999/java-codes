public class CivilService
{
public CivilService()
{
System.out.println("Civil Service object is created");
}


private String type;
private int id;
private String name;


public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}

public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}


public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}

public String toString()
{
return "CivilService-[Civil Service Type="+this.type+",Civil Service Id="+this.id+",Civil Service Name="+this.name+"]";
}
}
