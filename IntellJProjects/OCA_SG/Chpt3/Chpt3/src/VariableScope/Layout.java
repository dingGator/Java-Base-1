package VariableScope;

/**
 * Created by Ki on 12/12/2016.
 */
public class Layout {
    static int s = 343;
    int x;
    {x = 7; int x2 =5;}
    Layout(){ x+=8; int x3 =6;}
    void doStuff(){
        int y =0;
        for (int z=0; z<4; z++){
            y += z + x;
        }
    }
}
