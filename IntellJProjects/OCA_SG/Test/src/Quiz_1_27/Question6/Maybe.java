package Quiz_1_27.Question6;

/**
 * Created by Ki on 1/27/2017.
 */
public class Maybe {
    public static void main(String[] args) {
        boolean b1= true;
        boolean b2 = false;
        System.out.print(!false ^ false);
        System.out.print(" line 6 = "+ (!b1 & (b2 = true)));
        System.out.println(" line 7 = "+ (b2 ^ b1));
    }
}
