package Java_GarbageCollection;

import java.util.Date;

/**
 * Created by Ki on 12/28/2016.
 */
public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println(" Total JVM memory: " + rt.totalMemory());
        System.out.println(" Before Memory = " + rt.freeMemory());
        Date d = null;
        for (int i = 0; i < 100000000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After Memory = " + rt.freeMemory());
        for(int i =0;i<100000000; i++) {
            rt.gc(); //an alternate to system.gc()
            System.out.println("After GC Memory = " + rt.freeMemory());
        }
    }
}
