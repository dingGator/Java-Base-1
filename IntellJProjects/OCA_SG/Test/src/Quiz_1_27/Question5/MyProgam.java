package Quiz_1_27.Question5;

/**
 * Created by Ki on 1/27/2017.
 */
public class MyProgam {
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
