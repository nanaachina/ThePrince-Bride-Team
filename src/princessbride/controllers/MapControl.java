/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;

import princessbride.Model.Map;
import princessbride.Model.NPC;
import princessbride.Model.Player;
import princessbride.view.SceneType;

/**
 *
 * @author adm-achina
 */

class MapControl {

    static int moveNPCTOLocation(NPC npc, String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Map createMap(Player p) {
        
        Map map = new Map();

        map.initiate();
        
        p.setLocation(map.getLocations()[0][13]);
        return map;
        
        
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

