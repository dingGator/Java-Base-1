package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Frog {
    static int frogCount = 0;

    int frogCountError = 0;



    public Frog(){
        frogCount += 1;
        frogCountError += 1;
        System.out.println("frogCount is static:  count is now  " + frogCount);
        System.out.println("frogCountError is not static:  count is now  " + frogCountError);



    }

    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("Main Frog count is now  " + frogCount);
    //    System.out.println("FrogCountError count is now  " + frogCountError);



    }
}
