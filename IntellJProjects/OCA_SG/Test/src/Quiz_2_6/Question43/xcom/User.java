package Quiz_2_6.Question43.xcom;

/**
 * Created by Ki on 2/9/2017.
 */
import static Quiz_2_6.Question43.xcom.Stuff.MY_CONSTANT;
import static Quiz_2_6.Question43.xcom.Stuff.*;

import static java.lang.System.out;
public class User {
    public static void main(String[] args) {
        new User().go();
    }
    void go(){
        out.println(doStuff(MY_CONSTANT));
    }
}
