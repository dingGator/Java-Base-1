package ShadowingVariables;

import PassingVariableIntoMethods.*;

/**
 * Created by Ki on 12/15/2016.
 */
public class Foo2 {
    Bar myBar = new Bar();
    void changeIt(Bar myBar){
        System.out.println("******changeIt****start************");
        myBar.barNum =99;
        System.out.println("myBar.barNum in changeIt is = [" + myBar.barNum + "]");
        myBar = new Bar();
        myBar.barNum = 420;
        System.out.println("myBar.barNum in changeIt is now = [" + myBar.barNum + "]");
        System.out.println("******changeIt****end************");
    }

    public static void main(String[] args) {
        Foo2 f = new Foo2();
        System.out.println("f.myBar.barNum is = [" + f.myBar.barNum + "]");
        f.changeIt(f.myBar);
        System.out.println("f.myBar.barNum after changeIt is = [" + f.myBar.barNum + "]");
    }
}
