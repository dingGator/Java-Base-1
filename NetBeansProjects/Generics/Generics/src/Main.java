
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        // items.add("Tim");
        items.add(4);
        items.add(5);

        printDoubled(items);

        System.out.println("***** part 2 ******");
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addTeamPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        baseballTeam.addTeamPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Tampa Light");

        soccerTeam.addTeamPlayer(beckham);

        System.out.println("\n There are " + adelaideCrows.numTeamPlayers()
                + " players on the " + adelaideCrows.getTeamName());

        //Team<String> brokenTeam = new Team<>("This won't work");
        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");

        //    brokenTeam.addTeamPlayer("no-one");
        brokenTeam.addTeamPlayer(beckham);

        System.out.println("*************after broken team***** ");

        Team<FootballPlayer> melbourne = new Team("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addTeamPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team("Hawthorn");
        Team<FootballPlayer> fremantle = new Team("Fremantle");
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);
        //adelaideCrows.matchResult(baseballTeam, 1, 1);
        System.out.println("***Rankings******");
        System.out.println(adelaideCrows.getTeamName() + ": " + adelaideCrows.teamRanking());
        System.out.println(melbourne.getTeamName() + ": " + melbourne.teamRanking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.teamRanking());
        System.out.println(hawthorn.getTeamName() + ": " + hawthorn.teamRanking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));

        System.out.println("*******hawthorn.compareTo(adelaideCrows)1****");

        System.out.println(hawthorn.compareTo(adelaideCrows));

        System.out.println("*******hawthorn.compareTo(adelaideCrows)2****");

        System.out.println(melbourne.compareTo(fremantle));

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }

}
