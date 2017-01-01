package Chpt3A.Question16;

/**
 * Created by Ki on 12/31/2016.
 */
public class Knowing {
    static final long tooth = 343L;
    static long doIt(long tooth){
        System.out.println(++ tooth + " 2 ");
        return ++tooth;
    }

    public static void main(String[] args) {
        System.out.println(tooth  +  " 1 ");
        final long tooth = 340L;
        new Knowing().doIt(tooth);
        System.out.println(tooth+ " 3");
    }
}
