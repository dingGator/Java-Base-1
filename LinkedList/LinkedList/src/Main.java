
import java.util.ArrayList;

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
        // TODO code application logic here
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer "
                + customer.getName() + " is " + customer.getBalance());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        System.out.println("************ ");

        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));

        }
             System.out.println("***Demo********* ");
            Demo placesToVisit = new Demo();
            System.out.println("printList************ ");
            System.out.println(placesToVisit);

    }

}
