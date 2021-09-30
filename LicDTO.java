public class LicDTO
{
public LicDTO()
{
System.out.println("object is created");
}

private long policyId;
private String customerName;
private int years;


public long getPolicyId()
{
return policyId;
}
public void setPolicyId(long policyId)
{
this.policyId=policyId;
}


public String getCustomerName()
{
return customerName;
}
public void setCustomerName(String customerName)
{
this.customerName=customerName;
}

public int getYears()
{
return years;
}
public void setYears(int years)
{
this.years=years;
}
}