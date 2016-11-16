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
        int int2 = 5;
        //false, true.null
        //a mile is 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //Which part is an expression
        int score = 100;  //expr  is: score=100

        if (score > 99) {   //expr   is: in ()  
            System.out.println("Which is an expression");//expr is: "which is ..."
            score = 0;//expr is: score =0
        }

    }
}
