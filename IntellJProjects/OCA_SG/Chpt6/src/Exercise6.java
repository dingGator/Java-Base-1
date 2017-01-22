/**
 * Created by Ki on 1/18/2017.
 */
public class Exercise6 {
    public static void main(String[] args) {
        char a = 'a';
        switch (a) {
            case 'a':
                System.out.println(" char a");
                break;
            case 'b':
                System.out.println(" char b");
                break;
            case 'c':
                System.out.println(" char c");
                break;
            default:
                System.out.println(" not a, b, c");
                break;
        }
        System.out.println("******************");

        int age = 10;
        outer:
        while (age <= 21) {
            for (; age <= 16; age++) {
                System.out.println("another year: age= " + age);

            if (age ==16) {
                System.out.println("get your driver license: age= " + age);
            }
            }
            System.out.println("your age = "+ age);
            age++;


        }
    }
}
