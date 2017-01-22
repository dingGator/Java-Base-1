package SelfTest_Chpt6.Question7;

/**
 * Created by Ki on 1/21/2017.
 */
class SubException extends Exception {}
class SubSubException extends SubException{}

public class CC{void doStuff() throws SubException{}}

class CC2 extends CC { void doStuff() throws SubSubException{}}

//class CC3 extends CC {void doStuff() throws Exception{}}

class CC4 extends CC {void doStuff(int x) throws Exception{}}

class CC5 extends CC { void doStuff(){}}

