package SelfTest_Chpt6.Question2;

/**
 * Created by Ki on 1/21/2017.
 */
public class Plane {
    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }

    void s1() {
        try {
            s2();
            System.out.println(" s = "+  s );
        } catch (Exception e) {
            System.out.println("catch:  e = "+ e+ "\n s = "+ s);
            s += "c";
        }
    }

    void s2() throws Exception {
        s3();
        s += "2";
        System.out.println("s = += 2 = " + s);
        s3();
        s += "2b";
        System.out.println("s = += 2b" + s);

    }

    void s3() throws Exception {
        throw new Exception();
    }

}
