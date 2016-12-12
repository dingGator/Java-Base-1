package Literals;

import static Literals.PrimitiveCasting.a2;
import static Literals.PrimitiveCasting.b2;

/**
 * Created by Ki on 12/11/2016.
 */
public class Casting {
    public static void main(String[] args) {
        //int x = 3957.229; // illegal
        int x2 = (int) 3957.229;
        long long2 = 56L;
        byte b2 = (byte) long2;
        System.out.println(" x2 = " + x2 +
                "\n long2 = " + long2+
                "\n b2 = " + b2
        );
    }
}
