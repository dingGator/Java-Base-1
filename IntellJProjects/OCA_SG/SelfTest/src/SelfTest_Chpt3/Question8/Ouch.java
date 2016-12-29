package SelfTest_Chpt3.Question8;

/**
 * Created by Ki on 12/28/2016.
 */
public class Ouch {
    static int ouch =7;

    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.print(" " + ouch);
    }
    void go(int ouch){
        ouch++;
        //for (int ouch =3; ouch<6;ouch++);
        System.out.println(" "+ouch);
    }


}
