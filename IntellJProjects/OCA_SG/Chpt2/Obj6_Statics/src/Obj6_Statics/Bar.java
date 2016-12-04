package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Bar {

    static void goStatic(){
        System.out.println("Bar  goStatic()   ");
    }

    void go(){
        System.out.println("Bar  go()  ");
    }


    static void doMore(){

        //Error:  static method cannot
        // access a non-static method
        //      go();
        System.out.println("doMore  goStatic()");
        goStatic();
    }

}
