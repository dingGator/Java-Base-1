package Quiz_2_6.Question16;

/**
 * Created by Ki on 2/7/2017.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
    void start(){
        String s1 = "one";
        String s2 = alter(s1);
        System.out.println(s1 +" "+ s2);
    }
    String alter(String s1){
        s1 = s1 + " two";
        System.out.print(s1 + " ");
        return "three";
    }
}
