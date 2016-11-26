package Question_5_PkgA;

/**
 * Created by Ki on 11/18/2016.
 */
public class Baz_inPkgA {
    public static void main(String[] args) {
        System.out.println("Baz_inPkgA *****");

        Foo f = new Foo();
        System.out.println("Foo f = new Foo();");
        System.out.println("default   int a =5; : " + f.a);

        System.out.println("protected int a =6; : " + f.b);

        System.out.println("public int c =7;  : " + f.c);


    }
}
