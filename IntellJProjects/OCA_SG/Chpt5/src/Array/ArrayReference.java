package Array;

/**
 * Created by Ki on 1/12/2017.
 */
public class ArrayReference {
    public static void main(String[] args) {


    int[] blots;
    int[][] squeegees = new int[3][];
    //blots = squeegees;  //  NO  bcs squeegess is a 2-D  array of int
    int []blocks =  new int[6];
    blots = blocks;   // bcs blocks is an int array
        int [][] books = new int [3][];
        int [] numbers = new int[6];
        int aNumber =7;
        //books[0] = aNumber;  // NO expecting an int array not an int
        books[0] = numbers;  //OK numbers is an int array


    }}
