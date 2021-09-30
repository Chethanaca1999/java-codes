class ProjectDTO1
{
public static void main(String a[])
{
ProjectDTO pro=new ProjectDTO();
pro.setProjectType("Electric Vehicle");
pro.setProjectName("Improving Efficiency Of An Electric Vehicle By Using Regenerative Braking System and PV Cells");
pro.setTeamMembers(4);
pro.setGuideName("MGB");


System.out.println(pro.getProjectType()+"\n"+pro.getProjectName()+"\n"+pro.getTeamMembers()+"\n"+pro.getGuideName());
}
}