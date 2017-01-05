package ExamWatch;

/**
 * Created by Ki on 1/4/2017.
 */
public class B extends A {
    public static void main(String[] args) {


        A a = new A();
        B b = new B();

        if (a instanceof Foo) {
            System.out.println("a instanceof Foo");
        }
        if (b instanceof A) {
            System.out.println("b instanceof A");
        }
        if (b instanceof Foo) {
            System.out.println("b instanceof Foo");
        
    }
}
