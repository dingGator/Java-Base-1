package Obj7_Interfaces;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tire tire = new Tire();
        tire.bounce();
        tire.setBounceFactor(5);
        Zap zap = new Zap();
        zap.go();
        tire.bounce1();
        tire.bounce2();
        tire.bounce3();
        tire.bounce4();

    }
}
