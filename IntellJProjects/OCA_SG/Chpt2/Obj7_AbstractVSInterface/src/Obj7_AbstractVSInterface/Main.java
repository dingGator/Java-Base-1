package Obj7_AbstractVSInterface;

public class Main {

    private static int bf;

    static {
        bf = 79;
    }


    public static void main(String[] args) {
        // write your code here

        Tire tire = new Tire();
        tire.setBounceFactor(bf);
        tire.bounce();

        BeachBall beachBall = new BeachBall();
        beachBall.bounce();
        beachBall.setBounceFactor(bf);

        Ball ball= new Ball() {
            @Override
            public void bounce() {
                System.out.println(" main Ball override bounce");
            }

            @Override
            public void setBounceFactor(int bf) {
                System.out.println(" main Ball override setBounceFactor" +
                        "  bf = [" + bf + "]");
            }
        };

        ball.setBounceFactor(bf);
        ball.bounce();
        ball.beSpherical();

        Bounceable bounceable = new Bounceable() {
            @Override
            public void bounce() {
                System.out.println("main Bounceable override bounce");
            }

            @Override
            public void setBounceFactor(int bf) {
                System.out.println(" main Bounceable override setBounceFactor  bf = [" + bf + "]");
            }
        };
        bounceable.bounce();
        bounceable.setBounceFactor(bf);

    }





}
