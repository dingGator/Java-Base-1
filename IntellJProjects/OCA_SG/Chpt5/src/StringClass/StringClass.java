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
        x=x.concat(" Rules!");
        System.out.println("x = " + x);
        x.toUpperCase();
        System.out.println(" x = "+ x);
        x.replace( 'a', 'X');
        System.out.println("x = "+x);
        x.toLowerCase();
        System.out.println("x = "+x);
        x = x.toLowerCase();
        System.out.println("x = "+x);
        String s3 = "spring ";
        String s4 = s3 + "summer ";
        s3.concat("Fall ");
        s4.concat(s3);
        s3 += "winter ";
        System.out.println(s3 + " "+s4);
        String s5 = "abc";
        String s6 = new String("def");
        System.out.println("s5 = "+s5);
        System.out.println(" s6 = "+s6);
    }
}
