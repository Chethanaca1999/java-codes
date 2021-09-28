class Exam
{
public static String universityName="VTU";
public static String[] hallTicket={"Chethana c a","1KI17ME004","KIT TIPTUR"};
public static int fees=1250;
public static boolean allow(String[] hallTicket)
{
boolean allowedToWriteExam=false;
if(fees>1000)
{
if(hallTicket !=null)
{
allowedToWriteExam=true;
getHallTicket(hallTicket);
return allowedToWriteExam;
}
}
else
{
System.out.println("macha neen badukbeka     please pay the fees");
}
return allowedToWriteExam;
}
public static void getHallTicket(String[]hallTicket)
{
for(int i=0;i<hallTicket.length;i++)

{
System.out.println(hallTicket[i]);
}
}
}
