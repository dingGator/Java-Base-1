package Array;

/**
 * Created by Ki on 1/11/2017.
 */
public class Dog {
    static String puppy = "Frodo";
    static String puppy1 = "Clover";
    static String puppy2 = "Aiko";

    public static void main(String[] args) {
        Dog[] myDogs = new Dog[6];
        for (int x = 0; x < myDogs.length; x++) {
            myDogs[x] = new Dog();
        }
        for (int x = 0; x < myDogs.length; x++) {
            System.out.println("myDogs["+x+"]"+ myDogs[x]);

        }

        int[][] myArray = new int[6][6];

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                myArray[x][y] = x + y;
            }
        }

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                System.out.println("myArray[" + x + "]" + "[" + y + "] = " + myArray[x][y]);
            }
        }

        int a = 9;
        int[] dots = {6, a, 8};
        int[] dots2;
        dots2 = new int[6];
        int b = 9;
        dots2[0] = 6;
        dots2[1] = b;
        dots2[2] = 8;
        dots2[3] = 5;
        dots2[4] = a;
        dots2[5] = 6 + 8;

        for (int x = 0; x < dots.length; x++) {
            System.out.println("dots[" + x + "]" + dots[x]);
        }

        for (int x = 0; x < 6; x++) {
            System.out.println("dots2[" + x + "]" + dots2[x]);
        }

        System.out.println("Dog.puppy = " + Dog.puppy);
        System.out.println("Dog.puppy1 = " + Dog.puppy1);
        System.out.println("Dog.puppy2 = " + Dog.puppy2);




    }
}

