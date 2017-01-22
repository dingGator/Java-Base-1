package SelfTest_Chpt6.Question3;

/**
 * Created by Ki on 1/21/2017.
 */
public class Question3 {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("two");
        }
        /*catch (Exception e){
            System.out.println(e);
        }
        */
        catch (NumberFormatException e1) {
            System.out.println("**NumberFormatException =  " + e1);

        }
        catch (IllegalArgumentException e2) {
            System.out.println(" **IllegalArgumentException = " + e2);
        }

    }
}
