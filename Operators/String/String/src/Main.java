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
        //byte primitive type
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //string  not primitive type
        String myString = "This is a string";
        System.out.println("myString is = " + myString);
        myString = myString + ",and this is more.";
        System.out.println("myString is = " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("The result is  " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is = " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is = " + lastString);

    }

}
