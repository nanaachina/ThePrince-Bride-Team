/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author adm-achina
 */
public class Inventory implements Serializable, Comparable {
    private String itemName;
    private int itemAmount;
    private int itemInStock;
    private Inventory prerequisite;

    
    private Item[] item;
    private Weapon[] weapon;
    private Game game;

    public Inventory() {
    }
 public Inventory getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Inventory prerequisite) {
        this.prerequisite = prerequisite;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemInStock() {
        return itemInStock;
    }

    public void setItemInStock(int itemInStock) {
        this.itemInStock = itemInStock;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Weapon[] getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon[] weapon) {
        this.weapon = weapon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
public void init() {
        
        Inventory name = new Inventory(); 
        name.setItemName("Rope");
        
        Inventory miraclePill = new Inventory(); 
        name.setItemName("Miracle Pill");
        
        Inventory bucket = new Inventory(); //setup bucket
        name.setItemName("Bucket");
    
        Inventory water = new Inventory(); //setup water
        name.setItemName("Goblet of Water");
        
        Inventory bagOfRocks = new Inventory(); //setup water
        name.setItemName("Bag of Rocks");
        
        Inventory holocaustCloak = new Inventory(); //setup water
        name.setItemName("Holocaust Cloak");
        
        Inventory quill = new Inventory(); //setup 
        name.setItemName("Quill");
        
        Inventory torch = new Inventory(); //setup torch
        name.setItemName("Torch");
        
        Inventory meat = new Inventory(); //setup meat
        name.setItemName("Meat");
        
        Inventory knife = new Inventory(); //setup knife
        name.setItemName("Knife");
        
        Inventory paper = new Inventory(); //setup 
        name.setItemName("Paper");
        
        Inventory goldWatch = new Inventory(); //setup 
        name.setItemName("Gold Watch");
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.itemName);
        hash = 97 * hash + this.itemInStock;
        hash = 97 * hash + this.itemAmount;
        return hash;
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
        final Inventory other = (Inventory) obj;
        if (this.itemInStock != other.itemInStock) {
            return false;
        }
        if (this.itemAmount != other.itemAmount) {
            return false;
        }
        return Objects.equals(this.itemName, other.itemName);
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName=" + itemName + ", itemAmount=" + itemAmount + ", itemInStock=" + itemInStock + '}';
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getRequiredAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Weapon {

        public Weapon() {
        }
    }

    private static class Item {

        public Item() {
        }
    }
}

    