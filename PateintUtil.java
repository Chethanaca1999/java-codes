class PateintUtil
{
public static void main(String a[])
{
PateintDTO dto=new PateintDTO();

dto.setPateintId(1234567 );
dto.setPateintName("CSK fans");
dto.setAge(18);
dto.setBloodGroup("B+");
dto.setGender("Male");

System.out.println(dto.getPateintId()+" \n"+dto.getPateintName()+"\n"+dto.getAge()+"\n"+dto.getBloodGroup()+"\n"+dto.getGender());
}
}