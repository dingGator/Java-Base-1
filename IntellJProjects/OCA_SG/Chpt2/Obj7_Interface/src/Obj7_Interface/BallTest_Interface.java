package Obj7_Interface;

/**
 * Created by Ki on 11/30/2016.
 */
public class BallTest_Interface {
    private static int bounceFactor;

    static {
        bounceFactor = 55;
    }

    public static void main(String[] args) {
        System.out.println("****BallTest:  main");
        System.out.println("****Ball new ball");

        Ball ball = new Ball();
        ball.bounce();
        ball.setBounceFactor(90);

        System.out.println("****Bounceable bounceable = new Bounceable();   ");
        Bounceable bounceable = new Bounceable() {
            @Override
            public void bounce() {
                System.out.println("****override bounce  ");
            }

            @Override
            public void setBounceFactor(int bounceFactor1) {
                System.out.println("****override setBounceFactor:  bounceFactor = [" + bounceFactor1 + "]");
            }
        };
        bounceable.bounce();
        bounceable.setBounceFactor(89);

        System.out.println("****Bounceable bounceable1 = new Ball();    reference ");
        Bounceable bounceable1 = new Ball();
        bounceable1.setBounceFactor(bounceFactor);
        bounceable1.bounce();

        System.out.println("****Ball2   ");
        Ball2 ball2 = new Ball2();
        ball2.setBounceFactor(bounceFactor);
        ball2.bounce();
        ball2.run();

        System.out.println("****Ball3   ");
        Ball3 ball3 = new Ball3();
        ball3.bounce();
        ball3.setBounceFactor(bounceFactor);
        ball3.doSphericalThing();
        ball3.moveIt();


    }
}
