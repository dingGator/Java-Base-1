/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //challenge
        //base class Vehicle
        //     Car class inherits from base class
        //     hand steering, changing gears, moving(speed)
        //     state and behaviours(fields and methods)
        //     changing gears, increase/decrease speed
        //  spefic type of vehicle- 
        //  add something specific for that type of car
        
      //  Vehicle vehicle = new Vehicle("Vehicle", 4, "manual", 5,30); 
       // Car car = new Car("Toyota",4,"automatic", 4,50,4,4,4,4);
    Minivan miniVan= new Minivan(36);
    miniVan.steer(45);
    miniVan.accelerate(30);
    miniVan.accelerate(20);
    miniVan.accelerate(-42);
    }
    
}
