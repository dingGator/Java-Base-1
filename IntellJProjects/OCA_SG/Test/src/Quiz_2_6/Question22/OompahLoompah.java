package Quiz_2_6.Question22;

/**
 * Created by Ki on 2/8/2017.
 */
public class OompahLoompah {
    public static void main(String[] args) {
        final StringBuilder str = new StringBuilder("I good!");
        str.insert(2,"look ").append("and nice");
        str.insert(str.length(), "!!!");
        str.delete(str.length() - 2, str.length());
        System.out.println(str.toString().trim());
    }
}
