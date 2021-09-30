class SwiggyDTO1
{
public static void main(String a[])
{
SwiggyDTO swiggy=new SwiggyDTO();
swiggy.setFoodType("indian");
swiggy.setFoodName("mudde and bassaru");
swiggy.setQuantity("1 plate");


System.out.println(swiggy.getFoodType()+"\n"+swiggy.getFoodName()+"\n"+swiggy.getQuantity());
}
}