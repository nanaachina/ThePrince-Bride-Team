/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import java.util.Scanner;
import princessbride.Model.Player;
import princessbride.controllers.GameControl;

/**
 *
 * @author Carlos Pari
 */
public class StartProgramView {
    public StartProgramView() {
        
    }
    
    //subtasks for which separate functions were created:
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        //prompt the player to enter their name Retrieve the name of the player
        String name = this.getName();
        //Create and save the player object
        Player player = GameControl.createPlayer(name);
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        //Display the Main menu.
       
    }
    
    //implemented displayBanner() function:
   private void displayBanner() {
        System.out.println("\n\n*********************************************");
        
        System.out.println("\n This is the game of the Princess Bride     "
                        + "\n In this game you will help the princess by saving her  "
                        + "\n from the three stooges    "
                        + "\n You must chase them throughout the kingdom   "
                        + "\n");
        
        System.out.println("\n You will fight them and outsmart them to win "
                        + "\n Be sure to be careful and practice your sword fighting       "
                        + "\n Before leaving to rescue her. "
                       
                        + "\n");
        
        System.out.println("\n Good luck and have fun, if you dare!         "
                        + "\n");
        
        System.out.println("************************************************");
    }    

    private String getName() {
        boolean valid = false; //indicates if the name has been retrieved
        String name = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
           System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim the blanks
            name = keyboard.nextLine();
            name = name.trim();
            
            //if the name is invalid (less than two character in length)
            if (name.length() < 3) {
                ErrorView.display(this.getClass().getName(),"Invalid name - the name must be at least 3 characters");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        
        return name; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n*********************************************");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tGood luck saving the princess!");
        System.out.println("*************************************************");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
    
}