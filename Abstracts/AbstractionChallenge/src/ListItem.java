/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

}
/*/2 member variables of
 // type ListItem that will hold references to the next/right and previous/left ListItems.
 private String next;
 private String previous;
    
    
 //The abstract class will also need to hold a value - try to be as flexible as possible
 // when defining the type of this value.
 private String item;
    
    
    
 public abstract void next_right();
 public abstract void previous_left();
    
 //The class will also need methods to move to the next item and back to the previous item,
 public void moveNextToB




 // and methods to set the next and previous items.
 public void setNext(String next) {
 this.next = next;
 }

 public void setPrevious(String previous) {
 this.previous = previous;
 }
    
    
   
 }*/
