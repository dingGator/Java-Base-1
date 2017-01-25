package Chpt6.Question11;

/**
 * Created by Ki on 1/24/2017.
 */
public class Question11 {
    public static void main(String[] args) {
        String d = "aiko ";
        d += d;
        d += "ahanay ";
        String a = d.concat("shockanal ");
        System.out.println("a = "+ a);
        String b = d.toUpperCase();
        System.out.println("b = "+b);
        System.out.println("d = " +d);

    }
}
