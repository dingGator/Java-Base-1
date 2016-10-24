/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Minivan extends Car{
    private int roadServiceMonths;

    public Minivan(int roadServiceMonths) {
        super(5, 5, false, 4,4, "MiniVan", 4);
        this.roadServiceMonths = roadServiceMonths;
    }
    
public void accelerate(int rate){
    int newVelocity = getCurrentVelocity() +rate;
    if (newVelocity ==0 ){
        stop();
        changeGear(1);
    }else if (newVelocity >0 && newVelocity <=10){
        changeGear(1);
    }else if (newVelocity >10 && newVelocity <=20){
        changeGear(2);
    }else if (newVelocity >20 && newVelocity <=30){
        changeGear(3);
        
    }else{ changeGear(4);}
    
    if (newVelocity >0){
        changeVelocity(newVelocity, getCurrentDirection());
    }
}
    

    
    
    
}
