package Obj6_Constructor;

/**
 * Created by Ki on 12/1/2016.
 */
public class Foo {
    int size;
    String name;
        // initialize instance variable


    public Foo(String name, int size) {
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }

    public int getSize() {

        return size;
    }
}
