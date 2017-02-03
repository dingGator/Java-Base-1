package Quiz_1_30.Question14;

/**
 * Created by Ki on 2/2/2017.
 */
public class MyProgram {
    public static void throwIt(){
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try{
            System.out.print("Hello world ");
            throwIt();
            System.out.println("Done with try block ");
        }
        finally {
            System.out.println("Finally executing ");
        }
    }
}
