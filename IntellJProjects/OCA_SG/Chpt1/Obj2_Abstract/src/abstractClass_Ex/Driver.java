package abstractClass_Ex;

/**
 * Created by Ki on 11/9/2016.
 */
public class Driver {
    public void doDriverStuff(){
        SportsCar car = new SportsCar();
        car.goFast();
        Convertible con = new Convertible() {
            @Override
            public void goForward() {
                System.out.println("Driver goForward ");
            }

            @Override
            public void reverse() {
                System.out.println("Driver reverse");
            }

            @Override
            public void turn(int whichWay) {
                System.out.println("Driver turn "+ whichWay);

            }

            @Override
            public void goUpHill() {
                System.out.println("Driver goUpHill ");
          }
        };
    }
}
