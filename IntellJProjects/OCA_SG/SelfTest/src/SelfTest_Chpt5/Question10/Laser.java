package SelfTest_Chpt5.Question10;

import SelfTest_Chpt4.Question10.Boat;

/**
 * Created by Ki on 1/13/2017.
 */
public class Laser {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box[] ba = go(b1, new Box(6));
        ba[0] =b1;
        for (Box b :ba) System.out.print(b1.size + " ");
    }
    static Box[] go (Box b1, Box b2){
        b1.size =4;
        Box[] ma = { b2,b1};
        return ma;
    }
}
