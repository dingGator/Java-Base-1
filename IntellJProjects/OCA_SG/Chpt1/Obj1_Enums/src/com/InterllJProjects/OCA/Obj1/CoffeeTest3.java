package com.InterllJProjects.OCA.Obj1;

/**
 * Created by Ki on 11/13/2016.
 */
public class CoffeeTest3 {
    enum CoffeeSize3{BIG,HUGE,OVERWHELMING};
    CoffeeSize3 size3;
    public static void main3(){
        CoffeeTest3 drink3 = new CoffeeTest3();
        //drink.size= Coffee2.CoffeeSize.BIG;

        drink3.size3 = CoffeeTest3.CoffeeSize3.OVERWHELMING;
        System.out.println(" drink3.size3 "+ drink3.size3);

    }
}
