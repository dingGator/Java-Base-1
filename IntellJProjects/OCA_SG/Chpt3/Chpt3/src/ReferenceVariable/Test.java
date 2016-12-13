package ReferenceVariable;

/**
 * Created by Ki on 12/12/2016.
 */
public class Test {
    public static void main(String[] args) {
        Foo reallyABar = new Bar();
        //legal bcs Bar is a subclass of Foo
        //Bar reallyAFoo = new Foo();
        // illegal bcs Foo is not a subclass of Bar
        Long x = new Long(42);
        Short s = new Short("57");
        System.out.println( " x = " + x + " s = " + s);

    }
}
