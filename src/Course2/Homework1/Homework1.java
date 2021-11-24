package Course2.Homework1;

import Course2.Homework1.obstacleCourse.*;
import Course2.Homework1.team.Team;
import Course2.Homework1.team.TeamMember;

public class Homework1 {

    public static void main(String[] args) {

        Course c = new Course(new Cross(5),new Jumping(2), new Fight(4), new Swimming(7));
        TeamMember t = new TeamMember("Max", 10);
        TeamMember d = new TeamMember("Dima", 6);
        TeamMember e = new TeamMember("Denis", 11);

        Team team =  new Team("champ",t, d, e);
        c.doIt(team);
        team.showResults();


    }
}
