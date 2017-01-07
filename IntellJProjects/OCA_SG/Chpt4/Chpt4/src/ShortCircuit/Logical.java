package ShortCircuit;

/**
 * Created by Ki on 1/6/2017.
 */
public class Logical {
    public static void main(String[] args) {
        boolean b1 = false, b2 = false;
        boolean b3 = (b1== true) && (b2 = true); // b2 will be set to true
        System.out.println(b3 + " "+ b2);
    }
}
