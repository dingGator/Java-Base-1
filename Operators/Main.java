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
      
        int result = 1 + 2;
      System.out.println("1 + 2  = "+ result);
      
      int previousResult = result;
      result = result - 1;
      System.out.println(previousResult + " - 1  = "+ result);
      
      previousResult = result;
      result = result *10;
      System.out.println(previousResult + "  * 10  = "+ result);
      
      previousResult = result;
      result =result/5;
      System.out.println(previousResult + "  / 5  = "+ result);
      
      previousResult = result;
      result =result%3;
      System.out.println(previousResult + "  % 3  = "+ result);
      
      previousResult = result;
      result =result +1 ;
      System.out.println("result is now "+ result);
      
      result++ ;
      System.out.println("result is now "+ result);
      
      result-- ;
      System.out.println("result is now "+ result);
      
      result +=2;
      System.out.println("result is now "+ result);
      
      result *=10 ;
      System.out.println("result is now "+ result);
      
      result -=10 ;
      System.out.println("result is now "+ result);
      
      result /=10 ;
      System.out.println("result is now "+ result);
      
      
      boolean isAlien = false;
      if (isAlien == true)
       System.out.println("It is not an alien!");
      
      int topScore = 80;
      if (topScore == 100)
       System.out.println("You got the high score!");
         
      if (topScore != 100)
       System.out.println("You got the not score!");
      
      if (topScore > 100)
       System.out.println("You got the > score!");
      
      if (topScore >= 100)
       System.out.println("You got the >= score!");
      
      if (topScore < 100)
       System.out.println("You got the < score!");
      
      if (topScore <= 100)
       System.out.println("You got the <= score!");
      
      int secondTopScore =95;
      if ((topScore > secondTopScore) && (topScore <100))
        System.out.println("Greater than the second top score and less than 100");
      
      if ((topScore>90)||(secondTopScore <=90))
        System.out.println("One of these tests is true");
    
      
      int newValue =50;
      if (newValue == 50)
          System.out.println("This is true");
      boolean isCar = false;
      if (isCar==true )
          System.out.println("This is not suppose to happen");
   
      isCar =true;
      boolean wasCar = isCar? true:false;
   if (wasCar)
       System.out.println("wasCar is true");
    
   //1.  Create a variable with the value 20
   //2.  Create a second variable of type with double with value 80
   //3.  Add both numbers up and multiply by 25
   //4.  Use the remainder operator to figure out the remainder 
   //     from the sum of #3 divided by 40
   //5.  Write an "if" statement that display a message
   //     "Total was over the limit"
   //     of the remaining total(#4) is equal to 20 or less.
   
            double firstVar = 20d;
            double secVar = 80;
            double thirVar = (firstVar + secVar)*25;
            double fourVar = thirVar % 40;
            
            if (fourVar <= 20)
                System.out.println("Total was over the limit");
                System.out.println(fourVar);
    }
    
}
