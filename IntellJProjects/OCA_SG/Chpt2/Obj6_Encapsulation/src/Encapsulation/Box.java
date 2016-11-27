package Encapsulation;

/**
 * Created by Ki on 11/19/2016.
 */
public class Box {
    //Protect the instance variable; only
    //an instance of Box can access it
    private int size;
    //Provide public getters and setters
    public int getSize() {
        return size;
    }
    public void setSize(int newSize){
        size = newSize;
    }
}
