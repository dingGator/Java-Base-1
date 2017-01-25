package Chpt6.Question25;

/**
 * Created by Ki on 1/24/2017.
 */
public class Question25 {
    public static void main(String[] args) {
        int k = 2;
        outer:
        while (true) {
            ++k;
            inner:
                for (int j = 6; j > 2; j--) {
                    k = 8 - j;
                    if (j == 3)
                        continue inner;
                    break outer;
            }
            continue outer;
        }
        System.out.println(k);
    }
}
