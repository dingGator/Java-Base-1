/**
 * Created by Ki on 11/13/2016.
 */
public class Foo {
    Foo() {
        System.out.println(" constructor ");
    }
    private Foo(byte b){
        System.out.println(" constructor ");
    }
    Foo (int x){
        System.out.println(" overloading constructor");
    }
    Foo(int x,int y){
        System.out.println(" overloading constructor");
    }
}
