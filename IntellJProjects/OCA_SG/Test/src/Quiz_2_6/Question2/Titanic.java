package Quiz_2_6.Question2;

/**
 * Created by Ki on 2/6/2017.
 */
public class Titanic {
    public static void main(String[] args) {
        Boolean b1 =true;
        boolean b2 = false;
        boolean b3 = true;
        if((b1&b2)|(b2&b3)&b3)
            System.out.println("alpha ");
        if((b1 = false)| (b1&b3) | (b1|b2))
            System.out.println("beta ");
    }
}
