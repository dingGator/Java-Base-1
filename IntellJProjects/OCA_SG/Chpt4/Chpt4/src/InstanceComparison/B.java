package InstanceComparison;

import static com.sun.xml.internal.fastinfoset.stax.events.EmptyIterator.instance;

/**
 * Created by Ki on 1/4/2017.
 */
public class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);

        B b =  new B();
        if (b instanceof Object){
            System.out.println("b is definitely an Object");
        }
    }
    public static void m2(A a){
        if(a instanceof B)
            ((B)a).doBstuff();
    }

    public static void doBstuff() {
        System.out.println(" 'a' refers to a B");

    }
}
