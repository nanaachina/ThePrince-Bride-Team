/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import princessbride.controllers.GameControl;
import java.util.Scanner;
import princessbride.Model.Player;

/**
 *
 * @author adm-achina
 */

public class MenuView {
     private String[][] menuItems;

    public MenuView() {
    }
    public MenuView(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
 public final void display() {
        ErrorView.display(this.getClass().getName(),"\n\t===============================================================");
        ErrorView.display(this.getClass().getName(),"\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            ErrorView.display(this.getClass().getName(),"\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        ErrorView.display(this.getClass().getName(),"\t===============================================================\n");
    }

    private boolean validOption(String option) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(option)) {
                return true;
            }
        }
        return false;
    }

     protected final String getOption() {

        Player inFile = princessbride.PrincessBride.getPlayer();
        String option;
        boolean valid = false;
        do {
            option = inFile.nextLine();
            option = option.trim().toUpperCase();
            valid = validOption(option);
            if (!validOption(option)) {
                new PrincessBride("Invalid command. Please enter a valid command.").display();
            }
                
        } while (!valid);
        
        return option;
    }

    private static class PrincessBride {

        public PrincessBride(String invalid_command_Please_enter_a_valid_comm) {
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
