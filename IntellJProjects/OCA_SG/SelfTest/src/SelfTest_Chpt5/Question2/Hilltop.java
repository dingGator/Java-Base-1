package SelfTest_Chpt5.Question2;

/**
 * Created by Ki on 1/13/2017.
 */
public class Hilltop {
    public static void main(String[] args) {
        String[] horse = new String[5];
        horse[4] = null;
        for (int i = 0; i < horse.length; i++) {
            if (i < args.length)
                horse[i] = args[i];
            System.out.println(horse[i].toUpperCase() + " ");
        }

    }
}
