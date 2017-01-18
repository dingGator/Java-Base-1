package LegalIf;

/**
 * Created by Ki on 1/17/2017.
 */
public class LegalIf {
    public static void main(String[] args) {
        int y = 5;
        int x = 2;
        if (((x > 3) && (y < 2)) | doStuff()) {
            System.out.println("true");
        }
        if ((x > 3) && (y < 2) | doStuff()) {
            System.out.println("true2");
        }
        int trueInt = 1;
        int falseInt = 0;
     /******not legal
       if (trueInt) {
            System.out.println("trueInt ");
        }
        if (trueInt == true) {
            System.out.println("trueInt == true");
        }
        if (1) {
            System.out.println(" 1 ");
        }
        if (falseInt == false) {
            System.out.println("falseInt == false");
        }
    */
     //LEGAL
     if (trueInt ==1){
            System.out.println( "trueInt ==1");
        }
        if (falseInt ==0){
            System.out.println("falseInt ==0");
        }

    }

    static boolean doStuff() {
        System.out.println("doStuff ");
        return true;
    }


}
