class Factorial
{
public static void main(String a[])
{
factor(4);
}
public static void factor(int num)
{
int fact=1;
for(int i =1;i<=num;i++)
{
fact=fact*i;
}

System.out.println(fact);
}
}
