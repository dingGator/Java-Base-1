
import java.util.Scanner;

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
    
    private static Scanner scanner = new Scanner(System.in);
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myIntArray1 ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("myIntArray1[3]   is " +myIntArray1[3]);
     
        
        int[] myIntArray2 = new int[10];
      
        myIntArray2[5] =50;
        System.out.println("myIntArray2[5]  is "+ myIntArray2[5]);
        
        
        int[] myIntArray3 = new int[10];
        myIntArray3[1] =150;
        myIntArray3[2] =250;
        myIntArray3[3] =350;
        myIntArray3[4] =450;
        System.out.println(" myIntArray3[2]  is "+myIntArray3[2]);
        
       
        double[] myDoubleArray = new double[10];
     
        int[] myIntArray4 = new int[25];
      
        for(int i=0;i<myIntArray4.length; i++){
            myIntArray4[i] =i*10;
        }
        for (int i =0; i<myIntArray4.length; i++){
            System.out.println(" myIntArray4 Element =  "+i +
                    ", value is "+ myIntArray4[i]);
        }
        /***** error length is not defined
         for (int i =0; i <30; i++){
        //    System.out.println("Element "+i +
        //            ", value is "+ myIntArray4[i]);
        }*/
        printArray(myIntArray4);
        
        int[] myScanInt = getScanInt(5);
        for (int i=0; i< myScanInt.length; i++)
        {
            System.out.println("Element "+ i +
                    ", typed value as "+ myScanInt[i]);
        }    System.out.println(" the average is "+ 
                getAverage(myScanInt));
        
        
        
    }
 public static int[] getScanInt(int number){
     System.out.println("Enter "+ number + " integer values.\r");
     int[] values = new int[number];
     for (int i =0; i<values.length;i++){
         values[i] = scanner.nextInt();
     }
     return values;
 }  
    public static void printArray(int[]array){
   
        for (int i =0; i<array.length; i++){
            System.out.println(
                    " myIntArray4 in printArray method *** Element = "
                            +i + ", value is "+ array[i]);
    }
    
    }
    public static double getAverage(int[] array){
        int sum =0;
        for (int i =0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}
