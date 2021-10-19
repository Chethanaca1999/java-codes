class IceCreamTester
{
public static void main(String a[])
{
IceCream ice =new IceCream();
ice.setIceCreamId(1234);
ice.setIceCreamType("venilla");
ice.setIceCreamName("Cup Ice");
System.out.println(ice);


IceCream ice1=new IceCream();
ice1.setIceCreamId(4321);
ice1.setIceCreamType("cold");
ice1.setIceCreamName("Baked Ice");
System.out.println(ice1);
}
}