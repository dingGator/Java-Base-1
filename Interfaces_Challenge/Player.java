
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon ="Sword";
        
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public String toString(){
        return "Player{"+
                "name= '"+name+'\''+
                ", hitPoints= " + hitPoints +
                ", strength= " + strength +
                ", weapon=' "+ weapon+ '\''+
                '}';
    }
    @Override
    public List<String>write(){
        List<String> values= new ArrayList<String>();
        values.add(0, this.name);
        values.add(1,""+ this.hitPoints);
        values.add(2,""+ this.strength);
        values.add(3,this.weapon);
        return values;
    }
    
    @Override
    public void read(List<String> savedValues){
        if(savedValues != null && savedValues.size()>0){
            this.name= savedValues.get(0);
            this.hitPoints= Integer.parseInt(savedValues.get(1));
            this.strength= Integer.parseInt(savedValues.get(2));  
        }  this.weapon= savedValues.get(3);
        
    }
    
}
