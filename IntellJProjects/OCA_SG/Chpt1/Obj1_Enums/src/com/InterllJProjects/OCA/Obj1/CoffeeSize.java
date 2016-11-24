package com.InterllJProjects.OCA.Obj1;

/**
 * Created by Ki on 11/14/2016.
 */
class CoffeeSize5 {

    public static final CoffeeSize5 BIG = new CoffeeSize5("BIG", 0);
    public static final CoffeeSize5 HUGE = new CoffeeSize5("HUGE", 1);

    public static final CoffeeSize5 OVERWHELMING = new CoffeeSize5("OVERWHELMING", 2);

    public CoffeeSize5(String enumName, int index) {//stuff here
         System.out.println(" enum concept enumName : " + enumName + " index " + index);
    }

    public static void main(String[] args) {
        //new CoffeeSize5("HUGE Coffee",0);
           /*  System.out.println(" enum concept2: "+ huge);
*/
        System.out.println(" main enum concept****in");
      //  final CoffeeSize huge2 = new CoffeeSize("huge", 0);
        // new CoffeeSize();
        new CoffeeSize5("HUGE Coffee",0);
        System.out.println(CoffeeSize5.BIG);

        System.out.println(" main enum concept****end");

    }}


