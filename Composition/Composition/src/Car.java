/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(int doors, int engineCapacity, String name) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
