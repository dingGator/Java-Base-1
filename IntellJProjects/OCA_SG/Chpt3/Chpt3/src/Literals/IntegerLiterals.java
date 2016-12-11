package Literals;

/**
 * Created by Ki on 12/10/2016.
 */
public class IntegerLiterals {
    public static void main(String[] args) {
        int pre7 =1000000;
        int with7 = 1_000_000;
        int i2 = 10_0000_0;

        int b1 = 0B101010;
        int b2 = 0b00011;
        System.out.println("pre 7 = " + pre7 +
                "\n pre 7 = " + pre7 +
                "\n illegal  = _1_000_000 can not begin with _ " +
                "\n int confusion i2=  10_0000_0= "+ i2+
                "\n binary int b1 = "+ b1 +
                "\n binary int b2 = "+ b2

        );

    }
}
