class WatchTester
{
public static void main(String a[])
{
Watch wa=new Watch();
wa.setName("Rolex");
wa.setCost(5000.00);



Cell ce=new Cell();
ce.cellName="xxx";
ce.cost=120.00;


wa.setCell(ce);


System.out.println(wa);
}
}