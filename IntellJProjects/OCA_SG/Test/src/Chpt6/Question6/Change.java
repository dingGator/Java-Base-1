package Chpt6.Question6;

/**
 * Created by Ki on 1/22/2017.
 */
public class Change {
    private static void changeIt(int num,
                                 String str, StringBuilder builder) {
        num = 5;
        str += "b";
        builder.append("d");
    }

    public static void main(String[] args) {
        int num = 1;
        String str = "a";
        StringBuilder builder = new StringBuilder("c");
        changeIt(num, str, builder);
        System.out.println("num: " + num);
        System.out.println("str: " + str);
        System.out.println("builder: " + builder+ "*");

    }

}

