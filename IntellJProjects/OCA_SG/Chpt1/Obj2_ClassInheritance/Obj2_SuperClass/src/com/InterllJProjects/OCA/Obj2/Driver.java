package com.InterllJProjects.OCA.Obj2;

/**
 * Created by Ki on 11/7/2016.
 */
public class Driver {
    public void doDriverStuff() {
        SportsCar car = new SportsCar();
        System.out.println(" Driver doDriverStuff SportCar car.goFast: ");
        car.goFast();
        Convertible conv = new Convertible();
        System.out.println(" Driver doDriverStuff Convertible conv.goFast: ");
        conv.goFast();
    }
}
