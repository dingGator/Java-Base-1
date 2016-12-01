package Obj7_AbstractVSInterface;

/**
 * Created by Ki on 11/30/2016.
 */
public class BeachBall extends Ball {
    @Override
    public void bounce() {
        System.out.println("BeachBall extends Ball  " +
                "override bounce  ");
    }

    @Override
    public void setBounceFactor(int bf) {
        System.out.println("BeachBall extends Ball  " +
                "override setBounceFactor  bf = [" + bf + "]");
    }
}
