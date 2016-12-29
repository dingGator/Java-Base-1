package SelfTest_Chpt3.Question6;

import SelfTest_Chpt3.Question4.Mixer;

/**
 * Created by Ki on 12/28/2016.
 */
public class Mirror {
    int size = 7;

    public static void main(String[] args) {
        Mirror m1 = new Mirror();
        Mirror m2 = m1;
        int i1 = 10;
        int i2 = 11;
        go(m2, i2);
        System.out.println(m1.size + " " + i1);
    }

    static void go(Mirror m, int i) {
        m.size = 8;
        i = 12;
    }
}
