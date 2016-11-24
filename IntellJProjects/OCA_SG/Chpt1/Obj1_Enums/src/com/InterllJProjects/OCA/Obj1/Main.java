package com.InterllJProjects.OCA.Obj1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Coffee drink = new Coffee();
        // drink.size = CoffeeSize.BIG;

        System.out.println("Main enum outside class so : CoffeeSize :" + CoffeeSize.BIG);
        CoffeeTest1.main();
        System.out.println("********1***********");

        CoffeeTest2.main2();
        // Coffee2 drink2 = new Coffee2();
        //  drink2.size2 = Coffee2.CoffeeSize2.HUGE;
        System.out.println("Main enum inside class so: Coffee2.CoffeeSize2 " + Coffee2.CoffeeSize2.HUGE);

        System.out.println("*********2**********");

        System.out.println("Main Coffee3.CoffeeSize3_1 " + CoffeeTest3.CoffeeSize3.OVERWHELMING);

        CoffeeTest3.main3();

        System.out.println("*********3**********");
        CoffeeTest3 drink3 = new CoffeeTest3();
        drink3.size3 = CoffeeTest3.CoffeeSize3.OVERWHELMING;
        System.out.println("Main drink3.size3 " + drink3.size3);
        System.out.println("Main Coffee3.CoffeeSize3_2 " + CoffeeTest3.CoffeeSize3.OVERWHELMING);
        CoffeeTest3.main3();
        drink3.main3();
        //System.out.println("Main Coffee3.CoffeeSize3_2 "+ Coffee3.OVERWHELMING);

        System.out.println("*********4**********");


        Coffee4.CoffeeSize4 overwhelming = Coffee4.CoffeeSize4.OVERWHELMING;
        System.out.println("Main Coffee4.CoffeeSize4 " + overwhelming);


    }
}
