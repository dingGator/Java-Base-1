
import java.util.Arrays;
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
         int[] myIntegers = getIntegers(5);
   
            printArray(myIntegers);
            System.out.println(("****** Sorted 1 *****"));
            int[] sorIntegers = sortIntegers(myIntegers);
            printArray(sorIntegers);
            System.out.println(("****** Sorted 2*****"));
            
            int[] sorted =sortIntegers2(myIntegers);
            printArray(sorted);
        
    }
    public static int[] getIntegers(int number){
     System.out.println("Enter "+ number + " integer values.\r");
     int[] values = new int[number];
     for (int i =0; i<values.length;i++){
         values[i] = scanner.nextInt();
     }
     return values;
 } 
    public static int[] sortIntegers2(int[]array){
  /*      int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i]= array[i];
        }
    */
        //copy array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag =true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if (sortedArray[i]< sortedArray[i+1]){
                    //swap the element
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
    
    public static int[] sortIntegers(int[]number){
        int[] sortInt = new int[number.length];
          
        //copy array
        for(int i =0; i< number.length; i++){
            sortInt[i]=number[i];
        }
        
     for (int i = 0; i < sortInt.length - 1; i++)
        {  int index = i;
            for (int j = i + 1; j < sortInt.length; j++)
                if (sortInt[j] > sortInt[index])
                    index = j;
      
            int biggerNumber = sortInt[index]; 
            sortInt[index] = sortInt[i];
            sortInt[i] = biggerNumber;
        }
     return sortInt;
 }  
    public static void printArray(int[]array){
   
        for (int i =0; i<array.length; i++){
            System.out.println(
                    "printArray method *** Element = "
                            +i + ", value is "+ array[i]);
    }
}
}
