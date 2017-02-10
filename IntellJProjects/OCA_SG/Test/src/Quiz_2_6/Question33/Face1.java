package Quiz_2_6.Question33;

/**
 * Created by Ki on 2/9/2017.
 *
 */
interface Face1 {
    int m1(int m1);
}
interface Face2{
    int m2(int m2);
}


//no    class Concrete2 extends Face1 {
//      public int m3(int r);}

//no    interface Concrete2 implements Face1{
//      public int m1(int y){return 7;}}

//yes   class Concrete2 implements Face2{
//      public int m2(int l){return 7;}}

//no    class Concrete2 implements Face2 {
//      public int m1(int r){return 7;}}

//yes   abstract class Concrete2 implements Face2, Face1{
//        public int m4(){return 7;}}