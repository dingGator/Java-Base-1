package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public class BeachBall extends BallAbstract {
    @Override
    public void bounce() {
        System.out.println("***BeachBall extends BallAbstract  override bounce:  ");
    }

    @Override
    public void setBounceFactor(int bounceFactor) {
        System.out.println("*** setBounceFactor(int bounceFactor)  " +
                "  bounceFactor = [" + bounceFactor + "]");
    }

}
