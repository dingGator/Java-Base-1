package Quiz_1_27.Question7;



/**
 * Created by Ki on 1/27/2017.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
    void start(){
        long[]a1 = {1,2,3};
        long[]a2 = adjust(a1);
        System.out.print(a2[0]+a2[1]+a2[2]+" ");
        System.out.println(a1[0]+a1[1]+a1[2]);
    }
    long [] adjust(long []a3){
        a3[2] =4;
        return a3;
    }
}
