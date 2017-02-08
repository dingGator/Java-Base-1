package Quiz_2_6.Question6;

/**
 * Created by Ki on 2/7/2017.
 */
public class Input {
    public static void main(String[] args) {
        String s = "-";
        try{
            doMath(args[0]);
            s += "t ";// line6
        }finally {
            System.out.println(s += "f");}
        }
        public static void doMath(String a){
            int y =7/ Integer.parseInt(a);
    }
}
