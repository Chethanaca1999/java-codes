public class PateintDTO
{
public PateintDTO()
{
System.out.println("object is created ");
}

private long pateintId;
private String pateintName;
private int age;
private String gender;
private String bloodGroup;

public long getPateintId()
{
return pateintId;
}
public String getPateintName()
{
return pateintName;
}
public String getGender()
{
return gender;
}
public int getAge()
{
return age;
}
public String getBloodGroup()
{
return bloodGroup;
}

public void setPateintId(long pateintId )
{
this.pateintId=pateintId;
}
public void setPateintName(String pateintName)
{
this.pateintName=pateintName;
}
public void setAge(int age)
{
this.age=age;
}
public void setBloodGroup(String bloodGroup)
{
this.bloodGroup=bloodGroup;
}
public void setGender(String gender)
{
this.gender=gender;
}
}
