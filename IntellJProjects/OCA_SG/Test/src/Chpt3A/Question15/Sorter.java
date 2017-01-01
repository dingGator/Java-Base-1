package Chpt3A.Question15;

import java.util.*;

/**
 * Created by Ki on 12/31/2016.
 */
public class Sorter {
    public static void main(String[] args) {
        ArrayList<String>sa = new ArrayList<String>();
        sa.add("a");
        sa.add("b");
        sa.add("c");
        String sb[]= new String[3];   //line x
        for(int x =1; x<sa.size(); x++)
            sb[x]= sa.get(x);        //line y
        for(String s:sb)
            System.out.print(s + " ");
    }
}
