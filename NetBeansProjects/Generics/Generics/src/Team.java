
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ki
 */
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String teamName;
    int teamPlayed = 0;
    int teamWon = 0;
    int teamLost = 0;
    int teamTied = 0;

    private ArrayList<T> teamMembers = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addTeamPlayer(T teamPlayer) {
        if (teamMembers.contains(teamPlayer)) {
            //    System.out.println(((Player)teamPlayer).getPlayerName() + " is already on this team");
            System.out.println(teamPlayer.getPlayerName() + " is already on this team");

            return false;
        } else {
            teamMembers.add(teamPlayer);
            //System.out.println(((Player)teamPlayer).getPlayerName() +" picked for team " + this.teamName);

            System.out.println(teamPlayer.getPlayerName() + " picked for team " + this.teamName);
            return true;
        }
    }

    public int numTeamPlayers() {
        return this.teamMembers.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            teamWon++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            teamTied++;
            message = " drew with ";
        } else {
            teamLost++;
            message = " lost to ";
        }
        teamPlayed++;
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int teamRanking() {
        return teamWon * 2 + teamTied;
    }

    @Override
    public int compareTo(Team<T> team) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (this.teamRanking() > team.teamRanking()) {
            return -1;
        } else if (this.teamRanking() < team.teamRanking()) {
            return 1;
        } else {
            return 0;
        }
    }

}
