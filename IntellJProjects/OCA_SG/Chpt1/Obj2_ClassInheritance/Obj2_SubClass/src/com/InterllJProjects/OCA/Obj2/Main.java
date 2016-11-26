package com.InterllJProjects.OCA.Obj2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zoo zooMain = new Zoo();
        System.out.println("Main: zooMain.coolMethod() says, "+ zooMain.coolMethod());
        Moo mooMain = new Moo();
        mooMain.useAZoo();
        Moo_Extends moo_extendsMain = new Moo_Extends();
        moo_extendsMain.useMyCoolMethod();
    }
}
