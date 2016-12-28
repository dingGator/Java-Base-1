package Java_GarbageCollection;

/**
 * Created by Ki on 12/28/2016.
 */
public class Island2 {
    Island2 island2;
    int x = 5;
    String y = " hello ";


    public static void main(String[] args) {
        //    System.out.println("island2 = [" + island2 + "]");

        Island2 i2 = new Island2();
        Island2 i3 = new Island2();
        Island2 i4 = new Island2();

        System.out.println("i3.x = [" + i3.x + "]");
        System.out.println("i2.y = [" + i2.y + "]");
        System.out.println("i4.x = [" + i4.x + "]");

        i2.island2 = i3;
        i3.island2 = i4;
        i4.island2 = i2;
        System.out.println("i3.island2 = [" + i3.island2 + "]");
        System.out.println("i2.island2 = [" + i2.island2 + "]");
        System.out.println("i4.island2 = [" + i4.island2 + "]");

        i2.island2 = i3.island2;
        i3.island2 = i4.island2;
        i4.island2 = i2.island2;
        System.out.println("i3.island2 = [" + i3.island2 + "]");
        System.out.println("i2.island2 = [" + i2.island2 + "]");
        System.out.println("i4.island2 = [" + i4.island2 + "]");

        i3.island2.x = 3;
        i2.island2.y = " new i2.island2.y ";// this y is replaced by the second y
        i4.island2.y = " new i4.island2.y";
        System.out.println("i3.island2.x = [" + i3.island2.x + "]");
        System.out.println("i3.island2.y = [" + i3.island2.y + "]");

        System.out.println("i2.island2.y = [" + i2.island2.y + "]");
        System.out.println("i4.island2.y = [" + i4.island2.y + "]");




        i2 = null;
        i3 = null;
        i4 = null;
        System.out.println("i3 = [" + i3 + "]");
        System.out.println("i2 = [" + i2 + "]");
        System.out.println("i4 = [" + i4 + "]");


        doComplexStuff();
        doComplicatedStuff();


    }

    public static void doComplicatedStuff() {
        System.out.println("****doComplicatedStuff****");
    }

    public static void doComplexStuff() {
        System.out.println("***doComplexStuff****");
    }
}
