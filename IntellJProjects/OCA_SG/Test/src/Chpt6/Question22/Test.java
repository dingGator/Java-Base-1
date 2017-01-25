package Chpt6.Question22;

/**
 * Created by Ki on 1/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        short [][] b = new short[4][4];
        short [][] big = new short [2][2];
        short b3 = 8;
        short b2 [][][][] = new short[2][3][2][2];
        b2[1][1] = big;
        b[1][0] = b3;
     //   b2[0][1][1] = b;
     //   b2[0][2][1] = b[1][0];
        b2[1][1][0][1] = b[1][0];
        b2[1][1] =b;
    }
}
