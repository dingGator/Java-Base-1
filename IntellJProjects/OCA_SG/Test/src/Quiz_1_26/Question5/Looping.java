package Quiz_1_26.Question5;

/**
 * Created by Ki on 1/26/2017.
 */
public class Looping {
    public static void main(String[] args) {
        int i = 5, j =3;
        do{
            System.out.print(i + " "+ j +" ");
        }while(i++==5 || ++j ==3);
    }
}
