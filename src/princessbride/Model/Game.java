/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;

import princessbride.PrincessBride;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Game implements Serializable{

   
    private String numberPeople;
    private double numberAttemps;
    private Player player;
    private static Game instance;
    
    private Map map;


     private Ship ship;
    
    private Inventory[] inventory;
    
    public static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        
        return instance;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }
    
    public Game() {
    }
    
    

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    public double getNumberAttemps() {
        return numberAttemps;
    }

    public void setNumberAttemps(double numberAttemps) {
        this.numberAttemps = numberAttemps;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.numberPeople);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numberAttemps) ^ (Double.doubleToLongBits(this.numberAttemps) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "numberPeople=" + numberPeople + ", numberAttemps=" + numberAttemps + '}';
    }
   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.numberAttemps) != Double.doubleToLongBits(other.numberAttemps)) {
            return false;
        }
        return Objects.equals(this.numberPeople, other.numberPeople);
    }

   public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


   public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    } 

  

    public void setShip(Ship ship) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


    
}
