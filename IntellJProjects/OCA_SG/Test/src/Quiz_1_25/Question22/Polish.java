package Quiz_1_25.Question22;

/**
 * Created by Ki on 1/25/2017.
 */
public class Polish {
    public static void main(String[] args) {
        int x =4;
        StringBuilder sb = new StringBuilder("..fedcba");
        sb.delete(3,6);
        sb.insert(3,"az");
        if (sb.length()>6) x= sb.indexOf("b");
        sb.delete ((x-3),(x-2));
        System.out.println(sb);
    }
}
