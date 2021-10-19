public class Jobs

public Jobs()
{
System.out.println(this.getClass().getSimpleName()+"Object is Created");
}

private String type;
private String name;
private double minLPA;
private double maxLPA;


public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}



public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}



public double getMaxLPA()
{
return maxLPA;
}
public void setMaxLPA(double maxLPA)
{
this.maxLPA=maxLPA;
}



public double getMinLPA()
{
return minLPA;
}
public void setMinLPA(double minLPA)
{
this.minLPA=minLPA;
}


public String toString()
{
return "JOBS----[Type OF Job="+this.type+",Job Name="+this.name+",Maximum Salary perYear="+this.maxLPA+",Minimum Salary per Year="+this.minLPA+"]";
}
}
