package com.InterllJProjects.OCA.Obj2;

/**
 * Created by Ki on 11/13/2016.
 */
public class TestServer extends Foo  {
    int count = 9;
    public void logIn(){
        int count =10;
        System.out.println(" logIn count: "+ count);
    }
    public void count(){
        System.out.println(" local variable count: "+ count);

    }
    /*
    public static void main(String[] args){
        System.out.println(" in main: ");

        new TestServer().logIn();
        new TestServer().count();
    }
*/
}
