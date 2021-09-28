import java.util.Scanner;

class Exam11
{
public static String universtyName="VTU";
public static int fees=125;

public static void allow( String[]  hallTicket)
{
if(hallTicket!=null)
{
System.out.println("hall ticket given");
}
else
{
System.out.println("hall ticket not given");
}
}


public static void allow(int fees)
{
if(fees>100)
{
System.out.println("allowed for exam");
}
else
{
System.out.println("loude fees pay maadu");
}
}



public static void main(String a[])
{
System.out.println("enter ur name");
String urName=sc.next();
Exam11.allow(1000);
Exam11.allow(a);

}

}
