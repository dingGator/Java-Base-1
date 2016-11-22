package abstractClass_Ex;

/**
 * Created by Ki on 11/7/2016.
 */
public class SportsCar extends Car {

    static public void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void goUpHill() {
                System.out.println(" SportCar Vehicle goUpHill");
            }
        };
        vehicle.goUpHill();
        SportsCar sportsCar = new SportsCar();
        System.out.println(" SportCar goFast: ");
        sportsCar.goFast();
        sportsCar.goUpHill();
        sportsCar.startEngine();


    }
    public void goUpHill(){System.out.println(" SportCar go Up Hill ");};
    public void goForward(){
        System.out.println(" SportCar go Forward");
    };
     public void startEngine(){System.out.println("SportCar start Engine ");};
     public void goFoward(){
         System.out.println(" SportCar go forward");
     };
    public void reverse(){System.out.println("SportCar reverse ");
    };
    public void turn(int whichWay){
        System.out.println(" SportCar turn "+ whichWay);
    };
}
