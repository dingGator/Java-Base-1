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
        System.out.println(" *******while**********");
        int count = 1;
        while (count != 6) {
            System.out.println(" Count value is " + count);
            count++;
        }
        System.out.println(" *******while true**********");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println(" while: Count value is " + count);
            count++;
        }
        System.out.println(" ****for loop*************");
        count = 1;
        for (int i = 1; i != 6; i++) {
            System.out.println("for loop: Count value in for  is " + count);
            count++;
        }
        System.out.println("*********do while loop****************");
        count = 1;
        do {
            System.out.println(" do while: count value was " + count);
            count++;  //do atleast once and the test

            if (count > 8) {
                break;
            }
        } while (count != 6);

//       count =1;
//        while(true){
//            if (count==5){
//                break;
//            }
//             System.out.println(" Count value is " + count);
//             count++;
//        }
        System.out.println("**********Challenge**isEvenNumber *************");
      // create method isEvenNumber with parameter of type int
        // determine if argument is even number
        // return true is even number
        // return false if otherwise
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }
        System.out.println("******challenge 2 *******************");
      // modify while
        // also record total number of even numbers it has found
        // break if found 5 numbers
        // end display the total number of even numbers found
        int evenCount = 0;
        int number2 = 5;
        int finishNumber2 = 20;
        while (number2 <= finishNumber2) {
            if (!isEvenNumber(number2)) {
                number2++;
                continue;
            }
            System.out.println("Even number " + number2);
            number2++;
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println(" Total number of Even number found = " + evenCount);
    }

    public static boolean isEvenNumber(int evenOrOddNumber) {
        if ((evenOrOddNumber % 2) == 0) { //even number
            return true;
        } else {
            return false;
        }
    }
}
