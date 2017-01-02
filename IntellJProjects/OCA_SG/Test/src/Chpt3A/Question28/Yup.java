package Chpt3A.Question28;

/**
 * Created by Ki on 1/1/2017.
 */
class Yup {
    private static int x = 4;
    private final int y = 5;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

/**
 * Created by Ki on 1/1/2017
 */
class Work {
    //  public static void main(String[] args) {
    public static void main(String[] args) {
        Yup y = new Yup();
        y.setX(8);
        y.setY(10);
        System.out.println(y.getX() + y.getY());
    }
}

