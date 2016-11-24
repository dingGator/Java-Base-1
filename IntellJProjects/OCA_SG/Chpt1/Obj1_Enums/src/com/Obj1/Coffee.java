package com.Obj1;

/**
 * Created by Ki on 11/15/2016.
 */
enum CoffeeSize {
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {
        public String getLidCode() {
            return "A";
        }
    };

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }

    public String getLidCode() {
        return "B";
    }
}

public class Coffee {
    CoffeeSize size;

    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;

        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;

        System.out.println("drink1 ounces: "+drink1.size.getOunces());
        System.out.println("drink1 lidCode: "+drink1.size.getLidCode());
        System.out.println("drink2 lidCode: "+drink2.size.getLidCode());
        System.out.println("****************");

        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getOunces());

        }

    }
}




