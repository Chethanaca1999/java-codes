class Bank
{
public static String bankName="CORPORATION";
public static int age=19;
public static void allow(String[] document)
{
if(age>18)
{
System.out.println("show your document");
if(document!=null)
{
getDocumentDetails(document);
System.out.println("you are eligible for home loan");
}
else
{
System.out.println("you are not eligible for home loan");
}
}
else
{
System.out.println("ayyo loude nimma appanna karkond ba");
}
}
public static void getDocumentDetails(String[] document)
{
for(int i=0;i<document.length;i++)
{
System.out.println(document[i]);
}
}
}