class Watch
{
public Watch()
{
System.out.println(this.getClass().getSimpleName()+"object is created");

}

public String name;
public double cost;
public Cell cell;


public void setName(String name)
{
this.name=name;
}

public void setCost(double cost)
{
this.cost=cost;
}


public void setCell(Cell cell)
{
this.cell=cell;
}





public String toString()
{
return "Watch------------[Watch Name is="+this.name+",Watch cost is="+this.cost+",Cell is="+this.cell+"]";
}
}



