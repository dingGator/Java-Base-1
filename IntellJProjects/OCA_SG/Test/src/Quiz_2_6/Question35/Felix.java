package Quiz_2_6.Question35;

/**
 * Created by Ki on 2/9/2017.
 */
public class Felix {
    protected long cat(){
        return 7L;
    }
    }
class Oscar extends Felix{
//compile- yes    private long cat(int x){ return 7; }
//compile- yes    public long cat(){return 8L; }
//compile- no    long cat() {return 8;}
//compile- yes    protected int cat(int x){return 7;}
}