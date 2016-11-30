import Obj6_OL_Adder.Adder;

/**
 * Created by Ki on 11/27/2016.
 */
public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();
        int b =27;
        int c =3;
        int result = a.addThen(b,c);
        double doubleResult = a.addThen(22.5,9.3);
    }
}
