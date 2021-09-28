class ChatCentre12
{
String centreName;
String location;
int centreId;
boolean isOpen;
String items[]={"panipuri","masalapuri","belpuri"};

public ChatCentre12()
{
this("saiChats","near Dhobhi got",23,true);
System.out.println("chat centre object is created");
}

public ChatCentre12(String centreName,String location,int centreId,boolean isOpen)
{
this.centreName=centreName;
this.location=location;
this.centreId=centreId;
this.isOpen=isOpen;
}

public void displaychat()
{
System.out.println(this.centreName+"  "+this.location+"   "+this.centreId+" "+this.isOpen);
} 

public void getitems()
{
for(int i=0;i<this.items.length;i++)
{
System.out.println(this.items[i]);
}

}
}