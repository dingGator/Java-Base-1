package Quiz_1_30.Question18;

/**
 * Created by Ki on 2/2/2017.
 */
public class Jump {
    public static void main(String[] args) {
        Wooper w = new Wooper();
        System.out.println(w.jump(5)+ " ");
     //   w.printJumps(5);
    }
}
class Wooper {
    public int jump(int i){
        System.out.println(printJumps(i++ )+  " "); return i;
    }
    private int printJumps(int i){
        System.out.println("Jump: "+ i++ + " "); return i;
    }
}