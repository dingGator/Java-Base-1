package com.InterllJProjects.OCA.Obj1;

/**
 * Created by Ki on 11/13/2016.
 */
public class CoffeeTest1 {

    public static void main(){
        System.out.println("CoffeeTest1.main ");

        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
        System.out.println("CoffeeTest1: CoffeeSize: "+ drink.size);

    }
}
