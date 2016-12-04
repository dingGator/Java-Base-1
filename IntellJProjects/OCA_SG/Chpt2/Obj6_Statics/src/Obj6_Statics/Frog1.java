package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Frog1 {
    int frogSize = 0;
    static int frogSizeStatic = 0;
    int frogSizeNon = 0;

    public int getFrogSize() {
        System.out.println("getFrogSize frogSize:  " + frogSize);
        return frogSize;
    }

    public Frog1() {
        frogSize += 1;
        frogSizeStatic +=1;
        System.out.println("Frog1 frogSize:  " + frogSize);
        System.out.println("Frog1 frogSizeStatic:  " + frogSizeStatic);

    }

    public int getFrogSizeNon() {

        System.out.println("getFrogSize frogSize:  " + frogSizeNon);
        return frogSizeNon;
    }

    public void nonConFrog1(int s) {
        System.out.println("*******************");
        frogSizeNon = s;
        System.out.println("nonConFrog1 frogSizeNon:  " + frogSizeNon);
        System.out.println("nonConFrog1 frogSize:  " + frogSize);
        System.out.println("nonConFrog1 frogSizeStatic:  " + frogSizeStatic);
        System.out.println("*******************");
    }

    public static void main(String[] args) {
        Frog1 fr = new Frog1();
        new Frog1();
        new Frog1();
        new Frog1();


        System.out.println("*** Main fr.nonConFrog1(15)  " );
        fr.nonConFrog1(15);

        // System.out.println("frog1.getFrogSize()  " + Frog1.getFrogSize());

        System.out.println("*** Main fr.getFrogSize()  " + fr.getFrogSize());
        System.out.println("*** Main fr.getFrogSizeNon() " + fr.getFrogSizeNon());
        System.out.println("*** Main fr.frogSizeStatic() " + Frog1.frogSizeStatic);



    }
}
