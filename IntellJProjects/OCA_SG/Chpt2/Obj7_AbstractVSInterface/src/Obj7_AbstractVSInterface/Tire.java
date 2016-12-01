package Obj7_AbstractVSInterface;

/**
 * Created by Ki on 11/30/2016.
 */
public class Tire implements  Bounceable {
    @Override
    public void setBounceFactor(int bf) {
        System.out.println("Tire implements Bounceable  " +
                "override setBounceFactor   bf = [" + bf + "]");
    }

    @Override
    public void bounce() {
        System.out.println("Tire implements Bounceable  " +
                "override bounce");
    }
}
