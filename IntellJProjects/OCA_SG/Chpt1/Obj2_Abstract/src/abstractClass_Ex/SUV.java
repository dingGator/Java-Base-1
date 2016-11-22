package abstractClass_Ex;

/**
 * Created by Ki on 11/7/2016.
 */
public abstract class SUV extends Car{
    public void enabled4wd(){
        System.out.println("SUV enabled 4 wd");
    };
    public void goForward(){
        System.out.println(" SUV go Forward");
    };
    public void reverse(){
        System.out.println(" SUV reverse ");
    };
    public abstract void goOffRoad();

}
