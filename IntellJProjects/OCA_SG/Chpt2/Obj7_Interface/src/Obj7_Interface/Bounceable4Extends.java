package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public interface Bounceable4Extends extends MoveableInterface, SphericalInterface {
    void bounce();
    void setBounceFactor(int bounceFactor);
}
