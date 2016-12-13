package Literals;

/**
 * Created by Ki on 12/12/2016.
 */
public class FloatPoint {
 //   float f = 32.3;
    static float f = (float)32.3;
    static float g = 32.3f;
    static float h = 32.3F;
     static byte a =127;  // byte can only up to 127
    static byte b = (byte) 128;

    public static void main(String[] args) {
        System.out.println("  float f = (float)32.3; = " + f+
        "\n  float g = 32.3f; = "+g +
        "\n  float h = 32.3F; = "+ h+
        "\n  byte a =127;  // byte can only up to 127 = " + a+
        "\n  byte b = (byte) 128; = " + b);
    }

}
