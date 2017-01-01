package Chpt3A.Question17;

import java.lang.reflect.Field;

/**
 * Created by Ki on 1/1/2017.
 */
public class Felix {
    protected long cat(){
    return 7L;
}
}
class Oscar extends Felix{
    // insert code here
    //private long cat(int x){return 7;}

    //public long cat(){return 8L;}
    //long cat(){return 8;}
    protected int cat(int x) {return 7;}

}
