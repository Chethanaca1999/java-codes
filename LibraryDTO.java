public class LibraryDTO
{
public LibraryDTO()
{
System.out.println("object is created");
}

private String bookName;
private String authour;
private int pages;

public String getBookName()
{
return bookName;
}
public void setBookName(String bookName)
{
this.bookName=bookName;
}

public String getAuthour()
{
return authour;
}
public void setAuthour(String authour)
{
this.authour=authour;
}

public int getPages()
{
return pages;
}
public void setPages(int pages)
{
this.pages=pages;
}
}