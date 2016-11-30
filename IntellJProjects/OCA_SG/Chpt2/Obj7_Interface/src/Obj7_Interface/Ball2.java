package Obj7_Interface;

import java.io.Serializable;

/**
 * Created by Ki on 11/30/2016.
 */
public class Ball2 implements Bounceable, Serializable, Runnable {
    @Override
    public void bounce() {
        System.out.println("***Ball2  override bounce  ");
    }

    @Override
    public void setBounceFactor(int bounceFactor) {
        System.out.println("***Ball2  overrice setBounceFactor  bounceFactor = [" + bounceFactor + "]");
    }

    @Override
    public void run() {
        System.out.println("***Ball2  override run  ");
    }
}
