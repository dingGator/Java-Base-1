package Quiz_1_29.Question22;

/**
 * Created by Ki on 1/30/2017.
 */
public class Eco {
    public static void main(String[] args) {
        Eco e1 = new Eco();
        Eco e2 = new Eco();
        Eco e3 = new Eco();
        e3.e = e2;
        e1.e = e3;
        e2 = null;
        e3 = null;
        e2.e = e1;
        e1 = null;
    }
    Eco e;
}


