package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public class Ball3 implements Bounceable4Extends {

    @Override
    public void moveIt() {
        System.out.println("*** Ball3 override moveIt  ");
    }

    @Override
    public void doSphericalThing() {
        System.out.println("***Ball3 override  doSphericalThing");
    }

    @Override
    public void bounce() {
        System.out.println("***Ball3  override bounce");
    }

    @Override
    public void setBounceFactor(int bounceFactor) {
        System.out.println("***Ball3  override setBounceFactor:  bounceFactor = [" + bounceFactor + "]");
    }
}
