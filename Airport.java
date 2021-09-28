class  Airport
{
static  String[] airportName={"chethu","cac","virat","abd"};
static String[] airportPlaces={"shivani","ajjampura","tariker","chikkamagaluru"};
public static void main(String a[])
{
getairportName();
getairportPlaces();
}
public static String[] getairportName()
{
for(int i=0;i<airportName.length;i++)
{
System.out.println(airportName[i]);
}
return 	airportName;
}
public static String[] getairportPlaces()

{
for(int j=0;j<airportPlaces.length;j++)
{
System.out.println(airportPlaces[j]);
}
return airportPlaces;
}
}