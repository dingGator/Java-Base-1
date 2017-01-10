package StringBuilderClass;

/**
 * Created by Ki on 1/9/2017.
 */
public class StringBuilder2 {
        public static void main(String[] args) {
            String a = "abc";
            a.concat("def");
            System.out.println("a = "+a);
            String b = "abc";
            b =b.concat("def");
            System.out.println("b = "+b);
            StringBuilder sb = new StringBuilder("abc");
            sb.append("def");
            System.out.println(sb);
            StringBuilder sb1 = new StringBuilder("abc");
            sb1.append("def").reverse().insert(3, "---");
            System.out.println(sb1);
        }

}
