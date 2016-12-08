/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import static jdk.nashorn.tools.ShellFunctions.input;
import princessbride.Model.Player;
import princessbride.PrincessBride;
import princessbride.Model.Game;
import princessbride.Model.Location;
import princessbride.Model.Map;
import princessbride.Model.Ship;
import princessbride.view.ItemEnum;
import princessbride.view.SceneType;
import princessbride.Model.Inventory;
import princessbride.exception.GameControlException;
/**
 *
 * @author adm-achina
 */
public class GameControl {
    
        public static final int NUMBER_OF_INVENTORY_ITEMS = 19;


    public static Player createPlayer(String name) {

		if (name == null) {

			return null;
		}

		Player player = new Player();
		player.setName(name);PrincessBride.setPlayer(player); // save the player

		return player;

	}
 public static Inventory[] getSortedInventorylist() {

        // get the inventory list for the current game
        Inventory[] originalInventoryList = Game.getInstance().getPlayer().getItems().toArray(new Inventory[Game.getInstance().getPlayer().getItems().size()]);

        
        //clone (make a copy) original list
        Inventory[] inventoryList = originalInventoryList.clone();
        
        Arrays.sort(inventoryList);
        
        return inventoryList;
    }
    public static void createNewGame(Player player) {
        
        Game game = Game.getInstance(); //create new game
        PrincessBride.setCurrentGame(game); //save the game in 

        game.setPlayer(player); 

        Map map = MovementControl.createMap(); //create the map 
        map.initiate();////new as of 
        Game.getInstance().setMap(map);///
        
        game.setMap(map); //save map in the game 

        //create list of inventory items and save in the game
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        //move actors to starting location 
        MovementControl.moveActorsToStartingLocation(map);
        
    }
    public static void openGame(String filePath) throws GameControlException{
        
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
        game = (Game) input.readObject();
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        PrincessBride.setCurrentGame(game);
    }
    
    public static void saveGame(Game game, String filePath) throws GameControlException {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }



    

    private static int moveNPCToStartingLocation(Map map) {
        // for every NPC
        
      //  NPC[]  Npc = NPC.values();
       return 0;
    }

   


    private static Inventory[] createInventoryList() {

        Map map = Game.getInstance().getMap();

        Inventory[] inventory = new Inventory[NUMBER_OF_INVENTORY_ITEMS];
        
        
        
        Inventory rope = new Inventory();
             
        rope.setItemName("Rope");
        rope.setItemInStock(0);
        rope.setItemAmount(0);
        inventory[ItemEnum.rope.ordinal()] = rope;
        map.getLocations()[8][4].addItem(rope);
        
        Inventory quill = new Inventory();
        
        quill.setItemName("Quill");
        quill.setItemInStock(0);
        quill.setItemAmount(0);
        map.getLocations()[0][11].addItem(quill);
        inventory[ItemEnum.quill.ordinal()] = quill;

        Inventory paper = new Inventory();
        
        paper.setItemName("Paper");
        paper.setItemInStock(0);
        paper.setItemAmount(0);
        map.getLocations()[0][13].addItem(paper);
        inventory[ItemEnum.paper.ordinal()] = paper;
        
        Inventory miraclePill = new Inventory();
        
        miraclePill.setItemName("Miracle Pill");
        miraclePill.setItemInStock(0);
        miraclePill.setItemAmount(0);
        map.getLocations()[2][0].addItem(miraclePill);
        inventory[ItemEnum.miraclePill.ordinal()] = miraclePill;
      

        Inventory torch = new Inventory();
        
        torch.setItemName("Torch");
        torch.setItemInStock(0);
        torch.setItemAmount(0);
        map.getLocations()[6][4].addItem(torch);
        inventory[ItemEnum.torch.ordinal()] = torch;
        
        Inventory bucket = new Inventory();
        
        bucket.setItemName("Bucket");
        bucket.setItemInStock(0);
        bucket.setItemAmount(0);
        map.getLocations()[3][4].addItem(bucket);
        inventory[ItemEnum.bucket.ordinal()] = bucket;
        
        Inventory meat = new Inventory();
        
        meat.setItemName("Meat");
        meat.setItemInStock(0);
        meat.setItemAmount(0);
        map.getLocations()[5][4].addItem(meat);
        inventory[ItemEnum.meat.ordinal()] = meat;
        
        Inventory goldWatch = new Inventory();
        
        goldWatch.setItemName("goldWatch");
        goldWatch.setItemInStock(0);
        goldWatch.setItemAmount(0);
        map.getLocations()[6][4].addItem(goldWatch);
        inventory[ItemEnum.goldWatch.ordinal()] = goldWatch;
        
        Inventory gobletOfWater = new Inventory();
        
        gobletOfWater.setItemName("Goblet Of Water");
        gobletOfWater.setItemInStock(0);
        gobletOfWater.setItemAmount(0);
        map.getLocations()[10][4].addItem(gobletOfWater);
        inventory[ItemEnum.gobletOfWater.ordinal()] = gobletOfWater;
        
        Inventory bagOfRocks = new Inventory();
        
        bagOfRocks.setItemName("Bag of Rocks");
        bagOfRocks.setItemInStock(0);
        bagOfRocks.setItemAmount(0);
        map.getLocations()[0][10].addItem(bagOfRocks);
        inventory[ItemEnum.bagOfRocks.ordinal()] = bagOfRocks;
        
        Inventory holocaustCloak = new Inventory();
        
        holocaustCloak.setItemName("Holocaust Cloak");
        holocaustCloak.setItemInStock(0);
        holocaustCloak.setItemAmount(0);
        map.getLocations()[0][6].addItem(holocaustCloak);
        inventory[ItemEnum.holocaustCloak.ordinal()] = holocaustCloak;
        
        Inventory Knife = new Inventory();
        
        Knife.setItemName("Knife");
        Knife.setItemInStock(0);
        Knife.setItemAmount(0);
        map.getLocations()[0][4].addItem(Knife);
        inventory[ItemEnum.Knife.ordinal()] = Knife;
        
        return inventory;
    }

    private static Scene[] createScenes(){
        
         princessbride.controllers.Scene[] scenes = new princessbride.controllers.Scene[SceneType.values().length];
        
       
        
        

        
        
          princessbride.controllers.Scene Tower = new princessbride.controllers.Scene();
        Tower.setDescription(
        "Description");
        Tower.setMapSymbol("FN");
        Tower.setBlocked(false);
        Tower.setTravelTime(200);
        scenes[SceneType.Tower.ordinal()] = Tower;
        
          princessbride.controllers.Scene Gallows = new princessbride.controllers.Scene();
        Gallows.setDescription(
        "Description");
        Gallows.setMapSymbol("FN");
        Gallows.setBlocked(false);
        Gallows.setTravelTime(200);
        scenes[SceneType.Gallows.ordinal()] = Gallows;
        
          princessbride.controllers.Scene FireSwamp = new princessbride.controllers.Scene();
        FireSwamp.setDescription(
        "Description");
        FireSwamp.setMapSymbol("FN");
        FireSwamp.setBlocked(false);
        FireSwamp.setTravelTime(200);
        scenes[SceneType.FireSwamp.ordinal()] = FireSwamp;
        
          princessbride.controllers.Scene SpookyWoods = new princessbride.controllers.Scene();
        SpookyWoods.setDescription(
        "Description");
        SpookyWoods.setMapSymbol("FN");
        SpookyWoods.setBlocked(false);
        SpookyWoods.setTravelTime(200);
        scenes[SceneType.SpookyWoods.ordinal()] = SpookyWoods;
        
          princessbride.controllers.Scene Maze = new princessbride.controllers.Scene();
        Maze.setDescription(
        "Description");
        Maze.setMapSymbol("FN");
        Maze.setBlocked(false);
        Maze.setTravelTime(200);
        scenes[SceneType.Maze.ordinal()] = Maze;
        
          princessbride.controllers.Scene SmallCave = new princessbride.controllers.Scene();
        SmallCave.setDescription(
        "Description");
        SmallCave.setMapSymbol("FN");
        SmallCave.setBlocked(false);
        SmallCave.setTravelTime(200);
        scenes[SceneType.SmallCave.ordinal()] = SmallCave;
        
          princessbride.controllers.Scene BigCave = new princessbride.controllers.Scene();
        BigCave.setDescription(
        "Description");
        BigCave.setMapSymbol("FN");
        BigCave.setBlocked(false);
        BigCave.setTravelTime(200);
        scenes[SceneType.BigCave.ordinal()] = BigCave;
        
          princessbride.controllers.Scene HillTopPrairie = new princessbride.controllers.Scene();
        HillTopPrairie.setDescription(
        "Description");
        HillTopPrairie.setMapSymbol("FN");
        HillTopPrairie.setBlocked(false);
        HillTopPrairie.setTravelTime(200);
        scenes[SceneType.HillTopPrairie.ordinal()] = HillTopPrairie;
        
          princessbride.controllers.Scene NorthMeadow = new princessbride.controllers.Scene();
        NorthMeadow.setDescription(
        "Description");
        NorthMeadow.setMapSymbol("FN");
        NorthMeadow.setBlocked(false);
        NorthMeadow.setTravelTime(200);
        scenes[SceneType.NorthMeadow.ordinal()] = NorthMeadow;
        
          princessbride.controllers.Scene SouthMeadow = new princessbride.controllers.Scene();
        SouthMeadow.setDescription(
        "Description");
        SouthMeadow.setMapSymbol("FN");
        SouthMeadow.setBlocked(false);
        SouthMeadow.setTravelTime(200);
        scenes[SceneType.SouthMeadow.ordinal()] = SouthMeadow;
        
          princessbride.controllers.Scene CrossRoads = new princessbride.controllers.Scene();
        CrossRoads.setDescription(
        "Description");
        CrossRoads.setMapSymbol("FN");
        CrossRoads.setBlocked(false);
        CrossRoads.setTravelTime(200);
        scenes[SceneType.CrossRoads.ordinal()] = CrossRoads;
        
         
        
          princessbride.controllers.Scene Docks = new princessbride.controllers.Scene();
        Docks.setDescription(
        "Description");
        Docks.setMapSymbol("FN");
        Docks.setBlocked(false);
        Docks.setTravelTime(200);
        scenes[SceneType.Docks.ordinal()] = Docks;
        
          princessbride.controllers.Scene SouthKingdom = new princessbride.controllers.Scene();
        SouthKingdom.setDescription(
        "Description");
        SouthKingdom.setMapSymbol("FN");
        SouthKingdom.setBlocked(false);
        SouthKingdom.setTravelTime(200);
        scenes[SceneType.SouthKingdom.ordinal()] = SouthKingdom;
        
          princessbride.controllers.Scene CliffTop = new princessbride.controllers.Scene();
        CliffTop.setDescription(
        "Description");
        CliffTop.setMapSymbol("FN");
        CliffTop.setBlocked(false);
        CliffTop.setTravelTime(200);
        scenes[SceneType.CliffTop.ordinal()] = CliffTop;
        
          princessbride.controllers.Scene WestCliffSide = new princessbride.controllers.Scene();
        WestCliffSide.setDescription(
        "Description");
        WestCliffSide.setMapSymbol("FN");
        WestCliffSide.setBlocked(false);
        WestCliffSide.setTravelTime(200);
        scenes[SceneType.WestCliffSide.ordinal()] = WestCliffSide;
        
          princessbride.controllers.Scene Shoppe = new princessbride.controllers.Scene();
        Shoppe.setDescription(
        "Description");
        Shoppe.setMapSymbol("FN");
        Shoppe.setBlocked(false);
        Shoppe.setTravelTime(200);
        scenes[SceneType.Shoppe.ordinal()] = Shoppe;
        
          princessbride.controllers.Scene RockYard = new princessbride.controllers.Scene();
        RockYard.setDescription(
        "Description");
        RockYard.setMapSymbol("FN");
        RockYard.setBlocked(false);
        RockYard.setTravelTime(200);
        scenes[SceneType.RockYard.ordinal()] = RockYard;
        
          princessbride.controllers.Scene CastleGates = new princessbride.controllers.Scene();
        CastleGates.setDescription(
        "Description");
        CastleGates.setMapSymbol("FN");
        CastleGates.setBlocked(false);
        CastleGates.setTravelTime(200);
        scenes[SceneType.CastleGates.ordinal()] = CastleGates;
        
          princessbride.controllers.Scene RiverRapids = new princessbride.controllers.Scene();
        RiverRapids.setDescription(
        "Description");
        RiverRapids.setMapSymbol("FN");
        RiverRapids.setBlocked(false);
        RiverRapids.setTravelTime(200);
        scenes[SceneType.RiverRapids.ordinal()] = RiverRapids;
        
          princessbride.controllers.Scene NorthBeach = new princessbride.controllers.Scene();
        NorthBeach.setDescription(
        "Description");
        NorthBeach.setMapSymbol("FN");
        NorthBeach.setBlocked(false);
        NorthBeach.setTravelTime(200);
        scenes[SceneType.NorthBeach.ordinal()] = NorthBeach;
        
          princessbride.controllers.Scene Beach = new princessbride.controllers.Scene();
        Beach.setDescription(
        "Description");
        Beach.setMapSymbol("FN");
        Beach.setBlocked(false);
        Beach.setTravelTime(200);
        scenes[SceneType.Beach.ordinal()] = Beach;
        
          princessbride.controllers.Scene Dungeon = new princessbride.controllers.Scene();
        Dungeon.setDescription(
        "Description");
        Dungeon.setMapSymbol("FN");
        Dungeon.setBlocked(false);
        Dungeon.setTravelTime(200);
        scenes[SceneType.Dungeon.ordinal()] = Dungeon;
        
          princessbride.controllers.Scene PitOfDespair = new princessbride.controllers.Scene();
        PitOfDespair.setDescription(
        "Description");
        PitOfDespair.setMapSymbol("FN");
        PitOfDespair.setBlocked(false);
        PitOfDespair.setTravelTime(200);
        scenes[SceneType.PitOfDespair.ordinal()] = PitOfDespair;
        
          princessbride.controllers.Scene Gazebo = new princessbride.controllers.Scene();
        Gazebo.setDescription(
        "Description");
        Gazebo.setMapSymbol("FN");
        Gazebo.setBlocked(false);
        Gazebo.setTravelTime(200);
        scenes[SceneType.Gazebo.ordinal()] = Gazebo;
        
         
          princessbride.controllers.Scene CliffsOfInsanity = new princessbride.controllers.Scene();
        CliffsOfInsanity.setDescription(
        "Description");
        CliffsOfInsanity.setMapSymbol("FN");
        CliffsOfInsanity.setBlocked(false);
        CliffsOfInsanity.setTravelTime(200);
        scenes[SceneType.CliffsOfInsanity.ordinal()] = CliffsOfInsanity;
        

  
        
        return scenes;
    }
    
    
    static void assignScenesToLocations(Map map, Scene[] scenes) {

        
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.HillTopPrairie.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.CliffTop.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.SouthKingdom.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.BigCave.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.SmallCave.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.Maze.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.SpookyWoods.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.FireSwamp.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.Gallows.ordinal()]);
        locations[0][13].setScene(scenes[SceneType.CliffsOfInsanity.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Docks.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.MiracleMaxsHouse.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.CrossRoads.ordinal()]);
        locations[10][2].setScene(scenes[SceneType.SouthMeadow.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.NorthMeadow.ordinal()]);
        locations[15][2].setScene(scenes[SceneType.Tower.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.NorthBeach.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.RiverRapids.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.CastleGates.ordinal()]);
        locations[10][4].setScene(scenes[SceneType.RockYard.ordinal()]);
        locations[11][4].setScene(scenes[SceneType.Shoppe.ordinal()]);
        locations[13][4].setScene(scenes[SceneType.WestCliffSide.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.Gazebo.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.PitOfDespair.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.Dungeon.ordinal()]);

        
        
        
    }

        
        


    private static class gameMap {

        private static Location getLocation(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public gameMap() {
        }
    }
     
         
         




 

    

    

   
}
     
         
         




 