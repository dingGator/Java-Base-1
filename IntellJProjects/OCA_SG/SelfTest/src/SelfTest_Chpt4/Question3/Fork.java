package SelfTest_Chpt4.Question3;

/**
 * Created by Ki on 1/7/2017.
 */
public class Fork {
    public static void main(String[] args) {
        if (args.length == 1 | (args[1].equals("test")))
        {    System.out.println("test case");
        }else {
            System.out.println("production"+ args[0]);
        }
    }
}
