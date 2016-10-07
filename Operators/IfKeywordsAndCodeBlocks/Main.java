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
        boolean gameOver=true;
        int score =800;
        int levelCompleted =5;
        int bonus =100;
 //       if (score <5000 && score >1000){
 //           System.out.println("Your score was 5000 but greater than 1000");
 //       } else if (score<1000){
 //           System.out.println("Your score was less than 1000");
 //       }else
 //       {
 //           System.out.println("Got here");
 //       }
  System.out.println("*****************");
      
        if (gameOver)  //scope
        { int finalScore =score +(levelCompleted*bonus);
        finalScore +=1000;
        System.out.println("your final score was "+finalScore);
        }
        
        //Print out a second score on the screen with
        // score set to 10000
        // levelCompleted to 8
        //bonus set to 200
        //But make sure the first printout above still display
        System.out.println("*****************");
        boolean gameOver2 =true;
        int score2 =10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        if (gameOver2)  //scope
        { int finalScore =score2 +(levelCompleted2*bonus2);
        System.out.println("your final score was "+finalScore);
        } 
        System.out.println("*****************");
        
        score =10000;
        levelCompleted =8;
        bonus =200;
        
         if (gameOver)  //scope
        { int finalScore =score +(levelCompleted*bonus);
        System.out.println("your final score was "+finalScore);
        } 
    }
    
}
