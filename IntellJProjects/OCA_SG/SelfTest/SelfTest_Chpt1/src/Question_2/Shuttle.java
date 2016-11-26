package Question_2;

/**
 * Created by Ki on 11/16/2016.
 */
public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go();
    }

    void go() {
        blastOff();
        //Rocket.blastOff(); //line A
        System.out.println("  //Rocket.blastOff(); //line A \n  " +
                " will NOT COMPILE if line A is uncommented \n" +
                " because: Rocket.blastOff is private \n " +
                " thus Rocket.blastOff is not accessible \n" +
                " by the subclass Shuttle's method: go \n ");

    }

    private void blastOff() {
        System.out.println("sh-bang");
    }
}
