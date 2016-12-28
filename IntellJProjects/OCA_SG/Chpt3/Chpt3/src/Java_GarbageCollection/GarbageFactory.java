package Java_GarbageCollection;

/**
 * Created by Ki on 12/27/2016.
 */
import java.util.Date;



public class GarbageFactory {
    public static void main(String[] args) {
        Date d = getDate();
        doComplicatedStuff();
        System.out.println(" d = [" + d + "]");

    }
    public static Date getDate(){
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }
    public static void doComplicatedStuff(){
        System.out.println("****doComplicatedStuff****");
    }
}
