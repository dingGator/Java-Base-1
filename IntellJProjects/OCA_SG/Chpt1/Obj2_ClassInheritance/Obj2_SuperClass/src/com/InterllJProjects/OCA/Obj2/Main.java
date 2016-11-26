package com.InterllJProjects.OCA.Obj2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SportsCar scMain = new SportsCar();
        System.out.println(" scMain.goFast: ");
        scMain.goFast();
        System.out.println(" scMain.doStuff: ");
        scMain.doStuff();
        Convertible conMain = new Convertible();
        System.out.println(" conMain.goFast: ");
        conMain.goFast();
        Driver drMain = new Driver();
        drMain.doDriverStuff();
    }
}
