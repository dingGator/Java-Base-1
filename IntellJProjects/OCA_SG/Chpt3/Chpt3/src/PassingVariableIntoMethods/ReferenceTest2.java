package PassingVariableIntoMethods;

/**
 * Created by Ki on 12/13/2016.
 */
import VariableInitialization.ReferenceTest;

import java.awt.Dimension;
public class ReferenceTest2 {
    public static void main(String[] args) {
        Dimension d = new Dimension(5,10);
        ReferenceTest2 rt2 = new ReferenceTest2();
        System.out.println("Before modify() d.height = "+ d.height);
        rt2.modify(d);
        System.out.println("Before modify() d.height = "+ d.height);
    }
    void modify(Dimension dim){
        dim.height = dim.height +1;
        System.out.println("dim = " + dim.height);
    }

}
