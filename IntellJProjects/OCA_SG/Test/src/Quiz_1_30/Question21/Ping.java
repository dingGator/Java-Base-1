package Quiz_1_30.Question21;

import static javax.swing.text.html.HTML.Tag.U;

/**
 * Created by Ki on 2/2/2017.
 */
 class Ping extends Utils {
    public static void main(String[] args) throws Exception {
        Utils u = new Ping();
        System.out.println(u.getInt(args[0]));
    }
    int getInt(String a){
        return Integer.parseInt(a);
    }
}
class Utils{
    int getInt(String x ) throws Exception {return 7;}
}
