class Transportation
{
String transportationVehicle;
String transportedFrom;
String transportedTo;
String items[]={"vegetables","fruits","oil","grass"};

public Transportation()
{
this("truck","karnataka","tamilnadu");
System.out.println("default constructor is created");
}

public Transportation(String transportationVehicle,String transportedFrom,String transportedTo)
{
this.transportationVehicle=transportationVehicle;
this.transportedFrom=transportedFrom;
this.transportedTo=transportedTo;
}

public void display()
{
System.out.println(  transportationVehicle+"\n"+transportedFrom+"\n"+transportedTo);
}

public void get()
{
for(int i=0;i<items.length;i++)
{
System.out.println(items[i]);
}
}
}
