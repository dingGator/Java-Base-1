package Chpt6.Question9;

/**
 * Created by Ki on 1/24/2017.
 */
public class OompahLoompah {
    public static void main(String[] args) {
        final StringBuilder str = new StringBuilder("I good! ");
        str.insert(2,"look ").append("and nice");
        str.insert(str.length(), "!!!");
        str.delete(str.length() -2, str.length());
        System.out.println(str.toString().trim());
    }
}
