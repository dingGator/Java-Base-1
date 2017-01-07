package ConditionalOperator;

/**
 * Created by Ki on 1/5/2017.
 */
public class Salary {
    public static void main(String[] args) {
        int numOfPets =5;
        String status = (numOfPets<4) ? "Pet limit not exceeded"
                : "too many pets";
        System.out.println("this pet status is "+ status);
    }
}
