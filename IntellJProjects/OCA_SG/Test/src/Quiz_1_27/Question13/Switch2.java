package Quiz_1_27.Question13;

/**
 * Created by Ki on 1/27/2017.
 */
public class Switch2 {
    final static short x =2;
    final static int y =0;

    public static void main(String[] args) {
        for(int z =0; z<4;z++){
            switch (z){
                case x:
                    System.out.print("0 ");
                case x-1:
                    System.out.print("1 ");break;
                default:
                    System.out.print("def ");
               // case x-2:
               //     System.out.print("2 ");
            }
        }
    }
}
