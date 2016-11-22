package other;

import certification.Parent;

/**
 * Created by Ki on 11/7/2016.
 */
class Child extends Parent {
    static public void main(String[] args) {
        Child sc = new Child();
        sc.testIt();
    }

    public void testIt() {
        System.out.println("x is " + x);
        Parent p = new Parent();
       // System.out.println(" x in parent is " + p.x); // protected so error
        //  System.out.println(" y in parent is "+ p.y); // default so error
        //System.out.println(" z in parent is "+ p.z); // private so error
        System.out.println(" a in parent is "+ p.a); // public NO error

    }
}
