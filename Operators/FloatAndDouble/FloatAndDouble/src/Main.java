/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //width of int =32(4 bytes)

        int myIntValue = 5 / 3;

        //width of float =32(4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double =64(8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatalue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Convert a given number of pounds to Kilograms
        //1.  Create a variable to store the number of pounds
        //2.  Calculate the number of Kilograms for the number above 
        //    and store in a variable
        //3.  print out the result
        //Note:  1 pound is equal to .45359237 kilograms
        double myPoundValue = 200d;
        double myKiloValue = myPoundValue * 0.45359237d;
        System.out.println("myKiloValue = " + myKiloValue);
        double pi = 3.1415927d;

    }

}
