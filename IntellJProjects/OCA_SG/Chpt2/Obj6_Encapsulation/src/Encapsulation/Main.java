package Encapsulation;

/**
 * Created by Ki on 11/19/2016.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Box box = new Box();
        //box.size = 2;  encapsulated
        // so has to use setter and getter
        box.setSize(2);
        System.out.println(" box.getSize " +box.getSize());
        System.out.println( " ********************* ");

        Foo foo = new Foo();
        foo.setLeft(9);

        System.out.println( " foo.getLeft: "+  foo.getLeft());
        System.out.println( " foo.getRight: "+  foo.getRight());
        System.out.println( " ********************* ");

        foo.left = 5;
        foo.right = 15;

        System.out.println( " foo.getRight: "+  foo.getLeft());
        System.out.println( " foo.getRight: "+  foo.getRight());
        System.out.println( " ********************* ");

      //  foo.privateNum =90;  // not work bcs of encapsulated
        foo.setPrivateNum(90);
        System.out.println( " foo.getPrivateNum: "+ foo.getPrivateNum());

    }
}
