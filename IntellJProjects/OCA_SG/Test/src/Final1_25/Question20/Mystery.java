package Final1_25.Question20;

/**
 * Created by Ki on 1/25/2017.
 */
public class Mystery {
    public static void main(String[] args) {
        for(int i =0;true |false; i++){
            if (--i ==0 || i==2) {
                System.out.print("Yes: " + i + " ");
                break;
            }else if (i++ % 2 == 0){
                System.out.println("No: "+ i + "");
            }
        }
    }
}
