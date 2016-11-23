package Cert;

import com.InterllJProjects.OCA.Obj2.Cloo;

/**
 * Created by Ki on 11/7/2016.
 */
public class Toon {
    public static void main(String[] args) {
        Cloo cToon = new Cloo();
        System.out.println("Toon cToon.doRooThings: " + cToon.doRooThings());
        System.out.println("Toon cToon.testCloo: ");
        cToon.testCloo();
        Roo rooToon = new Roo();
        System.out.println("Toon rooToon.doRooThings: " + rooToon.doRooThings());
    }
}
