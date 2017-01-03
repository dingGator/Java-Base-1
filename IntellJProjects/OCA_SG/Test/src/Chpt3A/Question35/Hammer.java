package Chpt3A.Question35;

/**
 * Created by Ki on 1/2/2017.
 */
public class Hammer {
    public void hit(){
        Bleh b = new Bleh();
        System.out.print(b.a+" = b.a   ");
        b.say(8);
    }

    public static void main(String[] args) {
        new Hammer().hit();
    }
}
