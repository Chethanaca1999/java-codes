class LibraryDTO1
{
public static void main(String a[])
{
LibraryDTO lib=new LibraryDTO();
lib.setBookName("life of 2100");
lib.setAuthour("CHETHANA CA");
lib.setPages(100);


System.out.println(lib.getBookName()+"\n"+lib.getAuthour()+"\n"+lib.getPages());
}
}