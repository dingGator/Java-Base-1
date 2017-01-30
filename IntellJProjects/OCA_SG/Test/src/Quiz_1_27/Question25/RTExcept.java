package Quiz_1_27.Question25;

/**
 * Created by Ki on 1/28/2017.
 */
public class RTExcept {
    public static void throwit(){
        System.out.print("throwit ");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try{
            System.out.print("hello ");
            throwit();
        }
        catch (Exception re){
            System.out.print("caught ");
        }
        finally {
            System.out.print("finally ");
        }
        System.out.println("after ");
    }
}
