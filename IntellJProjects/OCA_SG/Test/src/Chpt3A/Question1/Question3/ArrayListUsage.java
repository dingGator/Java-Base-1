package Chpt3A.Question1.Question3;

import java.util.*;

/**
 * Created by Ki on 12/30/2016.
 */

public class ArrayListUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String >(2);
        System.out.println(list.size()+ " ");
        list.clear();
        System.out.println(list.size() +" ");
        list.add("Hey!");
        list.add("Howdy!!");
        list.add(2,"Hello!!!");
        if(list.contains("Hello!!!")){
            System.out.println(list.indexOf("Hello!!!")+" ");
            System.out.println(list.get(2));

        }
    }
}
