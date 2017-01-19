package ExamWatch;

/**
 * Created by Ki on 1/18/2017.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int x =1;
        /*  NOT compile: x is not a boolena
        while(x){}
        while(x=5){}
        */
        x=5;
        // infinite loop
        while (x == 5) {
            System.out.println( "x ==5");
         x=6;
        }
        /*  infinite loop
        while (true){
            System.out.println(" true ");

        }
        */

    }
}
