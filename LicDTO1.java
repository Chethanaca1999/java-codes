class LicDTO1
{
public static void main(String a[])
{
LicDTO lic=new LicDTO();
lic.setPolicyId(123456);
lic.setCustomerName("chethana c a");
lic.setYears(10);

System.out.println(lic.getPolicyId()+"\n"+lic.getCustomerName()+"\n"+lic.getYears());
}
}