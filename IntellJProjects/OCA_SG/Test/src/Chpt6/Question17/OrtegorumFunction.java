package Chpt6.Question17;

/**
 * Created by Ki on 1/24/2017.
 */
public class OrtegorumFunction {
    public int computeDiscontinuous(int x) {
        int r = 1;
        r += x;
        if ((x > 4) && (x < 10)){
            r += 2 * x;
        //}else(x <= 4) {
            r += 3 * x;
        }else{
            r += 4 * x;
        }
        r += 5 * x;
        return r;
    }

    public static void main(String[] args) {
        OrtegorumFunction o = new OrtegorumFunction();
        System.out.println("OF(11) is: " + o.computeDiscontinuous(11));
    }
}

