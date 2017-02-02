package Quiz_1_30.Question5;

/**
 * Created by Ki on 2/1/2017.
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


