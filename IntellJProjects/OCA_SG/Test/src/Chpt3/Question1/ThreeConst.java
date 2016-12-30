package Chpt3.Question1;

/**
 * Created by Ki on 12/29/2016.
 */
public class ThreeConst {
    public static void main(String[] args) {
        new ThreeConst(4L);
    }

    public ThreeConst(int x) {
        this();
        System.out.print(" " + (x * 2));
    }

    public ThreeConst(long x) {
        this((int) x);
        System.out.print(" " + x);
    }

    public ThreeConst() {
        System.out.print(" no-arg");
    }
}


