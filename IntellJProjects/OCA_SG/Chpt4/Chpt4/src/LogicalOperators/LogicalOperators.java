package LogicalOperators;

/**
 * Created by Ki on 1/6/2017.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        byte b1 = 6&8;
        byte b2 = 7|9;
        byte b3 = 5^4;
        System.out.println(b1 + " "+ b2 + " "+ b3);

        int z =5;
        if(++z>5 || ++z >6)z++;
        System.out.println(z);


        int z1 =5;
        if(++z1 >5 | ++z1>6) z1++;
        System.out.println(z1);

        System.out.println("xor "+ ((2<3)^(4>3)));
        if(!(7==5)) {
            System.out.println("not equal");
        }

        boolean t = true;
        boolean f = false;
        System.out.println("! "+ (t &  !f)+ " "+f);

    }
}
