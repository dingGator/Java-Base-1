package Quiz_1_30.Question20;

/**
 * Created by Ki on 2/2/2017.
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
