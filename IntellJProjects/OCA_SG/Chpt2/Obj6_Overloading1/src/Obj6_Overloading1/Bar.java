package Obj6_Overloading1;

import java.io.IOException;

/**
 * Created by Ki on 11/27/2016.
 */
public class Bar extends Foo{
    public void doStuff( int y, long s) throws IOException{
        System.out.println("doStuff (int y, long s) throws IOException " +
                "y = [" + y + "], s = [" + s + "]");
    }

    void doStuff1(String s){
        System.out.println("***overloading   doStuff1(String s)   " +
                "s = [" + s + "]");
    }
    void doStuff1(){
        System.out.println("***override   Bar extends Foo:  void doStuff()");
    }

}
