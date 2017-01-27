package Quiz_1_26.Question15;

/**
 * Created by Ki on 1/26/2017.
 */
public class Kitty {
    String name = "kitty";

    Kitty(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Kitty k = new Kitty("Niki");
        System.out.println(k.name);
    }
}
