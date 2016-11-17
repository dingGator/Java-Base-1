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
        // For this challenge, create an abstract class to define items that can be stored in a list.
        // The class should contain 2 references to items which will represent the next and previous
        // items (in the case of a linked list).
        // I.e., if you call your abstract class ListItem, then it would have 2 member variables of
        // type ListItem that will hold references to the next/right and previous/left ListItems.
        //
        // The abstract class will also need to hold a value - try to be as flexible as possible
        // when defining the type of this value.
        //
        // The class will also need methods to move to the next item and back to the previous item,
        // and methods to set the next and previous items.
        //
        // You should also specify a compareTo() method that takes a parameter of the same type as the
        // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
        // the parameter and less than zero if it sorts less than the parameter.
        //
        // Create a concrete class from your abstract list item class and use this in a LinkedList
        // class to implement a linked list that will add items in order (so that they are sorted
        // alphabetically). Duplicate values are not added.
        //
        // Note that you are creating your own LinkedList class here, not using the built-in Java one..
        //
        // The rules for adding an item to the linked list are:
        //  If the head of the list is null, make the head refer to the item to be added.
        //  If the item to be added is less than the current item in the list, add the item before the
        //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
        //      "next" refer to the current item).
        //  If the item to be added is greater than the current item, move onto the next item and compare
        //      again (if there is no next item then that is where the new item belongs).
        //
        // Care will be needed when inserting before the first item in the list (as it will not have a previous
        // item).
        //
        // You will also need a method to remove an item from the list.
        //
        // Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that
        // you create your classes before referring to them. In previous videos we have often referred to
        // classes that we create later, but if you use names that IntelliJ recognises as Java classes (such
        // as LinkedList) then it will create imports for them and possibly cause you problems later.
        //
        // Optional: create a class to use your concrete class to implement a Binary Search Tree:
        // When adding items to a Binary Search Tree, if the item to be added is less than the current item
        // then move to the left, if it is greater than the current item then move to the right.
        //
        // The new item is added when an attempt to move in the required direction would involve following a
        // null reference.
        // Once again, duplicates are not allowed.
        //
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        // a loop as in the example below.
        //

        MyLinkedList list = new MyLinkedList(null);
        System.out.println(" *********************** ");
        list.traverse(list.getRoot());
        System.out.println(" *********************** ");
        System.out.println(" program after empty list ");

// Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        System.out.println(" program after string define ");
        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            list.addItem(new Node(s));
            System.out.println(" program for  LIST STRING loop " + s);

        }
        System.out.println(" program after for loop ");
        System.out.println(" ********list*************** ");

        list.traverse(list.getRoot());
        System.out.println(" *********************** ");
        System.out.println(" *********program with numbers************** ");

        String stringData1 = "5 7 3 9 8 4 2 0 9 1 6 30";
        System.out.println(" program with number ");
        MyLinkedList list1 = new MyLinkedList(null);
        System.out.println(" *********************** ");
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");
        System.out.println(" program after empty list ");

        String[] data1 = stringData1.split(" ");
        for (String s1 : data1) {
            // create new item with value set to the string s
            list1.addItem(new Node(s1));
            System.out.println(" program for LIST1 (numbers) loop " + s1);

        }
        System.out.println(" program after for loop ");
        System.out.println(" *******LIST1*list*************** ");

        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");

        list1.removeItem(new Node("3"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");

        list1.removeItem(new Node("5"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");

        list1.removeItem(new Node("0"));
        list1.removeItem(new Node("4"));
        list1.removeItem(new Node("2"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");

        list1.removeItem(new Node("9"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");
        list1.removeItem(new Node("8"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");
        list1.removeItem(new Node("6"));
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");
        list1.removeItem(list1.getRoot());
        System.out.println(" *********************** ");
        list1.traverse(list1.getRoot());
        list1.removeItem(list1.getRoot());
        System.out.println(" *********************** ");
        list1.traverse(list1.getRoot());
        list1.removeItem(list1.getRoot());
        System.out.println(" *********************** ");
        list1.traverse(list1.getRoot());
        System.out.println(" *********************** ");

        SearchTree tree = new SearchTree(null);
        System.out.println(" *********program with SearchTree************** ");
        tree.traverse(tree.getRoot());
        String stringData2 = "5 7 3 9 8 4 2 1 6 30";
        System.out.println(" program with SearchTree ");
        System.out.println(" *********************** ");
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");
        System.out.println(" program after empty list ");

        String[] data2 = stringData2.split(" ");
        for (String s2 : data2) {
            // create new item with value set to the string s
            tree.addItem(new Node(s2));
            System.out.println(" program for  at Tree loop " + s2);

        }
        System.out.println(" program after for loop ");
        System.out.println(" ******SEARCHTREE**list*************** ");

        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");
        tree.removeItem(tree.getRoot());
        System.out.println(" *********************** ");
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        System.out.println(" *********************** ");
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        System.out.println(" *********************** ");
        tree.traverse(tree.getRoot());
        System.out.println(" *********************** ");

    }
}
