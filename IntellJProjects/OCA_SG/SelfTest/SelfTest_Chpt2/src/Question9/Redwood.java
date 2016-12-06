package Question9;

/**
 * Created by Ki on 12/5/2016.
 */
public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go(){
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(),new Redwood());
    }
    void go2(Tree t1, Redwood r1){
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree)r1;
    }
}
