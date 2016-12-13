package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */
public class StringTest {
    public static void main(String[] args) {
        String x = "Java";
        String y = x;
        System.out.println("  x String = " + x +
                "\n  y String = " + y);

        x = x + " Bean";
        System.out.println(" after change:  x = x + \" Bean\"; ");
        System.out.println("  x String = " + x +
                "\n  y String = " + y +  " y String not changed WOW " +
            "\n after x change LOCAL variable ");

        String s = "Fred";
        String t =s;
        String tToUpperCase = t.toUpperCase();
        // has to have a variable to catch the uppercase
        System.out.println("  s = " +s +
                "\n  t = " +t +
                "\n tToUpperCase = " + tToUpperCase);


    }
}
