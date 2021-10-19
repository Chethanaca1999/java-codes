class CurrencyTester
{
public static void main(String a[])
{
Currency cu=new Currency();
cu.setType("Indian Currency");
cu.setId(50);
cu.setMaxCurrencyValue(2000);
cu.setMinCurrencyValue(1);
System.out.println(cu);

}
}