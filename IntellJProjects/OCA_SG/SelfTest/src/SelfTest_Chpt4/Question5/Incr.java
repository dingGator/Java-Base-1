package SelfTest_Chpt4.Question5;

/**
 * Created by Ki on 1/8/2017.
 */
public class Incr {
    public static void main(String[] args) {
        Integer x =7;
        int y =2;
        x *= x;
        System.out.println(" x = "+x+" y = "+y);
        y *=y ;
        System.out.println(" x = "+x+" y = "+y);
        y *= y;
        System.out.println(" x = "+x+" y = "+y);
        x -=y;

        System.out.println(" x = "+x+" y = "+y);
        System.out.println(x);
    }
}
