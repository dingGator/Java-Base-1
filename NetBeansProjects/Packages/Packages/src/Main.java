
import javax.xml.soap.Node;

//import javafx.scene.Node;
//import org.w3c.dom.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*/ TODO code application logic here
         Node node = null;*/
        org.w3c.dom.Node anotherNode = null;
        Node node = null;
        /*    node.bleh();
         anotherNode.bleh();
         */
        //new Main().bleh();
        bleh();

    }

    public static void bleh() {
        for (int i = 0; i < 10; i++) {
            int f = i;
            String name = "Bob - ";
            if (i > 7) {
                f++;
                 System.out.println(name + f);
            } else {
                f += 2;
                System.out.println(name + f);
            }
        }
       // System.out.println(name + f);

    }

}
