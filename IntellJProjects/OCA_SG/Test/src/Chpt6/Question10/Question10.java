package Chpt6.Question10;

/**
 * Created by Ki on 1/24/2017.
 */
public class Question10 {
    public static void main(String[] args) {
        String d = "beekeeper";
        d.substring(1,7);
        String a = d.substring(1,7);
        System.out.println("a = "+a);
        System.out.println("d = "+d);
        d = "w" +d;
       // d.insert(3,"bee");
        System.out.println("new d = "+d);
    }
}
