package com.InterllJProjects.OCA.Obj2;

/**
 * Created by Ki on 11/7/2016.
 */
public class SportsCar {
    public void goFast() {
        System.out.println(" SportsCar goFast: ");
    }


    public void doStuff() {
        System.out.println(" SportsCar doStuff goFast:");
        goFast();
    }
}
