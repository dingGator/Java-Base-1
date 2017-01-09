package SelfTest_Chpt4.Question8;

/**
 * Created by Ki on 1/8/2017.
 */
public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 =  false;
        if((b2= false)|(21%5)>2)    s+="x";
        if(b1 ||(b2==true))         s+="y";
        if(b2==true)                s+="z";
        System.out.println(s);
    }
}
