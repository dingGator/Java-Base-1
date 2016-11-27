package Encapsulation;

/**
 * Created by Ki on 11/19/2016.
 */
public class Foo {
    // NOT encapsulated
    // because the variables are not PRIVATE
    // so can the instance of variable and change them

    private int privateNum = 6;
    public int left = 9;
    public int right = 3;

    public void setPrivateNum(int privateNum1) {
        this.privateNum = privateNum1;
    }

    public int getPrivateNum() {
        return privateNum;
    }

    public void setLeft(int leftNum) {
        left = leftNum;
        right = leftNum / 3;
    }

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }
}
