package com.InterllJProjects.OCA.Obj1;

/**
 * Created by Ki on 11/14/2016.
 */
public class Coffee4 {

    enum CoffeeSize4{BIG,HUGE,OVERWHELMING};
   CoffeeSize4 size4;
    public static void main(String[]args) {
        System.out.println("*******************");

        //   enum CoffeeSize3{BIG,HUGE,OVERWHELMING}; enum cannot be decleared in a method
        CoffeeTest2.main2();
        // Coffee2 drink2 = new Coffee2();
        //  drink2.size2 = Coffee2.CoffeeSize2.HUGE;
        System.out.println("Coffee4 Coffee2.CoffeeSize2 " + Coffee2.CoffeeSize2.HUGE);

        System.out.println("*******************");

   //     CoffeeSize4 size4;
        CoffeeSize4 overwhelming = CoffeeSize4.OVERWHELMING;
        System.out.println(" CoffeeSize4 " + overwhelming);
        System.out.println("*******************");

        Coffee4 drink4 = new Coffee4();
        drink4.size4 = Coffee4.CoffeeSize4.OVERWHELMING;
        System.out.println(" drink4.size4 " + drink4.size4);

    }
    }
