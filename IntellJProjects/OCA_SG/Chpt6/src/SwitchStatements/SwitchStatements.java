package SwitchStatements;

/**
 * Created by Ki on 1/17/2017.
 */
public class SwitchStatements {
    public static void main(String[] args) {
        int x = 3;
        if (x == 1) {
            System.out.println("x equals 1 " + x);
        } else if (x == 2) {
            System.out.println("x equal 2 " + x);
        } else {
            System.out.println(" No idea what  x is " + x);
        }

        int s =3;
        switch (s){
            case 1 :
                System.out.println("x equals 1 "+ x);
                break;
            case 2:
                System.out.println("x equals 2 "+x);
                break;
            default:
                System.out.println("No idea what x is "+x);
        }
    }
}
