package Array;

/**
 * Created by Ki on 1/12/2017.
 */
public class TestSportyThings {
    public static void main(String[] args) {
        Sporty[]sportyThings = new Sporty[3];
        sportyThings[0]= new Ferrari();
        sportyThings[1] = new RacingFlats();
        //sportyThings[2] = new GolfClub();
        //GolfClub does not implement Sporty
    }
}
