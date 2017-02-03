package Quiz_1_30.Question24;

/**
 * Created by Ki on 2/2/2017.
 */
public class Battery {
    static int x =1;

    public static void main(String[] args) throws Throwable {
        try{
            if(x==1) throw new Throwable();
            System.out.println("try ");

        }catch (Exception e){
            System.out.println("exc ");
        }finally {
            System.out.println("fin ");
        }
    }
}
