public class GoldDTO
{
public GoldDTO()
{

System.out.println("object is created");
}

private String ownerName;
private String shopName;
private String typeOfGold;
private double weight;
private double cost;

public String getOwnerName()

{
return ownerName;
}
public void setOwnerName(String ownerName)
{
this.ownerName=ownerName;
}
public String getShopName()
{
return shopName;
}
public void setShopName(String shopName)
{
this.shopName=shopName;
}
public String getTypeOfGold()
{
return typeOfGold;
}
public void setTypeOfGold(String typeOfGold)
{
this.typeOfGold=typeOfGold;
}
public double getWeight()
{
return weight;
}
public void setWeight(double weight)
{
this.weight=weight;
}
public double getCost()
{
return cost;
}
public void setCost(double cost)
{
this.cost=cost;
}
@Override
public String toString()
{
return "GoldDTO1-ownerName="+this.ownerName+",shopName="+this.shopName+",typeOfGold="+this.typeOfGold+",weight="+this.weight+",cost="+this.cost+"";
}
}
