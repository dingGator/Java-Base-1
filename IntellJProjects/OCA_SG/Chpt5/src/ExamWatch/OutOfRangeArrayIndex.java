package ExamWatch;

/**
 * Created by Ki on 1/11/2017.
 */
public class OutOfRangeArrayIndex {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[4] = 2;
       // x[5] = 3;  // index out of bound
        int [] z = new int [2];
        int y = -3;
        // z[y] =4;  // index out of bound
    }
}
