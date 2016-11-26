package Question_6;


/**
 * Created by Ki on 11/17/2016.
 */
public class Electronic implements Device {public void doIt(){}}

abstract class Phone1 extends Electronic{}

abstract class Phone2 extends Electronic {public void doIt(int x){}}

class Phone3 extends Electronic implements Device {public void doStuff(){}}

interface Device {public void doIt();}

