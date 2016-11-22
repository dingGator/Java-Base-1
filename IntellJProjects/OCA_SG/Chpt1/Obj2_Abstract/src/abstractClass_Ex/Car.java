package abstractClass_Ex;

/**
 * Created by Ki on 11/7/2016.
 */
public abstract class Car extends Vehicle {


    public void startEngine() {
        System.out.println("Car startEngine");
    }



    public abstract void goForward();

    public abstract void reverse();

    public void stop() {
        System.out.println("Car stop");
    }



    public abstract void turn(int whichWay);

    @Override
    public void goUpHill() {
        System.out.println(" Car goUpHill");
    }

}
