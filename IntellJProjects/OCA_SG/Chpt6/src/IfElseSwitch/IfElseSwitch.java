package IfElseSwitch;

/**
 * Created by Ki on 1/17/2017.
 */
public class IfElseSwitch {
    public static void main(String[] args) {
        boolean booeanExpression = true;
        if (booeanExpression){
            System.out.println("inside if Statement "+ booeanExpression);

        }
        int x =5;
        if (x >3){
            System.out.println(" x is greater than 3"+ x);
        } else{
            System.out.println(" x is not greater than 3 "+ x);
        }
        int y =7;
        if (x>3)
            y = 2;

        int z =2;
        int a =9;
         z +=8;
        a = y +x;

        int price = 340;
        if ( price< 300){
            buyProduct();
        }else{
            if (price <400){
                getApproval();
            }else{
                dontBuyProduct();
            }
        }
        int x =1;
        if (x==3){}
        else if (x<4){System.out.println("<4");}
        else if (x<2){System.out.println("<2");}
            else{System.out.println("else");}

    }
    static void buyProduct(){
        System.out.println("buy product");
    }
    static void getApproval(){
        System.out.println("get approval");
    }
    static void dontBuyProduct(){
        System.out.println("dont buy product");
    }


}
