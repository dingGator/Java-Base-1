package Chpt6.Question12;

/**
 * Created by Ki on 1/24/2017.
 */
public class Zeta {
    public static void main(String[] args) {
        int x = 1;
        if ((4 > x) ^ ((++x + 2) > 3)) x++;
       System.out.println("x in step 1 = " + x);
        //boolean b = (++x + 2) > 3;
        //System.out.println(" b = " + b+"\n x in step 2 = " + x);

        if ((4 > ++x) ^ !(++x == 5)) x++;
        System.out.println("x in step 3 = " + x);
    }
}
