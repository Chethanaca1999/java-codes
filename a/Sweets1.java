class Sweets1
{
public static void main(String a[])
{
Sweets sw=new Sweets();
sw.sweetType="bakery sweet";
sw.sweetName="peda";
sw.quantity=100;
System.out.println(sw.sweetType+"       "+sw.sweetName+"   "+sw.quantity);
sw.eat();
}
}