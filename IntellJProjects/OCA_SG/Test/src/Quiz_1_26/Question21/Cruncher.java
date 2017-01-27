package Quiz_1_26.Question21;

/**
 * Created by Ki on 1/26/2017.
 */
public class Cruncher {
     int sum;

    public static void main(String[] args) {
        int y =7;
        String s = y + "z";
        new Cruncher().go(Integer.parseInt(args[0]));

    }
    int go(int x){
        sum +=x;
        if(x==0){
            System.out.println("sum: " + sum);
        }
        return (go(--x));
    }
}
