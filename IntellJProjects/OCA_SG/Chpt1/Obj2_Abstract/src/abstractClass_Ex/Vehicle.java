package abstractClass_Ex;

/**
 * Created by Ki on 11/7/2016.
 */
public abstract class Vehicle {

    public void goFast() {
    System.out.println(" Vehicle goFast");
           }
    public void doStuff(){
        System.out.println(" Vehicle doStuff goFast: ");
        goFast();
    }

  public abstract void goUpHill();

  /*  public String getType() {
        return type;
    }*/
}
