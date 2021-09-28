class PetFor{
static String[] typeofPet={"homePet","wildpet"};
static String[] homePet={"cow","dog","cat","buffalo"};
static String[] wildPet={"tiger","lion","bear","cheeta"};



public static void main(String a[])
{
gettypeofPet();
gethomePet();
getwildPet();
}

public static void gettypeofPet()
{
for(int i=0;i<typeofPet.length;i++)
{

System.out.print(typeofPet[i]+"   ");
}
}
public static void gethomePet()
{
for(int j=0;j<homePet.length;j++)
{
System.out.print(homePet[j]+"      ");
}
}
public static void getwildPet()
{

for(int k=0;k<wildPet.length ;k++)
{
System.out.print(wildPet[k]+"    ");
}
}
}
