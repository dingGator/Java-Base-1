package Quiz_2_6.Question46;

/**
 * Created by Ki on 2/10/2017.
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
