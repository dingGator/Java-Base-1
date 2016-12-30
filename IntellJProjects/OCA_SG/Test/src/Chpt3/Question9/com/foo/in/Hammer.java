package Chpt3.Question9.com.foo.in;

import Chpt3.Question9.com.foo.*;

/**
 * Created by Ki on 12/29/2016.
 */
public class Hammer {
    public void hit(){
        Bleh b = new Bleh();
        System.out.print(b.a +" ");
        b.say(8);

    }

    public static void main(String[] args) {
        new Hammer().hit();
    }
}
