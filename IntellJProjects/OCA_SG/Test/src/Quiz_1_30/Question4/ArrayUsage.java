package Quiz_1_30.Question4;

/**
 * Created by Ki on 2/1/2017.
 */
public class ArrayUsage {
    public static void main(String[] args) {
        int[]a = new int [4];
        a[0] =4;
        a[a.length -1] =4;
        System.out.println(a[0]+a[3]);
        if (a instanceof Object)
            System.out.println(" -Yes!");
    }
}
