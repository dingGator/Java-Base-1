package Relation_IS_A__HAS_A;

/**
 * Created by Ki on 11/21/2016.
 */
public class Animal {
    public static void main(String[] args) {
        System.out.println("******  in Animal********");
  //      System.out.println("******halter new Halter********");
  //      Halter halter = new Halter();
   //     halter.tieHalter(new LeadRope());
        System.out.println("******LeadRope********");

        LeadRope rope = new LeadRope();
        rope.tieLeadRope();

        System.out.println("******horse********");
        Horse horse = new Horse();
        horse.tieHorse(rope);


        System.out.println("******end Animal*******");

    }
}
