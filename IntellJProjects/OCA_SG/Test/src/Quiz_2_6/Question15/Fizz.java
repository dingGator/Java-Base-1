package Quiz_2_6.Question15;

/**
 * Created by Ki on 2/7/2017.
 */
public class Fizz {
    int x =5;

    public static void main(String[] args) {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
   //     Fizz f3 = new FizzSwitch(f1,f2);
    //    if(f1 == f3)f1=f2;
    //    System.out.println(f2 ==f3 + " " + (f2.x == f3.x));

    }
    static  Fizz FizzSwitch(Fizz x,Fizz y ){
        final Fizz z =x;
        z.x =6;
        return z;
    }
}
