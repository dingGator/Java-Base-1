package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */
import java.awt.Dimension;
public class ReferenceTest {
    public static void main(String[] args) {
        Dimension a1 = new Dimension(5,10);
        System.out.println("a1.height = " + a1.height);
        Dimension b1= a1;
        b1.height= 30;
        System.out.println("a1.height = " + a1.height+ " after change to b1");
        //both a1 and b1 point to same instance of Dimension object
        // thus when b1 is changed to 30 then a1 is changed to 30 too WOW!!!



    }
}
