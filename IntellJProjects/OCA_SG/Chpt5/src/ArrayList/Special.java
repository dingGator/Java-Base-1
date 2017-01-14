package ArrayList;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Ki on 1/13/2017.
 */
public class Special {
    private
    StringBuilder s =  new StringBuilder("bob");
    StringBuilder getName(){return s;}
    void printName(){
        System.out.println(s);
    }

}
