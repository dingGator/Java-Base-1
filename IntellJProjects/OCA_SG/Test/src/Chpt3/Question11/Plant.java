package Chpt3.Question11;

/**
 * Created by Ki on 12/29/2016.
 */
 class Plant {
    String getName(){
        return "plant";
         }
    Plant getType(){
        return  this;
    }
}
class Flower extends Plant {
    // insert code here
   // Flower getType(){return this;}
   //  String geType(){return "this";}
    // Plant getType(){return this;}
     Tulip getType(){return new Tulip();}
}
class Tulip extends Flower{}


