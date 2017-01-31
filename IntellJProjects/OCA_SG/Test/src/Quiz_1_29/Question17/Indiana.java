package Quiz_1_29.Question17;

/**
 * Created by Ki on 1/30/2017.
 */
class X {
    public String markTheSpot(){return "X";}
}
class Y extends X{
    public String markTheSpot(){return "Y";}
}
class Z extends Y{
    public String markTheSpot(){return "Z";}
}
class A extends Z{}
public class Indiana{
    public static void main(String[] args) {
        System.out.println(new A().markTheSpot()
        + " never, ever marks the spot");
    }
}
