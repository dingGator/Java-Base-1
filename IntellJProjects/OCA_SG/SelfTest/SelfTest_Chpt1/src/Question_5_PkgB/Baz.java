package Question_5_PkgB;

import Question_5_PkgA.*;

/**
 * Created by Ki on 11/17/2016.
 */
//public class Baz extends Foo{
public class Baz {
    public static void main(String[] args) {
        System.out.println("Baz in PkgB *****");

        Foo f = new Foo();
        // error: default variable:  a cannot be access from outside package

        //  System.out.println("  int a =5;  " +f.a);

        // error: protected variable: b cannot be access from outside package

        // System.out.println(" protected int b =6; " +f.b);

        System.out.println("public int c =7; : " + f.c);


    }
}
