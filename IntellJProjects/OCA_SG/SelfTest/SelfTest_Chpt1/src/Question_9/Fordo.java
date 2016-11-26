package Question_9;

/**
 * Created by Ki on 11/18/2016.
 */
public class Fordo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 7;
        int myGold_not_static = 8;
        System.out.println("***if  static int countGold(int x, int y) ");

        System.out.println("countGold(7,6):  " + countGold(7, 6));
        System.out.println("countGold(myGold,6):  " + countGold(myGold, 6));


        System.out.println("\n***** if instantiate: ");
        System.out.println("Fordo fordo = new Fordo();");


        Fordo fordo = new Fordo();
        System.out.println("fordo.countGold(7, 6)):  " + fordo.countGold(7, 6));
        System.out.println("fordo.countGold(myGold, 6)):  " + fordo.countGold(myGold, 6));


        System.out.println("fordo.countGold_not_static(8, 6)):  " + fordo.countGold_not_static(8, 6));
        System.out.println("fordo.countGold_not_static(myGold_not_static, 6)):  " + fordo.countGold_not_static(myGold_not_static, 6));
    }
}

class Hobbit {
    static int countGold(int x, int y) {
        return x + y;
    }

    ;

    // int countGold(int x, int y) {
    // not work because countGold not static: unless instantiate
    //Fordo fordo = new Fordo();


    int countGold_not_static(int x, int y) {
        return x + y;
    }

    ;

}

