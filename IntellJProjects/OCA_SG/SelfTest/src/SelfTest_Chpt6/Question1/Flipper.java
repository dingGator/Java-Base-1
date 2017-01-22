package SelfTest_Chpt6.Question1;

/**
 * Created by Ki on 1/21/2017.
 */
public class Flipper {
    public static void main(String[] args) {
        System.out.println("********** substring(1,3) *****");
        String o = "-";
        switch("FRED".toLowerCase().substring(1,3)){
            case "yellow":
                o += "y";
                System.out.println("case yellow "+o);
            case "red":
                o += "r";
                System.out.println("case red "+o);

            case "green":
                o += "g";
                System.out.println("case green "+ o);

        }
        System.out.println(o);
        System.out.println("********** substring(1,4)  *******");
        switch("FRED".toLowerCase().substring(1,4)){
            case "yellow":
                o += "y";
                System.out.println("case yellow "+o);
            case "red":
                o += "r";
                System.out.println("case red "+o);

            case "green":
                o += "g";
                System.out.println("case green "+ o);

        }
        System.out.println(o);
    }
}
