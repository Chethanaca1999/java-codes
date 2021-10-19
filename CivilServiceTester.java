class CivilServiceTester
{
public static void main(String a[])
{
CivilService civil=new CivilService();
civil.setType("Education");
civil.setId(1234);
civil.setName("Schools and colleges");
System.out.println(civil);


CivilService civil1=new CivilService();
civil1.setType("Security");
civil1.setId(100);
civil1.setName("Army and police");
System.out.println(civil);



}
}
