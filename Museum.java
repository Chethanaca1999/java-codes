class Museum
{
String name;
String place;
boolean isOpen;
String materials[]={"old  wooden dolls","farmers materials","animals skins","etc."};

public Museum()
{
this("indian karnatakian chikkamagalurian ajjampurian shivanian cheeranahallian chethans museum","cheeranahalli",false);
}

public Museum(String name,String place,boolean isOpen)
{
this.name=name;
this.place=place;
this.isOpen=isOpen;
}

public void get()
{
System.out.println(name+"\n"+place+"\n"+isOpen);

}

public void display()
{
for(int i=0;i<materials.length;i++)
{
System.out.println(materials[i]);
}
}
} 