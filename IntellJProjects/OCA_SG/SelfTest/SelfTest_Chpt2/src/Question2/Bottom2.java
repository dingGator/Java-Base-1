package Question2;

/**
 * Created by Ki on 12/4/2016.
 */
public class Bottom2 extends Top {

    public Bottom2(String s){
        System.out.println("D");
    }

    public static void main(String[] args) {
        System.out.println("***Main  1 ");
        new Bottom2("C");
        System.out.println("***Main  2 ");

        System.out.println(" hi ");
    }
}
