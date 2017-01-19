package ForLoop;

/**
 * Created by Ki on 1/18/2017.
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }
        System.out.println("*************************");

        for (int x = 10, y = 3; y < 6; x++, y++) {
            System.out.println("two variables x= " + x + " y= " + y);
        }
        System.out.println("*************************");

        for (int x = 1; x < 2; x++) {
            System.out.println("x = " + x);
        }
        //  System.out.println(x);   /// illegal bcs x is now out of scope
        System.out.println("*************************");
        for (int x = 0, y = 5; ((((x < 10) && (y-- > 2)) | x == 3)); x++) {
            System.out.println("x = " + x + " y = " + y);
        }
        //  for (int x =0, y=0;(x>5), (y<2);x++)  // illegal only one test expression allow
        System.out.println("*************************");

        for (int x = 0; x < 1; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("*************************");
        doStuff();
        System.out.println("*************************");
/*
        for (;;){
            System.out.println("inside endless loop");
        }
*/

        int i = 0;
        for (; i < 10; ) {
            i++;
            System.out.println(" inside loop i = " + i);
        }
    }

    static boolean doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            return true;
        }
        return true;
    }
}
