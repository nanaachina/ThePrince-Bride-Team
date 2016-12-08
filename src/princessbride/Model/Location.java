/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import princessbride.controllers.Scene;
import princessbride.view.SceneType;
/**
 *
 * @author adm-achina
 */

public class Location implements Serializable {
    
    private SceneType type;
    private Monster monster;
    private List<Inventory> items;
    private Player player;
    private Scene scene;
    private int row;
    private int col;
    private String description;
    private SceneType sceneType;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

   
    private Actor actor;


   public Location() {
            items = new ArrayList<>();
    }



public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }



  public List<Inventory> getItems() {
        return items;
    }

    public void setItems(List<Inventory> items) {
        this.items = items;
    }


public void addItem(Inventory i) {
        this.items.add(i);
    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }



 public void setSceneType(SceneType l) {
        this.sceneType = l;
    }

    public SceneType getSceneType() {
        return sceneType;
    }

    

    
   

    @Override
    public int hashCode() {
        int hash = 7;
       // hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.col;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }

        return true;
    }

   

    private static class Monster {

        public Monster() {
        }
    }

      
}
