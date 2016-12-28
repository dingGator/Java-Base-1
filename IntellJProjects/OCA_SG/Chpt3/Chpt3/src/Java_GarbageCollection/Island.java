package Java_GarbageCollection;

/**
 * Created by Ki on 12/27/2016.
 */
public class Island {
    Island island ;

    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();


        i2.island = i3;         //i2 refers to i3
        i3.island = i4;         //i3 refers to i4
        i4.island = i2;         //i4 refers to i2
        System.out.println("i2 = [" + i2 + "]");
        System.out.println("i3 = [" + i3 + "]");
        System.out.println("i4 = [" + i4 + "]");

        i2 = null;
        i3 = null;
        i4 = null;
        System.out.println("i2 = [" + i2 + "]");
        System.out.println("i3 = [" + i3 + "]");
        System.out.println("i4 = [" + i4 + "]");

    }
}
