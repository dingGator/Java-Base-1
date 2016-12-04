package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Baz {
    static int count;
    static void woo(){
        System.out.println("Baz woo()");
    }
    static void doMore(){
        System.out.println("Baz doMore  woo()");
        woo();
        int x = count;
        System.out.println("Baz doMore  int x = count" + x);

    }
}
