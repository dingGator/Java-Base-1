package StringClass;

/**
 * Created by Ki on 1/9/2017.
 */
public class StringClass {
    public static void main(String[] args) {

        String s = "abcdef";
        s = s.concat(" more Stuff");
        String s2 = s;
        System.out.println("s = " + s + "\n s2 = " + s2);
        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
        x.toUpperCase();
        System.out.println(" x = "+ x);
        x.replace( 'a', 'X');
        System.out.println("x = "+x);
    }
}
