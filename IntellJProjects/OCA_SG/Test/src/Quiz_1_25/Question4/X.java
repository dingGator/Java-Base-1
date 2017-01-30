package Quiz_1_25.Question4;

/**
 * Created by Ki on 1/25/2017.
 */
class X {
    void go() {
        System.out.print("x ");
    }
}

class Y extends X {
    void go() {
        System.out.println("y ");
    }
}

class Z extends X {
    void go() {
        System.out.println("z ");
    }
}

class Chrome2 {
    public static void main(String[] args) {
        X z = new Z();
        X y = new Y();
        Z y2 = (Z)y;
        z.go();
        y.go();
        y2.go();
    }
}