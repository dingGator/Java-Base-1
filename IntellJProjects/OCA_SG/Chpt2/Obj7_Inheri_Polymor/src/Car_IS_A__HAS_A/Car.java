package Car_IS_A__HAS_A;

/**
 * Created by Ki on 11/21/2016.
 */
public class Car extends Vehicle {
    public static void main(String[] args) {
        System.out.println("Car extends Vehicle means Car IS_A Vehicle");
        System.out.println("Subaru extends Car means Subaru IS_A Car");
        System.out.println("Subaru IS_A Vehicle");

        System.out.println("****Vehicle******");

        Vehicle vehicle = new Vehicle();
        vehicle.driveVehicle();
        //  vehicle.driveSubaru();  // cannot driveSubaru
        System.out.println("****Car******");
        Car car = new Car();
        car.driveVehicle();
        //car.driveSubaru();  // cannot driveSubaru
        System.out.println("****Subaru*****");

        Subaru subaru = new Subaru();
        subaru.driveVehicle();
        subaru.driveSubaru();
    }
}
