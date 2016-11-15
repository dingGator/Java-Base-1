/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Vehicle {
    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;
    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity =0;
    }
    public void steer(int direction){
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer():Steering at "+ 
                currentDirection + " degrees");
        
    }
   public void move(int velocity, int direction){
       currentVelocity = velocity;
       currentDirection =direction;
       System.out.println("Vehicle.move():Moving at "+
               currentVelocity + " in direction "+currentDirection);
   }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
  
    public void stop(){
        this.currentVelocity =0;
    }
    
}
