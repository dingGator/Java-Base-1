package Quiz_2_6.Question36;

/**
 * Created by Ki on 2/9/2017.
 */
public class Utils {
    int getInt(String x) throws Exception{return 7;}
}

class Ping extends Utils{
    public static void main(String[] args) throws Exception
        /* throws Exception */
        {  Utils u = new Ping();
            System.out.println(u.getInt(args[0]));
/*
        try {
            System.out.println(u.getInt(args[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
  */  }
    int getInt(String a){
        return Integer.parseInt(a);  // note: parseInt() can throw an Exception
    }
}