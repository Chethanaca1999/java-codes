class Ncr
{
public static void main(String a[])
{

int ncr=fact(5)/(fact(2)*fact(5-2));
System.out.println(ncr);
}




public static int fact(int num)
{

int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;


}

return fact;
}
}
