import java.util.Scanner;
class ExamUtil
{
static String[] hallTicket = new String[3];
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the candiate Name");
String candidateName=sc.next();
System.out.println("Enter the candiate Usn");
String candidateUsn =sc.next();
System.out.println("Enter the subject Name");
String subjectName=sc.next();
hallTicket[0]=candidateName;
hallTicket[1]=candidateUsn;
hallTicket[2]=subjectName;

Exam.allow(hallTicket);

}
}