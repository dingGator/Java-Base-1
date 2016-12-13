package VariableScope;

/**
 * Created by Ki on 12/12/2016.
 */
public class ScopeErrors {
    int x=5;

    public static void main(String[] args) {
        ScopeErrors s = new ScopeErrors();
        //final int i = x++;
        s.go();
        s.go2();
        s.go3();
    }
    void go(){
        int y =5;
        go2();
        y++;
        System.out.println(" y++ "+ y++);
    }
    void go2(){
        //y++;
        System.out.println(" go2  ");
    }
    void go3(){
        for(int z=0;z<5;z++){
            boolean test = false;
            if(z == 3){
                test = true;
                break;
            }
            System.out.println(test+ " "+ z);
        }

    }
}
