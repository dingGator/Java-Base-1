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
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);
        boolean myBoolean = false;
        boolean isMale = true;

        //1.  Find the code for registered symbol on the
        //     same line as the copyright symbol
        //2.  Create a variable on the type char
        //     assign it to the unicode value for that 
        //     symbol
        //3.  display the screen
        char myNewChar = '\u00AE';
        System.out.println("Unicode output was: " + myNewChar);

    }

}
