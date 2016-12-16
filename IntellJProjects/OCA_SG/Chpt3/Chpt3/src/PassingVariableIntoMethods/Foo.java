package PassingVariableIntoMethods;

/**
 * Created by Ki on 12/14/2016.
 */
public class Foo {
    static String name = " sofie";

    public Foo() {
        bar();

        setName("boo");
    }

    void bar() {
        doStuff();
        System.out.println("bar");

    }

    void doStuff() {
        System.out.println("doStuff ");

        setName("Boo");

    }

    void setName(String boo) {
        name = boo;
    }

    public static void main(String[] args) {
        System.out.println("  main");
        System.out.println(" name = " + name);
        Bar bar1 = new Bar();
        bar1.barIn();
        Foo foo1 = new Foo();

    }
}
