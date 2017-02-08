package Quiz_2_6.Question18;

/**
 * Created by Ki on 2/7/2017.
 */
class Fuel {
    int getRating() {
        return 41;
    }
}

class AlternateFuel extends Fuel {
    int getRating() {
        return 42;
    }
}

class BioDiesel2 extends AlternateFuel {
    public static void main(String[] args) {
        new BioDiesel2().go();
    }

    void go() {
        System.out.println(super.getRating());
       //  System.out.println(super.super.getRating());
    }
}


