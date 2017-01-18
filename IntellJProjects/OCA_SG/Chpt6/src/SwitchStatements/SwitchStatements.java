package SwitchStatements;

/**
 * Created by Ki on 1/17/2017.
 */
public class SwitchStatements {
    public static void main(String[] args) {
        int x = 3;
        if (x == 1) {
            System.out.println("x equals 1 " + x);
        } else if (x == 2) {
            System.out.println("x equal 2 " + x);
        } else {
            System.out.println(" No idea what  x is " + x);
        }

        int s =3;
        switch (s){
            case 1 :
                System.out.println("s equals 1 "+ s);
                break;
            case 2:
                System.out.println("s equals 2 "+s);
                break;
            default:
                System.out.println("No idea what s is "+s);
        }

        final int a =1;
        final int b;
        b =2;
        int x2 =0;
        switch (x2){
            case a:
                System.out.println("a");
                break;
       //     case b:
         //       System.out.println("b");
        }
        String d = "xyz";
        switch (d.length()){
            case 1:
                System.out.println("length is one");
                break;
            case 2:
                System.out.println("length is two");
                break;
            case 3:
                System.out.println("length is three");
                break;
            default:
                System.out.println("no match");
                break;
        }
        byte g =2;
        switch (g){
            case 23:
                System.out.println("g is 23");
                break;
           /* case 128:  // not legal bcs 128 is too big to be a byte
                System.out.println("g is 128");
                break;
            */
        }
        int temp =90;
        switch(temp){
            case 80:
                System.out.println("80");
                break;
      /* ILLEgal:   repeat case
            case 80:
                System.out.println("80");
                break;
       */
      case 90:
                System.out.println("90");
                break;
            default:
                System.out.println("default");
        }
    }
}
