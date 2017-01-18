package StringEquality;

/**
 * Created by Ki on 1/18/2017.
 */
public class StringEquality {
    public static void main(String[] args) {
        String s = "Monday";
        switch (s){
            //not match:  case sensitive
            case "MONDAY":
                System.out.println("Match:  MONDAY");
                break;
            //not match:  case sensitive
            case "MOnday":
                System.out.println("Match:  MONDAY");
                break;

            // match
            case "Monday":
                System.out.println("Match:  Monday");
                break;

            default:
                System.out.println(" no match");
        }

    }
}
