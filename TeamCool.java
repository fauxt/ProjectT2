package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;


public class TeamCool extends Team
{
    public TeamCool(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new Member("Greg Schaper"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
