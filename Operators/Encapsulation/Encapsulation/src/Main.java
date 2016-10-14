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

        System.out.println("********player************");
        Player player = new Player();
        player.fullname = "Tim";
        player.health = 20;
        player.weapon = "Sword";
        // TODO code application logic here
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "
                + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = "
                + player.healthRemaining());

        System.out.println("******Enhanced*player  1************");
        EnhancedPlayer player1 = new EnhancedPlayer("Tim1",
                50, "Sword1");
        System.out.println("Initial health is " + player1.getHealth());
        System.out.println("******Enhanced*player  2************");
        EnhancedPlayer player2 = new EnhancedPlayer("Tim2",
                200, "Hammer");
        System.out.println("Initial health is " + player2.getHealth());

        System.out.println("******Encapsulation Challenge************");
        //printer class
        //fields: toner level,pager printed, duplex printer
        //methods: fill toner,print page
        System.out.println("****Printer printer1 = new Printer(50,true);");
        Printer printer1 = new Printer(50, true);
        System.out.println("initial page count = "
                + printer1.getPagesPrinted());
        int pagesPrinted = printer1.printPages(4);
        System.out.println("Pages printed was "
                + pagesPrinted + " new total print count for printer = "
                + printer1.getPagesPrinted());
        pagesPrinted = printer1.printPages(2);
        System.out.println("Pages printed was "
                + pagesPrinted + " new total print count for printer = "
                + printer1.getPagesPrinted());
        System.out.println("**** Printer printer2 = new Printer(50,false);");

        Printer printer2 = new Printer(50, false);
        System.out.println("initial page count = "
                + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was "
                + pagesPrinted + " new total print count for printer = "
                + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was "
                + pagesPrinted + " new total print count for printer = "
                + printer2.getPagesPrinted());
    }

}
