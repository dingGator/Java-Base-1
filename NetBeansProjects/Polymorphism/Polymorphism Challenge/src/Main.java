/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
class Car{
    
    private boolean engine;
    private int cylinders;
     private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
  public String startEngine(){
      return "Car -> startEngine()";
    }
    
public String accelerate(){
      return "Car -> accelerate()";
    }
  public String brake(){
      return "Car -> brake()";
    
    
}
}

class Mitsubishi extends Car {
    public Mitsubishi (int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car {
    public Holden (int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ "-> accelerate()";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " -> startEngine()";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName()+" -> brake()";
    }
}
class Ford extends Car {
    public Ford (int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }
    @Override
    public String brake(){
        return "Ford -> brake()";
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****car.startEngine());********");
        Car car = new Car (8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        
        System.out.println("*****mitsubishi.startEngine());********");
        Ford mitsubishi = new Ford (6,
                "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        
        System.out.println("*****ford.startEngine());********");
        Ford ford = new Ford (6,
                "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("*****Holden.startEngine());********");
        
        Holden holden = new Holden (6,
                "Holden Comodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }   
}

   


   
   
            
    

