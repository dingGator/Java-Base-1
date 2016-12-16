package ShadowingVariables;

/**
 * Created by Ki on 12/15/2016.
 */
public class Foo {
    static int size =7;
    static void changeIt( int size){
        size = size+200;
        System.out.println("size in changIt is = " + size );


    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println("size = " + size);
        changeIt(size);
        System.out.println("size after changIt is  = " + size);
    }
}
