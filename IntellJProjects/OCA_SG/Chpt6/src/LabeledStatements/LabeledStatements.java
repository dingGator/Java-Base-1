package LabeledStatements;

/**
 * Created by Ki on 1/20/2017.
 */
public class LabeledStatements {

    public static void main(String[] args) {
        int y = 9;
        foo:
        for (int x = 3; x < 20; x++) {
            while (y > 7) {
                y--;
                System.out.println(" y = "+y);
            }
        }
        System.out.println("******break loop");
        boolean isTrue = true;
        outer:
        for (int i = 0; i < 5; i++) {
            while (isTrue) {
                System.out.println("Break: Hello");
                break outer;
            }

            System.out.println("Break: Outer loop.");
        }
        System.out.println("Break: Good bye");


        System.out.println("*****continue loop");
        outer1:
        for (int i = 0; i < 5; i++) {
            while (isTrue) {
                System.out.println("Continue: Hello");
                continue  outer1;
            }

            System.out.println("Continue: Outer loop.");
        }
        System.out.println("Continue: Good bye");
    }

    }





