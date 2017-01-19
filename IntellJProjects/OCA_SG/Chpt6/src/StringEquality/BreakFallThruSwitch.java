package StringEquality;

/**
 * Created by Ki on 1/18/2017.
 */
public class BreakFallThruSwitch {
    public static void main(String[] args) {
        String s = "green";
        switch (s) {
            case "red":
                System.out.println("red");
            case "green":
                System.out.println("green");
            case "blue":
                System.out.println("blue");
            default:
                System.out.println("done");
        }
        System.out.println("out of switch");

        /****************************/
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("x is one");
            case 2:
                System.out.println("x is two");
            case 3:
                System.out.println("x is three");
        }
        System.out.println("out of switch");
/**************************************/
        int b = 1;
        switch (b) {
            case 1:
                System.out.println("b is one");
                break;
            case 2:
                System.out.println("b is two");
                break;
            case 3:
                System.out.println("b is three");
                break;
        }

        System.out.println("out of switch");
        /*************************/
        int c = 6;
        switch (c) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("c is an even number ");
        }
            /************************/
            int d = 6;
            switch (d) {
                case 2:
                case 4:
                case 6:
                case 8:
                case 10: {
                    System.out.println("d is an even number ");
                }
                default:
                    System.out.println("d is an odd number");
            }
                    /*
            switch (c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    //    System.out.println("x is an even number ");break;
                default:
                    //    System.out.println(" x is an odd number");

            }
        }

*/
        }
    }
