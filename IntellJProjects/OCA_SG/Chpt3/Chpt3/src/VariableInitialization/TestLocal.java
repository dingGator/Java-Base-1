package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */

import java.util.Date;

public class TestLocal {

    static int[] instanceIntArray = new int[10];  //declared
    static boolean[] instanceBooleanArray = new boolean[10];
    static char[] instanceCharArray = new char[10];
    // array NOT initialized


    public static void main(String[] args) {

        int x;
        x = 10;
        // if (args[0] != null) {
        //     x=7;
        // }
        int y = x;
        int[] localArray = new int[10];
        Date date = null;
        if (date == null) {
            System.out.println("date is null ");
        }
        System.out.println(" x = " + x + " y = " + y);

        System.out.println("Uninitialized Arrays:  ");
        for (int i = 0; i < 10; i++) {

            System.out.println("  intanceIntArray[" + i + "] = " + instanceIntArray[i] +
                    "\n  instanceBooleanArray[" + i + "] = " + instanceBooleanArray[i] +
                    "\n  instanceCharArray[" + i + "] = " + instanceCharArray[i] +
                    "\n  localArray[" + i + "] = " + localArray[i]);
        }
        System.out.println("\nInitialized Arrays:  ");
        for (int i = 0; i < 10; i++) {
            instanceBooleanArray[i] = true;
            instanceIntArray[i] = 99;
            instanceCharArray[i] = '\u0001';
            localArray[i] = 89;
            System.out.println("  intanceIntArray[" + i + "] = " + instanceIntArray[i] +
                    "\n  instanceBooleanArray[" + i + "] = " + instanceBooleanArray[i] +
                    "\n  instanceCharArray[" + i + "] = " + instanceCharArray[i] +
                    "\n  localArray[" + i + "] = " + localArray[i]);
        }


    }
}
