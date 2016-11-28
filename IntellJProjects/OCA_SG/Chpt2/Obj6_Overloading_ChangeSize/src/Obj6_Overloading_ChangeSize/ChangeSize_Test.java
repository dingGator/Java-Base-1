package Obj6_Overloading_ChangeSize;

/**
 * Created by Ki on 11/26/2016.
 */
public class ChangeSize_Test {
    public static void main(String[] args) {


        System.out.println("*** ChangeSize_Overloading ");

        String name = "kim";
        int size = 5;
        float pattern = 4.5f;
        ChangeSize_Overloading changeSize_overloading = new ChangeSize_Overloading();
        changeSize_overloading.changeSize(size, name, pattern);
        ChangeSize_OL1 changeSize_ol1 = new ChangeSize_OL1();
        changeSize_ol1.changeSize(size, name);
        ChangeSize_OL2 changeSize_ol2 = new ChangeSize_OL2();
        changeSize_ol2.changeSize(size, pattern);
        ChangeSize_OL3 changeSize_ol3 = new ChangeSize_OL3();
        changeSize_ol3.changeSize(pattern, name);
    }

}
