package Quiz_2_6.Question23;

/**
 * Created by Ki on 2/8/2017.
 */
public class Plant {
    String getName(){
        return "plant";
    }
    Plant getType(){return this;}
}
class Flower extends Plant{
   // Flower getType(){return this;}  //yes
   // String getType(){ return "this";} //no
  //  Plant getType(){ return this;}//yes
  //  Tulip getType(){return new Tulip();}//yes
}
class Tulip extends Flower{}
