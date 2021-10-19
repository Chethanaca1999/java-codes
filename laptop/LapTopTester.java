class LapTopTester
{
public static void main(String a[])
{
LapTop lap=new LapTop();

lap.setLaptopId(124);
lap.setLaptopName("Dell");


HardDisk hard =new HardDisk();
hard.name="canon";
hard.memory="2 TB";

lap.setHardDisk(hard);

System.out.println(lap);
}

}
