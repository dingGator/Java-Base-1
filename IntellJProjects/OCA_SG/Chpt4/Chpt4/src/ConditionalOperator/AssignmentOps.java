package ConditionalOperator;

/**
 * Created by Ki on 1/6/2017.
 */
public class AssignmentOps {
    public static void main(String[] args) {
        int sizeOfYard = 10;
        int numOfPets =3;
        String status =(numOfPets <4)? "Pet count OK"
                :(sizeOfYard >8) ? "Pet limit on the edge"
                : "too many pets";
        System.out.println("Pet status is "+ status);
    }
}
