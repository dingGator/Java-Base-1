package Quiz_1_29.Question13;

/**
 * Created by Ki on 1/30/2017.
 */
public class Circus {
    public static void main(String[] args) {
        int x =9;
        int y =6;
        for(int z =0; x<6;z++, y--){
            if (x>2)x--;
            label:
            if (x>5){
                System.out.println(x +" ");
                --x;
                //continue label;
            }
            x--;
        }
    }
}
