package ExamWatch;

/**
 * Created by Ki on 1/10/2017.
 */
public class StringBuilder_ExamWatch {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        System.out.println(sb);
        sb.reverse().insert(4, "---").reverse();
        System.out.println(sb);
        /*********************/
        String x = "abc";
        String y =x.concat("def").toUpperCase().replace('C','x');
        System.out.println("y = "+y);
    }
}
