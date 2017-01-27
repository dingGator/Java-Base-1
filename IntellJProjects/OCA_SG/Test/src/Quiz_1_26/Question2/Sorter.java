package Quiz_1_26.Question2;

/**
 * Created by Ki on 1/26/2017.
 */
import java.util.*;
public class Sorter {
    public static void main(String[] args) {
        ArrayList<String> sa = new ArrayList<>();
        sa.add("a");sa.add("b");sa.add("c");
        String sb[] = new String[3];
        for (int x =1;x<sa.size();x++)
            sb[x] = sa.get(x);
        for (String s:sb)
            System.out.print(s +" ");
    }
}
