package Obj6_OverloadedConstructors;

/**
 * Created by Ki on 12/2/2016.
 */
public class InitError {
    static int[] x = new int[4];
    static {x[3] =5;}

    public static void main(String[] args) {
        System.out.println("InitError " + x[3]);
    }
}
