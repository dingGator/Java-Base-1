package Chpt6.Question14;

/**
 * Created by Ki on 1/24/2017.
 */
public class rpn {
    public static void main(String[] args) {
        System.out.print((3 + 4 * 5 - 6) + " ");
        System.out.print((3 + 4 * (5 - 6)) + " ");
        System.out.print(((3 + 4) * 5 - 6) + " ");
        System.out.print((3 + 4) * (5 - 6) + " ");
    }
}
