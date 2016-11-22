package abstractClass_Ex;

/**
 * Created by Ki on 11/7/2016.
 */
public class AcmeRover extends SUV {
     public static void main(String[] args) {
         System.out.println(" main**** ");

         Vehicle vehicle = new Vehicle() {

            @Override
            public void goUpHill() {
                System.out.println(" AcmeRover vehicle goUpHill in override  ");

            }

        };
         System.out.println(" Vehicle  ****");
        vehicle.goUpHill();
         vehicle.doStuff();
         vehicle.goFast();

         System.out.println(" AcmeRover ****");

         AcmeRover acmeRover = new AcmeRover();
         acmeRover.goFast();
         System.out.println(" AcmeRover goUpHill: ****");

         acmeRover.goUpHill();
        acmeRover.startEngine();
         acmeRover.enabled4wd();
         acmeRover.goOffRoad();
         acmeRover.turn(5);
         acmeRover.reverse();
         acmeRover.doStuff();
         acmeRover.stop();


         System.out.println(" SportCar ****");


         SportsCar sportsCar = new SportsCar();
         sportsCar.reverse();
         sportsCar.startEngine();
         sportsCar.doStuff();



    }

    public void enable4wd(){
        System.out.println(" AcmeRover enable 4 wd");};
    public void goOffRoad(){
        System.out.println(" AcmeRover go off Road");
    };
    public void turn(int whichWay){
        System.out.println(" AcmeRover turn "+ whichWay);
    };

    @Override
    public void goUpHill() {
        System.out.println(" AcmeRover override goUpHill");
    }

}
