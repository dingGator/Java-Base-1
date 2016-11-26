package Question_10;

/**
 * Created by Ki on 11/18/2016.
 */

interface Gadget {
    void doStuff();
}

abstract class Electronic {
    void getPower() {
        System.out.println("plug in ");
    }
}

public class Tablet extends Electronic implements Gadget {
    //Error:  access privelages of doStuff needs to be public
    void doStuff_not_public(){
            System.out.println("doStuff_not_public:  show book");}

    public void doStuff() {
        System.out.println("show book");
    }

    public static void main(String[] args) {


        new Tablet().getPower();
        new Tablet().doStuff();

        System.out.println("\n***** if instantiate: \n");
        System.out.println("   Tablet tablet1 = new Tablet();\n");


        Tablet tablet1 = new Tablet();
        tablet1.doStuff();
        tablet1.doStuff_not_public();

    }

}
