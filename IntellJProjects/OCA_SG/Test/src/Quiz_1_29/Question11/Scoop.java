package Quiz_1_29.Question11;

/**
 * Created by Ki on 1/30/2017.
 */
public class Scoop {
    static int thrower() throws Exception{return 42;}

    public static void main(String[] args) {
        try {
            int x = thrower();
        }catch (Exception e){
        //    x++;
        }finally {
        //    System.out.println("x = "+ ++x);
        }
    }
}
