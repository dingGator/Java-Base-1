package Final1_25.Question1;

/**
 * Created by Ki on 1/25/2017.
 */
public class Knowing {
    static final long tooth = 343L;
    static long doIt(long tooth){
        System.out.println(++tooth + " doIt ");
        return ++tooth;
    }

    public static void main(String[] args) {
        System.out.println(tooth + " main ");
        final long tooth = 340L;
        new Knowing().doIt(tooth);
        System.out.println(tooth);
    }
}
