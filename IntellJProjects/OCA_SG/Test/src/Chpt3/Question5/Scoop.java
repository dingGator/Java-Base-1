package Chpt3.Question5;

/**
 * Created by Ki on 12/29/2016.
 */
public class Scoop {
    static int thrower() throws Exception{return 42;}

    public static void main(String[] args) {
        try{
            int x = thrower();
        }catch (Exception e){
          //  x++;
        }finally {
          //  System.out.println("x = [" + ++x + "]");
        }
    }
}
