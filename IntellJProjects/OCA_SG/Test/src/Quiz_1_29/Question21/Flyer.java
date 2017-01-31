package Quiz_1_29.Question21;

/**
 * Created by Ki on 1/30/2017.
 */
interface Flyer {
    void printWingspan();
    void fly();
}
abstract class Bird implements Flyer{
    public void fly(){}
    public void waddle(){}
}
class Hawk extends Bird{
    public void printWingspan(){}
}
