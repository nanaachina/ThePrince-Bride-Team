/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;

//import static jdk.nashorn.internal.objects.NativeArray.map;
import princessbride.controllers.Scene;
import princessbride.view.ErrorView;
import princessbride.view.SceneType;


/**
 *
 * @author adm-achina
 */

public class Map implements Serializable {
    
    public int noOfRows;
    public int noOfColumns;
    private Location[][] locations;

    public Map() {
        setup(16, 14);
    }
    
    public Map(int noOfRows, int noOfColumns) {
        setup(noOfRows, noOfColumns);
    }
       
        
        public void setup(int noOfRows,int noOfColumns){
        if(noOfRows < 1 || noOfColumns < 1){
            ErrorView.display(this.getClass().getName(),"The number of rows and coumns must be greater than 0");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                Location location = new Location();
                location.setCol(column);
                location.setRow(row);
//                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }

    public void initiate(){
        

        
         Location Tower = new Location();
        Tower.setDescription("a Tower - large and old and awesome - a bucket is also visible");
        Tower.setRow(15);
        Tower.setCol(2);
        Tower.setSceneType(SceneType.Tower);
        //setup Tower
        locations[15][2] = Tower;
       
        
        
       Location Gallows = new Location();
        Gallows.setDescription("a Gallows - large and old and awesome - a bucket is also visible");
        Gallows.setRow(0);
        Gallows.setCol(11);
        Gallows.setSceneType(SceneType.Gallows);
        //setup Gallows
        locations[0][11] = Gallows;
          
        
          Location FireSwamp = new Location();
        FireSwamp.setDescription("a FireSwamp - large and old and awesome - a bucket is also visible");
        FireSwamp.setRow(0);
        FireSwamp.setCol(10);
        FireSwamp.setSceneType(SceneType.FireSwamp);
        //setup FireSwamp
        locations[0][10] = FireSwamp;
        
          Location SpookyWoods = new Location();
        SpookyWoods.setDescription("a SpookyWoods - large and old and awesome - a bucket is also visible");
        SpookyWoods.setRow(0);
        SpookyWoods.setCol(8);
        SpookyWoods.setSceneType(SceneType.SpookyWoods);
        //setup SpookyWoods
        locations[0][8] = SpookyWoods;
        
           Location Maze = new Location();
        Maze.setDescription("a Maze - large and old and awesome - a bucket is also visible");
        Maze.setRow(0);
        Maze.setCol(6);
        Maze.setSceneType(SceneType.Maze);
        //setup Maze
        locations[0][6] = Maze;
        
           Location SmallCave = new Location();
        SmallCave.setDescription("a SmallCave - large and old and awesome - a bucket is also visible");
        SmallCave.setRow(4);
        SmallCave.setCol(0);
        SmallCave.setSceneType(SceneType.SmallCave);
        //setup SmallCave
        locations[4][0] = SmallCave;
        
          Location BigCave = new Location();
        BigCave.setDescription("a BigCave - large and old and awesome - a bucket is also visible");
        BigCave.setRow(2);
        BigCave.setCol(0);
        BigCave.setSceneType(SceneType.BigCave);
        //setup BigCave
        locations[2][0] = BigCave;
        
         Location HillTopPrairie = new Location();
        HillTopPrairie.setDescription("a HillTopPrairie - large and old and awesome - a bucket is also visible");
        HillTopPrairie.setRow(0);
        HillTopPrairie.setCol(0);
        HillTopPrairie.setSceneType(SceneType.HillTopPrairie);
        //setup HillTopPrairie
        locations[0][0] = HillTopPrairie;
        
          Location NorthMeadow = new Location();
        NorthMeadow.setDescription("a NorthMeadow - large and old and awesome - a bucket is also visible");
        NorthMeadow.setRow(11);
        NorthMeadow.setCol(2);
        NorthMeadow.setSceneType(SceneType.NorthMeadow);
        //setup NorthMeadow
        locations[11][2] = NorthMeadow;
        
         Location SouthMeadow = new Location();
        SouthMeadow.setDescription("a SouthMeadow - large and old and awesome - a bucket is also visible");
        SouthMeadow.setRow(10);
        SouthMeadow.setCol(2);
        SouthMeadow.setSceneType(SceneType.SouthMeadow);
        //setup SouthMeadow
        locations[10][2] = SouthMeadow;
        
         Location CrossRoads = new Location();
        CrossRoads.setDescription("a CrossRoads - large and old and awesome - a bucket is also visible");
        CrossRoads.setRow(8);
        CrossRoads.setCol(2);
        CrossRoads.setSceneType(SceneType.CrossRoads);
        //setup CrossRoads
        locations[8][2] = CrossRoads;
        
         Location MiracleMaxsHouse = new Location();
        MiracleMaxsHouse.setDescription("a MiracleMaxsHouse - large and old and awesome - a bucket is also visible");
        MiracleMaxsHouse.setRow(6);
        MiracleMaxsHouse.setCol(2);
        MiracleMaxsHouse.setSceneType(SceneType.MiracleMaxsHouse);
        //setup MiracleMaxsHouse
        locations[6][2] = MiracleMaxsHouse;
        
         Location Docks = new Location();
        Docks.setDescription("a Docks - large and old and awesome - a bucket is also visible");
        Docks.setRow(4);
        Docks.setCol(2);
        Docks.setSceneType(SceneType.Docks);
        //setup Docks
        locations[4][2] = Docks;
        
        Location SouthKingdom = new Location();
        SouthKingdom.setDescription("a SouthKingdom - large and old and awesome - a bucket is also visible");
        SouthKingdom.setRow(0);
        SouthKingdom.setCol(4);
        SouthKingdom.setSceneType(SceneType.SouthKingdom);
        //setup SouthKingdom
        locations[0][4] = SouthKingdom;
        
         Location CliffTop = new Location();
        CliffTop.setDescription("a CliffTop - large and old and awesome - a bucket is also visible");
        CliffTop.setRow(0);
        CliffTop.setCol(2);
        CliffTop.setSceneType(SceneType.CliffTop);
        //setup CliffTop
        locations[0][2] = CliffTop;
        
         Location WestCliffside = new Location();
        WestCliffside.setDescription("a WestCliffside - large and old and awesome - a bucket is also visible");
        WestCliffside.setRow(13);
        WestCliffside.setCol(4);
        WestCliffside.setSceneType(SceneType.WestCliffSide);
        //setup WestCliffside
        locations[13][4] = WestCliffside;
        
          Location Shoppe = new Location();
        Shoppe.setDescription("a Shoppe - large and old and awesome - a bucket is also visible");
        Shoppe.setRow(11);
        Shoppe.setCol(4);
        Shoppe.setSceneType(SceneType.Shoppe);
        //setup Shoppe
        locations[11][4] = Shoppe;
        
        Location RockYard = new Location();
        RockYard.setDescription("a RockYard - large and old and awesome - a bucket is also visible");
        RockYard.setRow(10);
        RockYard.setCol(4);
        RockYard.setSceneType(SceneType.RockYard);
        //setup RockYard
        locations[10][4] = RockYard;
        
         Location CastleGates = new Location();
        CastleGates.setDescription("a CastleGates - large and old and awesome - a bucket is also visible");
        CastleGates.setRow(8);
        CastleGates.setCol(4);
        CastleGates.setSceneType(SceneType.CastleGates);
        //setup CastleGates
        locations[8][4] = CastleGates;
        
           Location RiverRapids = new Location();
        RiverRapids.setDescription("a RiverRapids - large and old and awesome - a bucket is also visible");
        RiverRapids.setRow(6);
        RiverRapids.setCol(4);
        RiverRapids.setSceneType(SceneType.RiverRapids);
        //setup RiverRapids
        locations[6][4] = RiverRapids;
        
          Location NorthBeach = new Location();
        NorthBeach.setDescription("a NorthBeach - large and old and awesome - a bucket is also visible");
        NorthBeach.setRow(5);
        NorthBeach.setCol(4);
        NorthBeach.setSceneType(SceneType.NorthBeach);
        //setup NorthBeach
        locations[5][4] = NorthBeach;
        
         Location Beach = new Location();
        Beach.setDescription("a Beach - large and old and awesome - a bucket is also visible");
        Beach.setRow(3);
        Beach.setCol(4);
        Beach.setSceneType(SceneType.Beach);
        //setup Beach
        locations[3][4] = Beach;
        
         Location Dungeon = new Location();
        Dungeon.setDescription("a Dungeon - large and old and awesome - a bucket is also visible");
        Dungeon.setRow(10);
        Dungeon.setCol(6);
        Dungeon.setSceneType(SceneType.Dungeon);
        //setup Dungeon
        locations[10][6] = Dungeon;
        
          Location PitOfDespair = new Location();
        PitOfDespair.setDescription("a PitOfDespair - large and old and awesome - a bucket is also visible");
        PitOfDespair.setRow(8);
        PitOfDespair.setCol(6);
        PitOfDespair.setSceneType(SceneType.PitOfDespair);
        //setup PitOfDespair
        locations[8][6] = PitOfDespair;
        
          Location Gazebo = new Location();
        Gazebo.setDescription("a Gazebo - large and old and awesome - a bucket is also visible");
        Gazebo.setRow(6);
        Gazebo.setCol(6);
        Gazebo.setSceneType(SceneType.Gazebo);
        //setup Gazebo
        locations[6][6] = Gazebo;
        
           Location CliffsOfInsanity = new Location();
        CliffsOfInsanity.setDescription("a CliffsOfInsanity - large and old and awesome - a bucket is also visible");
        CliffsOfInsanity.setRow(0);
        CliffsOfInsanity.setCol(13);
        CliffsOfInsanity.setSceneType(SceneType.CliffsOfInsanity);
        //setup CliffsOfInsanity
        locations[0][13] = CliffsOfInsanity;
        
         
    }
    
    public void init() {
        
      for (int row = 0; row < noOfRows; row++){
      for( int col = 0; col < noOfColumns; col++){
//   create and initialize new Location object instance
               Location location = new Location();
                location.setCol(col);
                location.setRow(row);
//                location.setVisited(false);

                locations[row][col] = location;

    }
}
    }
    public String getMapDisplay() {
        String rtn = "";

        for (int row = 1; row < locations.length; row++) {
            for (int column = 0; column < locations[0].length; column++) {
                rtn += "[" + locations[row][column].getSceneType() + "]";
            }
            rtn += "\n";
        }
        return rtn;
    }
    public String getMapString() {
        
        String rtn ="";
        for (int row = 0; row < noOfRows; row++){
      for( int col = 0; col < noOfColumns; col++){
       //   rtn += matrix[row][col].getType().name().charAt(0);
          
//          if(matrix[row][col].getHero() != null) {
//        //      rtn += matrix[row][col].getHero().getName().charAt(0);
//          }
          rtn += "\t";
      }
      rtn += "\n";    
    }
        return rtn;
}
    
   public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] location) {
        this.locations = location;
    }
     public Location getLocation(int row, int column) {
        if (row < 0 || row > locations.length) {
            return null;
        }
        if (column < 0 || column > locations[0].length) {
            return null;
        }
        return locations[row][column];
    }
}
