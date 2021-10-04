class EngineersTester
{
public static void main(String a[])
{
Mech me=new Mech();
me.branch="Mechanical engineering";
me.location="Tiptur";
me.fees=79000.00;
String en=me.college();
System.out.println(en);
me.display();

CS cs=new CS();
cs.branch="Computer Science";
cs.location="Tiptur";
cs.fees=79000.00;
cs.display();

Civil ci=new Civil();
ci.branch="Civil Engineering";
ci.location="Tiptur";
ci.fees=79000.00;
ci.display();

EC ec=new EC();
ec.branch="Electronics and communication";
ec.location="Tiptur";
ec.fees=79000.00;
ec.display();

EE ee=new EE();
ee.branch="Electronics and electrical";
cs.location="Tiptur";
cs.fees=79000.00;

cs.display();
}
}