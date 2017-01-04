package ReferenceVarEquality;

import javax.swing.*;

/**
 * Created by Ki on 1/4/2017.
 */
public class CompareReference {
    public static void main(String[] args) {


        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;
        System.out.println("Is a reference a == b?  " + (a == b));
        System.out.println("Is a reference a == c?  " + (a == c));


    }
}
