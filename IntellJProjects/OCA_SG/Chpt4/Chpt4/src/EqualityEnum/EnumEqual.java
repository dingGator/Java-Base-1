package EqualityEnum;

import static java.awt.PageAttributes.MediaType.C2;

/**
 * Created by Ki on 1/4/2017.
 */
public class EnumEqual {
    enum Color {RED, BLUE}

    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.RED;
        if (c1==c2) {
            System.out.println("==");
        }
        if (c1.equals(c2)){
            System.out.println("dot equals");
        }
    }
}
