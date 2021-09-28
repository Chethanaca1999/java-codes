 //  Method overloading


class AmazonPrime
{
static String movies[]={"kannada","kiccha","robert","kgf"};

static String series[]={"a1","a2"}; 
static String movie="Dia";
static String  series1="Hostel Daze";
public static void main(String a[])
{
System.out.println("main method started");
getMovies(movies);
getSeries(series);
String mov=getMovies(movie);
System.out.println(mov);
String ser=getSeries(series1);
System.out.println(ser);
}
public static void getMovies(String[] movies)
{
for(int i=0;i<movies.length;i++)
{
System.out.println(movies[i]);
}
} 
public static String getMovies(String movie)
{
return movie;
}
public static void getSeries(String[] series)
{
for(int j=0;j<series.length;j++)
{
System.out.println(series[j]);
}
} 
public static String getSeries(String series1)
{
return series1;
}
}
