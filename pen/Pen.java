class Pen
{
public Pen()
{
System.out.println(this.getClass().getSimpleName()+"Object is created");
}

public int penId;
public String penName;
public Rifel rifel;



public void setPenID(int penId)
{
this.penId=penId;
}

public void setPenName(String penName)
{
this.penName=penName;
}

public void setRifel(Rifel rifel)
{
this.rifel=rifel;
}




public String toString()
{
return "Pen------------[pen Id is="+this.penId+",pen Name is="+this.penName+",Rifel is="+this.rifel+"]";
}
}