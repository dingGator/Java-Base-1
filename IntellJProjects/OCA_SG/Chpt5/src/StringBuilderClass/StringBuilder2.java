package StringBuilderClass;

/**
 * Created by Ki on 1/9/2017.
 */
public class StringBuilder2 {
        public static void main(String[] args) {
            String a = "abc";
            a.concat("def");
            System.out.println("a = "+a);
            /****************************************/
            String b = "abc";
            b =b.concat("def");
            System.out.println("b = "+b);
            /****************************************/
            StringBuilder sb = new StringBuilder("abc");
            sb.append("def");
            System.out.println(sb);
            /****************************************/
            StringBuilder sb1 = new StringBuilder("abc");
            sb1.append("def").reverse().insert(3, "---");
            System.out.println(sb1);
            /****************************************/
            StringBuilder sb2 =new StringBuilder("set ");
            sb2.append("point");
            System.out.println(sb2);
            /****************************************/
            StringBuilder sb3 = new StringBuilder("pi = ");
            sb3.append(3.14159f);
            System.out.println(sb3);
            /****************************************/
            StringBuilder sb4 = new StringBuilder("0123456789");
            System.out.println(sb4.delete(4,6));
            // note: 4 is index value ===** zero-base
            // note: 6 is the endpoint  value ====  one base
            /****************************************/

            StringBuilder sb5 = new StringBuilder("01234567");
            sb5.insert(4,"---");
            System.out.println(sb5);
            /****************************************/
            StringBuilder sb6 = new StringBuilder("A man a plan a canal Panama");
            sb6.reverse();
            System.out.println(sb6);
        }

}
