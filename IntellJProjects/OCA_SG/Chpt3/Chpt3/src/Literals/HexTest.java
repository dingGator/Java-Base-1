package Literals;

/**
 * Created by Ki on 12/7/2016.
 */
public class HexTest {
    public static void main(String[] args) {
        int x = 0X0001;
        int y = 0x7fffffff;
        int z= 0xDeadCafe;
        int z2 = 0XDEADCAFE;
        long  jo= 110599L;
        long so = 0xFFFFl;  // lowercase 'l'
        System.out.println(" x = " +x + "\n y = " + y + "\n z = " +z+"\n z2 = " +z2
                +"\n jo = " +jo+"\n so = " +so);
    }
}
