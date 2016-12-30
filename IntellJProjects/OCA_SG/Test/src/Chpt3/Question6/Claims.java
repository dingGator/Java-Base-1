package Chpt3.Question6;

/**
 * Created by Ki on 12/29/2016.
 */
import java.util.*;
public class Claims {
static String [][][] xyz = new String[1][1][1];



    public static void main(String[] xyz) {
        ArrayList<String> sa =  new ArrayList<String>();
        for(String s: xyz){
            sa.add(s);
            sa.add(s);
        }
        System.out.println("sa.size() = "+ sa.size()+" "); //+xyz.size());
    }
}
