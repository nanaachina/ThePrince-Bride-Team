/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;

import java.util.ArrayList;
import java.util.List;
import princessbride.Model.Inventory;
import princessbride.Model.Location;
import princessbride.Model.Player;
/**
 *
 * @author adm-achina
 */
public class InventoryControl {
    
    int pocket;
    private Inventory prerequisite;
    private Location[][] location; 

    public int addToInventory(int total, int amount) {

        if (total < 0 || total >= 101 || amount < 0 || amount >= 101) {
            return -1;
        }
        
        if ((total + amount) >= 101){
            return -1;
        }
        
        int newTotal = total + amount;
        
        return newTotal;
        
    }
    
    public int removeFromInventory(int item, int amount) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101) {
            return -1;
        }
        
        if (amount > item){
            return -1;
        }
        
        int total = item - amount;

        return total;
        
    }
    
    public int storeItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = amount * cost;
        pocket = pocket - cost;

        return pocket;
        
    }
    
    public int sellItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = (amount * cost) / 2;
        pocket = pocket + cost;
        
        if (pocket > 1000000){
            return -1;
        }

        return pocket;
    }
    public String lookForItems(Location l, Player p) {
       
       String rtn = "You find: ";
       
       List<Inventory> toRemoveFromLocation = new ArrayList<Inventory>();
       
       if(l.getItems().size() > 0) { //If there are items here
           for(Inventory i : l.getItems()) {
               
               if(i.getPrerequisite() != null) {
                   //Check to see if player has prerequisite item
                   Inventory prereq = i.getPrerequisite();
                   if(p.getItems().contains(prereq)) {
                       //You've got it so add it
                       rtn += i.getItemName() + " ";
                       p.getItems().add(i);
                       toRemoveFromLocation.add(i);
                   } else {
                       rtn += "[See " + i.getItemName() + " but need " + prereq.getItemName() + "] ";
                   }
               } else {
                   rtn += i.getItemName() + " ";
                   p.getItems().add(i);
                   toRemoveFromLocation.add(i);
               }
           }
           
           l.getItems().removeAll(toRemoveFromLocation);
           
           return rtn;
       }
       
       rtn += "Nothing";
       
       return rtn;
   }
}
