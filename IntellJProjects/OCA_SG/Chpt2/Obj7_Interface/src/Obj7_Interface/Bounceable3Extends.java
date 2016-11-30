package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public interface Bounceable3Extends extends Bounceable, Bounceable2Extends {
    @Override
    void bounce();

    @Override
    void setBounceFactor(int bounceFactor);
}
