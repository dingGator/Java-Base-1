package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Baz {
    static int count =57;
    static void woo(){
        System.out.println("Baz woo()");
    }
    static void doMore(){
        // static method can access a static method or variable
        System.out.println("Baz doMore()  woo()");
        woo();
        int x = count;
        System.out.println("Baz doMore() count  "+count);
        System.out.println("Baz doMore()  x  " + x);

    }
}
