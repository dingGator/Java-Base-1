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
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));       
   System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
   System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
   System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));   
  
   System.out.println("*** For loop******");
   
   for (int i=0;i<5;i++){
       System.out.println("Loop "+i+" hello");
   }
    System.out.println("********for loop to show from 2% to 8%************");       

   //use for statement
   // call calculateInterest method 
   // amount 10000 with interestRate of 2,3,4,5,6,7,8
   // print results to console
   
   for (int i =2;i<9; i++){
       System.out.println("10000 at "+ i + " % interest = " +String.format("%.2f", calculateInterest(10000.0, i)));       
   }
   //modify for loop to show from 8% to 2%
 System.out.println("********for loop to show from 8% to 2%************");       
   
   for (int i =8; i>=2; i--){
       System.out.println("10000 at "+ i + " % interest = " +String.format("%.2f", calculateInterest(10000.0, i)));       
   }
   System.out.println("*******Challenge** if number is a prime number ***********");    
   // create for statement using any range of numbers
   // determine if number is a prime number using isPrime method
   // if prime number, print it out
   // and increment a count of 
   // the number of prime numbers found
   // if the count is 3 exit the loop
   // use break; to get out of loop
   int primeCount =0;
   for (int i=10;i<50;i++){
         if (isPrime(i)==true){
           System.out.println(i + " is a prime number. ");
                   primeCount++;
           if (primeCount ==10){
                System.out.println(" exit for loop. ");
               break;
           }
        }
           
       }
   
   
   
    }
    
    public static boolean isPrime(int n){
        System.out.println( " called isPrime************* ");
       
        if(n==1){
            return false;
        }
         System.out.println( " looping ************  i<=(long)Math.sqrt(n)" );
       
        for (int i=2; i<=(long)Math.sqrt(n); i++){  //optimized
        System.out.println( " looping  i<=(long)Math.sqrt(n) i= " +i);
         if (n%i==0){
            return false;
        }
        }
        System.out.println( " looping ****************** i<=n/2" );
        for (int i=2; i<=n/2;i++){
             System.out.println( " looping i<=n/2 i= " +i);
        if (n%i==0){
            return false;
        }
    }
        return true;
    }
    
    
    
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    
}
