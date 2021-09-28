class Speaker
{
static String name="Boat";
static int minVolume=0;
static int maxVolume=6;
static boolean isConnected=false;
static int currentVolume;
 public static boolean onOrOff()
{
if(isConnected==false)
{
isConnected=true;
return isConnected;
}
else if(isConnected==true)
{
isConnected=false;

}
return isConnected;
}
public static void increaseVolume()
{
if(isConnected)
{
if(currentVolume<maxVolume)
{
currentVolume=currentVolume+1;
System.out.println(currentVolume);
}
else
{
System.out.println("max volume reached");
}
}
}
public static void decVolume()
{
if(isConnected)
{
if(currentVolume>minVolume)
{
currentVolume=currentVolume-1;
System.out.println(currentVolume);
}
else
{
System.out.println("minimum vlue reached");
}
}

}


}