package SelfTest_Chpt6.Question10;

/**
 * Created by Ki on 1/21/2017.
 */
public class Circles {
    public static void main(String[] args) {
        int [] ia = { 1,3,5,7,9};
        for(int x: ia){
            for(int j =0; j<3; j++){
                if(x >4 && x< 8 ) continue;
                System.out.println(" x = "+x+" j = "+j);
                if(j == 1)break;
                System.out.println(" *****x = "+x+ " j = "+j);
                continue;
            }
            continue;
        }
    }
}
