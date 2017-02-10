package Quiz_2_6.Question37;

/**
 * Created by Ki on 2/9/2017.
 */
public class Test {
    public static void main(String[] args) {
        short[][] b = new short[4][4];
        short[][]big = new short[2][2];
        short b3 =8;
        short b2 [][][][] = new short [2][3][2][2];
       //yes    b2[1][1] = big;
       //yes    b[1][0] = b3;
       //no     b2[0][1][1] =b;
       //no     b2[0][2][1]= b[1][0];
       //yes    b2[1][1][0][1] = b[1][0];
       //yes    b2[1][1] =b;

    }
}
