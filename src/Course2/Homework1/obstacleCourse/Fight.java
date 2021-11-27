package Course2.Homework1.obstacleCourse;


import Course2.Homework1.team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}
