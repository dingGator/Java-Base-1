package Ex3_1;

/**
 * Created by Ki on 12/7/2016.
 */
public class CastingPrimitives {

    static float f = 234.56f;
    static short s = (short) f;
    static float f2 = 234.56f;
    static short s2 = (short) f2;

    public static void main(String[] args) {
        System.out.println("    float f = 234.56f;  =  " + f +
                "\n    short s = (short) f;  =  " + s +
                "\n    static float f2 = 234.56f;  =  " + f2 +
                "\n    static short s2 = (short) f2;f =  " + s2 +
                "\n    Casting short s = (short) f  =  " + s2);
    }
}
