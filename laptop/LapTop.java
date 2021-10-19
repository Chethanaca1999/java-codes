class LapTop
{
public LapTop()
{
System.out.println(this.getClass().getSimpleName()+"Object is created");
}

public int laptopId;
public String laptopName;
public HardDisk hardDisk;



public void setLaptopId(int laptopId)
{
this.laptopId=laptopId;
}

public void setLaptopName(String laptopName)
{
this.laptopName=laptopName;
}

public void setHardDisk(HardDisk hardDisk)
{
this.hardDisk=hardDisk;
}




public String toString()
{
return "LapTop------------[Lap Top Id is="+this.laptopId+",Lap Top Name is="+this.laptopName+",Hard disk is="+this.hardDisk+"]";
}
}