/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import princessbride.Model.Game;
import princessbride.Model.Inventory;
import princessbride.PrincessBride;
import princessbride.controllers.GameControl;
import princessbride.controllers.InventoryControl;
import princessbride.controllers.MovementControl;
import princessbride.exception.MovementException;

/**
 *
 * @author Administrator
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\nH - look items"
                + "\nV - View Map"
                + "\nI - View list of items in inventory"
                + "\nA - View list of actors"
                + "\nL - View current location"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

            case 'H':
                this.lookForItems();
                break;
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
            case 'L':
                this.showLocation();
                break;
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'Q'://Do we need this
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid selection - Try again");
        }
        return false;
    }

    private void lookForItems() {
        InventoryControl ic = new InventoryControl();

        ErrorView.display(this.getClass().getName(),ic.lookForItems(Game.getInstance().getPlayer().getLocation(), Game.getInstance().getPlayer()));
    }

    private void showLocation() {
        //Added a Grid Location to go with the description
        int row = Game.getInstance().getPlayer().getLocation().getRow();
        int column = Game.getInstance().getPlayer().getLocation().getCol();
        System.out.println("Player is at: " + row + ", " + column);
        System.out.println("You are at " + Game.getInstance().getPlayer().getLocation().getDescription());
    }

    private void displayMap() {
        System.out.println(Game.getInstance().getMap().getMapDisplay());
    }

    private void viewInventory() {
        Inventory[] inventory = GameControl.getSortedInventorylist();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description");

        //for each inventory item
        for (Inventory inventoryItem : inventory) {
            System.out.println(inventoryItem.getItemName());
        }
    }

    private void viewActors() {

        if (Game.getInstance().getPlayer().getLocation().getActor() == null) {
            System.out.println("There is no actor here.");
        } else {

            System.out.println("You're standing by the " + Game.getInstance().getPlayer().getLocation().getActor().getName());
            System.out.println("He says " + Game.getInstance().getPlayer().getLocation().getActor().getEnumDescription());
        }
    }

    private void moveNorth() {
        MovementControl mc = new MovementControl();
        try {
            mc.moveNorth(Game.getInstance().getPlayer());
        } catch (MovementException me) {
            System.out.println(me.getMessage());
        }

    }

    private void moveEast() {
        MovementControl mc = new MovementControl();
        try {
            mc.moveEast(Game.getInstance().getPlayer());
        } catch (MovementException me) {
            System.out.println(me.getMessage());
        }
    }

    private void moveSouth() {
        MovementControl mc = new MovementControl();
        try {
            mc.moveSouth(Game.getInstance().getPlayer());
        } catch (MovementException me) {
            System.out.println(me.getMessage());
        }
    }

    private void moveWest() {
        MovementControl mc = new MovementControl();
        try {
            mc.moveWest(Game.getInstance().getPlayer());
        } catch (MovementException me) {
            System.out.println(me.getMessage());
        }
    }
}
