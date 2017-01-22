package SelfTest_Chpt6.Question5;

/**
 * Created by Ki on 1/21/2017.
 */
public class Loopy {
    public static void main(String[] args) {
        int [] x = {7,6,5,4,3,2,1};

        for(int y:x) { //Yes
        //for(x:int y){// NO
        //int y =0; for(y:x){ // NO
        //for (int y =0, z=0; z<x.length; z++){ y=x[z]; //yes
        //for(int y =0, int z = 0; z< x.length; z++){y = x[z];// NO
        //int y =0; for(int z =0;z<x.length; z++){ y = x[z];  //yes
            System.out.print(y + " ");
        }

    }
}
