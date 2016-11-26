package Question_5_PkgB;

import Question_5_PkgA.Foo;

/**
 * Created by Ki on 11/18/2016.
 */
public class Baz_Extends_Foo extends Foo {
    public static void main(String[] args) {
        System.out.println("Baz_Extends_Foo in pkgB  extends Foo*****");

        Baz_Extends_Foo f_extends_Foo = new Baz_Extends_Foo();
        System.out.println("Baz_Extends_Foo f_extends_Foo = new Baz_Extends_Foo();");
        System.out.println("protected int b =6;   : " + f_extends_Foo.b);

        Foo f = new Foo();

        System.out.println("Foo f = new Foo();");
        System.out.println("public int c =7;  : " + f.c);
    }
}
