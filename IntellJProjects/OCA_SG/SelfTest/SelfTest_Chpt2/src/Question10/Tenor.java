package Question10;

/**
 * Created by Ki on 12/5/2016.
 */
public class Tenor extends Singer{
    public static String sing(){ return "fa";}
    public static void main(String [] args){
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() +" " + s.sing());
    }
}
