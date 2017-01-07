package StringConcatenation;

/**
 * Created by Ki on 1/5/2017.
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String animal = "Gray " + " elephant";
        System.out.println("animal = " + animal);
        /*********************************************/
        String a = "String ";
        int b = 3;
        int c = 7;
        System.out.println(a + b + c);
        System.out.println(a + (b + c));
        /*********************************************/
        String s = "123";
        s +="45";
        s+= 67;
        System.out.println(s);
        /*********************************************/
        int b1 =2;
        System.out.println(" "+ b1 +3);
        System.out.println(b +3);

    }
}
