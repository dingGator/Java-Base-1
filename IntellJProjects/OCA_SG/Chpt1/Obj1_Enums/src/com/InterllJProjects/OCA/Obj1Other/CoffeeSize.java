package com.InterllJProjects.OCA.Obj1Other;

/**
 * Created by Ki on 11/14/2016.
 */
public class CoffeeSize {

    public static final CoffeeSize BIG = new CoffeeSize("BIG", 0);
    public static final CoffeeSize HUGE = new CoffeeSize("HUGE", 1);

    public static final CoffeeSize OVERWHELMING = new CoffeeSize("OVERWHELMING", 2);

    public CoffeeSize(String enumName, int index) {//stuff here
        //  System.out.println(" enum concept enumName : " + enumName + " index " + index);
    }

    public static void main(String[] args) {
        System.out.println(CoffeeSize.BIG);
     /*  System.out.println(" enum concept2: "+ huge);

        System.out.println(" enum concept****in");
        final CoffeeSize huge2 = new CoffeeSize("huge", 0);
        // new CoffeeSize();
        System.out.println(" enum concept****end");
    */
    }
}

