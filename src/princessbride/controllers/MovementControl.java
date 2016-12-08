/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;

import princessbride.exception.MovementException;
import princessbride.Model.Game;
import princessbride.Model.Location;
import princessbride.Model.Map;
import princessbride.Model.Player;
import princessbride.Model.Actor;
import princessbride.view.ActorEnum;


/**
 *
 * @author adm-achina
 */
public class MovementControl {
    
    
    
       public boolean moveNorth(Player p) throws MovementException{
        int row = p.getLocation().getRow();
        int col = p.getLocation().getCol();

        if (row == 0) {
            throw new MovementException("This is the end of the map.");
        }
        Map gameMap = Game.getInstance().getMap();
        
        Location newLocation = gameMap.getLocation(row - 1, col);

        p.setLocation(newLocation);
        return true;
    }
    
    public boolean moveEast(Player p) throws MovementException{
        int row = p.getLocation().getRow();
        int column = p.getLocation().getCol();

        if (column == 16) {
            throw new MovementException("This is the end of the map.");
        }
        Map gameMap = Game.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row, column + 1);

        p.setLocation(newLocation);
        return true;
    }
    
      public boolean moveSouth(Player p) throws MovementException{
        int row = p.getLocation().getRow();
        int column = p.getLocation().getCol();

        if (row == 16) {
            throw new MovementException("This is the end of the map.");
        }
        Map gameMap = Game.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row + 1, column);

        p.setLocation(newLocation);
        return true;
    }

    public boolean moveWest(Player p) throws MovementException{
        int row = p.getLocation().getRow();
        int column = p.getLocation().getCol();

        if (column == 0) {
            throw new MovementException("This is the end of the map.");
        }
        Map gameMap = Game.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row, column - 1);

        p.setLocation(newLocation);
        return true;
    }
    public static Map createMap() { //another method createMap() is in LocationController class?????
        //create the map
        Map map = new Map();
        map.initiate();

        //create a list of the different scenes in the game ??????????????????
        //assign the different scenes to locations in the map ????????????????
        return map;
    }
     public static void moveActorsToStartingLocation(Map map) {

        //SETUP the player first
        Game.getInstance().getPlayer().setLocation(map.getLocations()[0][13]);

        //SETUP everyone else
        Actor fezzik = new Actor("Genius I think");
        fezzik.setActor(ActorEnum.Fezzik);
        fezzik.setLocation(map.getLocations()[2][8]); //Assign 

        Actor inigo = new Actor("Sword fighter");
        inigo.setActor(ActorEnum.Inigo);
        inigo.setLocation(map.getLocations()[1][6]); //assign 

      
    }
}


