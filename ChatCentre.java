class ChatCentre
{
String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;
String items[]=new String[5];

public ChatCentre()
{
System.out.println("chat center object is created");
}

public ChatCentre(String centreName,String location,String items[],String ownerName,int centreId,boolean isOpen)
{
this.centreName=centreName;
this.location=location;
this.items=items;
this.ownerName=ownerName;
this.centreId=centreId;
this.isOpen=isOpen;
}

public void displayChatCent()
{
System.out.println(this.centreName+"    "+ this.centreId+"   "+this.location+"   "+this.isOpen);
}
public void getItems()
{
for(int i=0;i<items.length;i++)
{
System.out.println(items[i]);

}
}
}