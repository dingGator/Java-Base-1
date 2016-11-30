package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public class Ball implements Bounceable {
    public void bounce(){
            System.out.println(" Ball implements Bounceable bounce:  ball bouncing");
    }


        public void setBounceFactor(int bf) {

        System.out.println("Ball implements Bounceable setBounceFactor:  bounce factor bf  "+bf);
    }
}
