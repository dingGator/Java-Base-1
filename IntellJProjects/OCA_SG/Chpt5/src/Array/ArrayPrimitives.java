package Array;

/**
 * Created by Ki on 1/12/2017.
 */
public class ArrayPrimitives {
    public static void main(String[] args) {
        int [] weightList = new int[5];
        byte b =4;
        char c = 'c';
        short s = 7;
        weightList[0] = b;  // byte is smaller than int
        weightList[1] =c;   // char is smaller that int
        weightList[2] = s;  // short is smaller than int

        for (int x = 0; x < weightList.length; x++) {
            System.out.println(" weightList[" + x + "] = " + weightList[x]);
        }
    }
}
