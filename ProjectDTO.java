public class ProjectDTO
{
public ProjectDTO()
{
System.out.println("object i s created");
}

private String projectType;
private String projectName;
private int teamMembers;
private String guideName;

public String getProjectType()
{
return projectType;
}
public void setProjectType(String projectType)
{
this.projectType=projectType;
}


public String getProjectName()
{
return projectName;
}
public void setProjectName(String projectName)
{
this.projectName=projectName;
}


public int getTeamMembers()
{
return teamMembers;
}
public void setTeamMembers(int teamMembers)
{
this.teamMembers=teamMembers;
}


public String getGuideName()
{
return guideName;
}
public void setGuideName(String guideName)
{
this.guideName=guideName;
}
}
