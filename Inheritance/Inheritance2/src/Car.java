/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Car extends Vehicle{
    private int doorNumber;
    private int gearNumber;
    private boolean isManual;
    private int wheelNumber;
    private int currentGear;

    public Car(int doorNumber, int gearNumber, 
            boolean isManual, int wheelNumber, 
            int currentGear, String name, int size) {
        super(name, size);
        this.doorNumber = doorNumber;
        this.gearNumber = gearNumber;
        this.isManual = isManual;
        this.wheelNumber = wheelNumber;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to "+
                this.currentGear + " gear ");
        
    }
public void changeVelocity(int speed, int direction){
   System.out.println("Car.changeVelocity():  Velocity "+
            speed + " direction "+direction);
    move(speed,direction);
    
   
   
}

    

   
    
    
}
