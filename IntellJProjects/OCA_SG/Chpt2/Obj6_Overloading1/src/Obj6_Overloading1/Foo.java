package Obj6_Overloading1;

/**
 * Created by Ki on 11/27/2016.
 */
public class Foo {
    public void doStuff(int y, String s) {
        System.out.println(" Foo: doStuff(int y, String s) :  y = [" + y + "], s = [" + s + "]");
    }

    public void moreThings(int x) {
        System.out.println(" Foo:   moreThings (int x) : x = [" + x + "]");
    }

    void doStuff1(){
        System.out.println(" Foo:  void doStuff1():  ");
    }
}
