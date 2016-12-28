package Java_GarbageCollection;

import static Java_GarbageCollection.Island2.doComplexStuff;

/**
 * Created by Ki on 12/28/2016.
 */
public class Lost {
    public static void main(String[] args) {
        Lost x = new Lost();
        x= null;
        doComplexStuff();
    }
}
