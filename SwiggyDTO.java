public class SwiggyDTO
{
public SwiggyDTO()
{
System.out.println("object is created");
}

private String foodType;
private String foodName;
private String quantity;

public String getFoodName()
{
return foodName;
}
public void setFoodName(String foodName)
{
this.foodName=foodName;
}

public String getFoodType()
{
return foodType;
}
public void setFoodType(String foodType)
{
this.foodType=foodType;
}


public String getQuantity()
{
return quantity;
}
public void setQuantity(String quantity)
{
this.quantity=quantity;
}
}
