class Country
{
static String[] countryName={"INDIA","SRILANKA","NEPAL","BHUTHAN"};
static int[] noofStates={29,10,17,15};

public static void main(String a[])

{
getcountryName();
getnoofStates();}
 
public static void getcountryName()
{

for(int z=0;z<countryName.length;z++)
{
System.out.println(countryName[z]);}
}
public static void getnoofStates()
{
for(int z=0;z<noofStates.length;z++)
{
System.out.println(noofStates[z]);
}
}
} 






