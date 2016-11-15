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
    
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
     System.out.println("your final score was "+ highScore);
        
     
     score =10000;
        levelCompleted =8;
        bonus =200;
       
        highScore=calculateScore(gameOver, score, levelCompleted, bonus);
     System.out.println("your final score was "+ highScore);
    
     //create a method called displayHighScorePosition
     //playerName as a parameter
     //position as a parameter
     //display players name along with a message like
     //    " manged to get into position"
     //     and the position they got
     // and a futher message " on the high score table"
     
     //create a second method called calculateHighScorePosition
     //it should have one argument, player score
     //it should return an int
     //the return data should be
     // 1 if the score >1000
     // 2 if the score is >500 and <1000
     // 3 if the score is >100 and <500
     // 4 in all other cases
     // call both methods and display results
     // of the following
     // a score of 1500, 900, 400,50
     
     
    System.out.println("****challenge*************");
         
     String playerName ="Tim";
     int playerScore = 1500;
     int highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
     playerName ="Bob";
     playerScore = 900;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
     playerName ="Percy";
     playerScore =400;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
     playerName ="Gilbert";
     playerScore =50;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
      playerName ="Louise";
     playerScore =1000;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
     playerName ="Kim";
     playerScore =500;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     playerName ="Carol";
     playerScore =100;
     highScorePosition=calculateHighScorePosition(playerScore);
     displayHighScorePosition(playerName,highScorePosition);
     
    }
    //second method outside first method
    public static int calculateScore(boolean gameOver,
                                      int score,
                                      int levelCompleted,
                                      int bonus){

     if (gameOver)  //scope
        { int finalScore =score +(levelCompleted*bonus);
        finalScore +=2000;
         return finalScore;
     }
         return -1;
     
    }
    
     public static void displayHighScorePosition( String playerName,
                                        int highScorePosition)
     {
         System.out.println(playerName +" manged to get into position "+
              highScorePosition +                 
          " on the high score table.");
     }
     
      public static int calculateHighScorePosition( int playerScore)
     {
         if (playerScore >=1000){
             return 1;
         }
         else if ((playerScore>= 500)&& (playerScore<1000)){
         return 2;
         }
         else if ((playerScore>= 100)&& (playerScore<500)){
         return 3;
            
         } else {
             return 4;
         }
     }
}
