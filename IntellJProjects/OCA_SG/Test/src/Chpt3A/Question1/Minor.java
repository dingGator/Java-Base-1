package Chpt3A.Question1;

/**
 * Created by Ki on 12/30/2016.
 */
public class Minor extends Uber {
    Minor(){
        super(y);
        y=y+3;
        System.out.println(" Minor y = "+y);

    }

    public static void main(String[] args) {
        System.out.println("main ");
        new Minor();
        System.out.println(" main  y = " + y);
    }

}
