public class Currency
{
public Currency()
{
System.out.println("Currency Object Is Created");
}

private String type;
private int id;
private int maxCurrencyValue;
private int minCurrencyValue;


public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}


public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}

public int getMaxCurrencyValue()
{
return maxCurrencyValue;
}
public void setMaxCurrencyValue(int maxCurrencyValue)
{
this.maxCurrencyValue=maxCurrencyValue;
}

public int getMinCurrencyValue()
{
return minCurrencyValue;
}
public void setMinCurrencyValue(int minCurrencyValue)
{
this.minCurrencyValue=minCurrencyValue;
}


public String toString()
{
return "Currency-[Type of Currency="+this.type+",Currency Id is="+this.id+",Maximum Currency Value Is ="+this.maxCurrencyValue+",Minimum Currency Value Is="+this.minCurrencyValue+"]";
}
}