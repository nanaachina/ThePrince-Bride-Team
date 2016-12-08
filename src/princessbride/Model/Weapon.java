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
public enum Weapon implements java.io.Serializable {
    
    
    shortSword(),
    medSword(),
    longSword(),
    dualSwords();
    
    private String name;
    private double attack;
    private double defence;
    private double magic;
    private double magicDefence;
    
    private Game game;
    private Inventory inventory;
    private Player player;
    

    Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(double magicDefence) {
        this.magicDefence = magicDefence;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", attack=" + attack + ", defence=" + defence + ", magic=" + magic + ", magicDefence=" + magicDefence + '}';
    }
    
    
    
}
