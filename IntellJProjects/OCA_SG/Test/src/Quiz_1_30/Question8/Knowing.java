package Quiz_1_30.Question8;

/**
 * Created by Ki on 2/1/2017.
 */
class Knowing {
    static final long tooth = 343L;
    static long doIt(long tooth){
        System.out.print(++tooth + " ");
        return ++tooth;
    }

    public static void main(String[] args) {
        System.out.print(tooth + " ");
        final long tooth = 340L;
        new Knowing ().doIt(tooth);
        System.out.print(tooth);
    }
}
