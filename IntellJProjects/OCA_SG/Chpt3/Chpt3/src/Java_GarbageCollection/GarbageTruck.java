package Java_GarbageCollection;

/**
 * Created by Ki on 12/27/2016.
 */
public class GarbageTruck {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sb hello");
        System.out.println("  sb  = " +sb);
        //The StringBuffer object is not eligible for collection
         sb = null;
        // Now the StringBuffer object is eligible for collection
        System.out.println("  sb = " +sb);


        StringBuffer s1 = new StringBuffer("s1 hello");
        StringBuffer s2 = new StringBuffer("s2 goodbye");
        System.out.println("  s1  = "+s1);
        System.out.println("  s2  = "+s2);

        //The StringBuffer object "hello" is not eligible for collection
        System.out.println("  s1  = s2  ");

        s1=s2; // redirect s1 to refer to "goodbye" object
        // now the Stringbuffer " hello" is eligiblie for collection
        System.out.println("  s1  = "+s1);
        System.out.println("  s2  = "+s2);

    }
}
