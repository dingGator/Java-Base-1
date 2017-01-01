package Chpt3A.Question14;

/**
 * Created by Ki on 12/31/2016.
 */
public class Start {
    public static void main(String[] args) {
        print(new FancyCar());
    }

    private static void print(Car car) {
        //insert <code>
        ((Breakable) car).breakSmoothly();
        ((SuperFancyCar) car).turn();
        ((SuperFancyCar) car).breakSmoothly();
      //  ((FancyCar) car).turn();
        ((FancyCar) car).breakSmoothly();
        car.accelerate();
      //  car.turn();
      //  car.breakSmoothly();

    }
}
