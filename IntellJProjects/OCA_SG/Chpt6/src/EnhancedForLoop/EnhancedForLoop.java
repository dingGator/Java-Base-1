package EnhancedForLoop;

/**
 * Created by Ki on 1/19/2017.
 */
public class EnhancedForLoop {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]);
        }

        for (int n : a)
            System.out.print(n);

        int x1;
        long x2;
        long[] la = {7L, 8L, 9L};
        int[][] twoDee = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] sNums = {"one", "two", "three"};
        Animal[] animals = {new Dog(), new Cat()};
        for (long y : la) ;
        for (int[] n : twoDee) ;
        for (int n2 : twoDee[2]) ;
        for (String s : sNums) ;
        for (Object o : sNums) ;
        for (Animal a3 : animals) ;
       /* illegal for declaration
       // for (x2:la);              // x2 is already declared
        for (int x2 : twoDee) ;     // cannot stuff an array into an int
        for (int x3 : la) ;         //cannot stuff a long into a int
        for (Dog d : animals) ;     //you might get a Cat

    */

    }


}