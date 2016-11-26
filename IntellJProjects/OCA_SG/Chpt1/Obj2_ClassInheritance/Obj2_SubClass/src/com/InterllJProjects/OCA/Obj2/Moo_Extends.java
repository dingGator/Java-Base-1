package com.InterllJProjects.OCA.Obj2;

/**
 * Created by Ki on 11/6/2016.
 */
public class Moo_Extends extends Zoo{
    public void useMyCoolMethod() {
        System.out.println("Moo_Extends  useMyCoolMethod(): this.coolMethod()  Moo says, " + this.coolMethod());
        Zoo z = new Zoo();
        System.out.println("Moo_Extends  useMyCoolMethod(): z.coolMethod()  Zoo says, " + z.coolMethod());
    }
}
