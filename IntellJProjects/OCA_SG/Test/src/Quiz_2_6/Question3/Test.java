package Quiz_2_6.Question3;

/**
 * Created by Ki on 2/6/2017.
 */
public class Test {
    public static void main(String[] args) {
        try{
            m1();
            m2();
        }catch(Exception e1){
            System.out.println(" except ");
        }
    }
    static void m1()throws Exception{
        try {
            throw new Exception();
        }catch (Exception e2){
            System.out.println("m1catch ");
        }
    }
    static void m2() throws Exception{
        try {
            throw new Exception();
        }finally {
            System.out.println(" m2finally ");
        }
    }
}
