package SelfTest_Chpt5.Question1;

/**
 * Created by Ki on 1/13/2017.
 */
public class Mutant {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println("."+ sb+ ". ."+ s+ ".");
    }
}
