package StringBuilderClass;

/**
 * Created by Ki on 1/9/2017.
 */
public class StringBuilder {
    public static void main(String[] args) {
        String a = "abc";
        a.concat("def");
        System.out.println("a = "+a);
        String b = "abc";
        b =b.concat("def");
        System.out.println("b = "+b);
        StringBuilder sb = new StringBuilder("abc");
    }
}
