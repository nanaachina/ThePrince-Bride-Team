/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adm-achina
 */
public enum NPC implements java.io.Serializable {

    Had("He is a shopekeeper"),
    Balt("He is a shopekeeper"),
    Tyrin("He is a shopekeeper, first of his name"),
    Adela("He is a shopekeeper"),
    Fend("He is a shopekeeper");
    
    private final Point location;
    private final String description;
    
    private Game[] game;
    private TheShop[] item;
    /*private Location[] location;*/
    
    


    NPC(String description) {
        this.description = description;
        location = new Point(1,1);
    }

    public Point getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public TheShop[] getTheShop() {
        return item;
    }

    public void setTheShop(TheShop[] item) {
        this.item = item;
    }
    
    

    @Override
    public String toString() {
        return "NPC{" + "location=" + location + ", description=" + description + '}';
    }
            
}
