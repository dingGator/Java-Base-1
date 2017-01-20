package ExamWatch;

/**
 * Created by Ki on 1/19/2017.
 */
public class VariableScope {
    public static void main(String[] args) {
        int x = 3;
        for (x = 12; x < 20; x++) {
            System.out.println(" x = " + x);
        }
        for ( int a = 3; a <20; a++){
            System.out.println("inside loop a = "+a);
        }
       // System.out.println(" outside loop a = "+ a);  // ILLEGAL a is out of scope
    }
}
