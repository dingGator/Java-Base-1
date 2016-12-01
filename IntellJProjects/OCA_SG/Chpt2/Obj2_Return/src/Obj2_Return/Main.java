package Obj2_Return;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alpha alpha = new Alpha();
        System.out.println(" ***alpha.doStuff('a')"+ alpha.doStuff('a'));
        Beta beta = new Beta();
        System.out.println(" ***beta.doStuff('b')"+ beta.doStuff('b'));

        Foo foo = new Foo();
        System.out.println("*** foo.go()");
                foo.go();
    }
}
