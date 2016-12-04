package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Foo {
    int size =42;
    static int sizeStatic =55;
    static void doMore(){
        System.out.println(" Foo sizeStatic  " + sizeStatic);

        //Error: static method cannot
        // access an instance(non-static) variable
        // int x = size;

    }
}
