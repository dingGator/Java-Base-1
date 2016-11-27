package Relation_IS_A__HAS_A;

/**
 * Created by Ki on 11/21/2016.
 */
public class Horse extends Animal {
    private Halter myHalter = new Halter();

    public void tieHorse(LeadRope bRope) {
        System.out.println("**Horse** in tieHorse(LeadRope bRope:)");
        System.out.println("**Horse** myHalter.tieHorse(bRope):**  ");

        myHalter.tieHalter(bRope);
        System.out.println("******end tieHorse********");



    }
}
