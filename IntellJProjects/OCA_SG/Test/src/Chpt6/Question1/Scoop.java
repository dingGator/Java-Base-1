package Chpt6.Question1;

/**
 * Created by Ki on 1/22/2017.
 */
public class Scoop {
    static int thrower() throws Exception{return 42;}

    public static void main(String[] args) {

        try{
            int x = thrower();
        } catch (Exception e){
            x++;
        } finally {
            System.out.println("x = "+ ++x);
        }
    }
}
