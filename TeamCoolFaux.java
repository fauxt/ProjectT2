//package Project00;

import java.util.*;
//import Project00.Team;
//import Project00.Member;


public class TeamCoolFaux extends Team
{
    public TeamCoolFaux(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new McCoolMember("Caelin Finn McCool"));
        //members.add(new FauxMember("Tim Faux"));
    }
}
