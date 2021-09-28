class Metro
{
public String city;
public String name;
public String junctionName;
public int id;
public boolean isRunning;

public Metro()
{
this("Bangalore","Namma Metro","Majestic",234,true);
}

public Metro(String city,String name,String junctionName,int id,boolean isRunning)
{
this.city=city;
this.name=name;
this.junctionName=junctionName;
this.id=id;
this.isRunning=isRunning;
}

public void display()
{
System.out.println(city+"\n"+name+"\n"+junctionName+"\n"+id+"\n"+isRunning);
}
}

