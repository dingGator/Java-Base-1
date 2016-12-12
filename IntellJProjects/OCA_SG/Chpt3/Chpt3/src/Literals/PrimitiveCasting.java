package Literals;

import static Literals.VariablesList.a;

/**
 * Created by Ki on 12/11/2016.
 */
public class PrimitiveCasting {
    static int a2 =100;
    static long b2 =a2;  // implicity cast
    static float a3 = 100.001f;
    static int b3 =(int)a3;  // explicit cast
    static double  d =100L;  // implicit cast

    public static void main(String[] args) {
        System.out.println("\n a2 = " + a2 +
                "\n b2 = " + b2 +
                "\n a3 = " + a3 +
                "\n b3 = " + b3 +
                "\n d = " + d );
    }
}
