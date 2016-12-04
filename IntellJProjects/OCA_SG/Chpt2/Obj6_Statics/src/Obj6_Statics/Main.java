package Obj6_Statics;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Foo foo = new Foo();

        System.out.println("***Main Foo foo.doMore()   ");
        foo.doMore();

        System.out.println("***Main Bsr Foo.doMore()   ");

        Foo.doMore();

        Bar bar = new Bar();

        System.out.println("***Main bar.go()   ");

        bar.go();

        System.out.println("***Main Bsr bar.goStatic()   ");

        bar.goStatic();

        System.out.println("***Main Bsr bar.doMore()   ");
        bar.doMore();


        Baz baz = new Baz();

        System.out.println("***Main Bsr baz.woo()   ");
        baz.woo();

        System.out.println("***Main Bsr baz.doMore()   ");

        baz.doMore();
        System.out.println("***Main Dog dog.doStuff()   ");

        Dog dog = new Dog();
        dog.doStuff();

        }

    }

