package PassingVariableIntoMethods;

/**
 * Created by Ki on 12/15/2016.
 */
public class ReferenceTest3 {
    public static void main(String[] args) {
        int a =1;
        ReferenceTest3 rt3 = new ReferenceTest3();
        System.out.println("Before modify() a = " + a);
        rt3.modify(a);
        System.out.println("After modify() a = " + a);

    }
    void modify(int number){
        number = number +1;
        System.out.println("number = " + number );
    }
}
