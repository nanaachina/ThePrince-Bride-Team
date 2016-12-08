/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import java.util.Scanner;
import princessbride.PrincessBride;
import princessbride.controllers.GameControl;

/**
 *
 * @author Ryan Brown
 */
public class MainMenuView extends View {

    private String menu;
    
    public MainMenuView(){
            super("\n"
                  + "\n------------------------"
                  + "\n | Main Menu"
                  + "\n------------------------"
                  + "\nN - Start New Game"
                  + "\nO - Load Game"
                  + "\nH - Help"
                  + "\nS - Save Game"
                  + "\nE - Exit Game"
                  + "\n------------------------");
                 
    }
    @Override
    public boolean doAction(String value) {
        char selection = value.charAt(0);
        switch (selection) {

            case 'N':
                this.startNewGame();
                break;
            case 'S':
                saveGame();
                break;
            case 'O':
                openGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
                exitGame();
                return true;

            default:
                ErrorView.display(this.getClass().getName(),"Invalid selection - Try again");
                break;
        }
        return false;
    }

    public void startNewGame() {
        GameControl.createNewGame(PrincessBride.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();


    }

    private void saveGame() {
this.console.println("Enter the path where you want to save the game");
String filePath = this.getInput();

try{
    GameControl.saveGame(PrincessBride.getCurrentGame(), filePath);
}catch(Exception ex){
    ErrorView.display("MainMenuView", ex.getMessage());
}
    }

    private void openGame() {
 this.console.println("Enter file path of saved game");
        
        String filePath = this.getInput();
         try{
             GameControl.openGame(filePath);
         }catch(Exception ex){
             ErrorView.display("MainMenuView",ex.getMessage());
         }
         
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.display();    }

    private void showHelpMenu() {
    HelpMenuView helpMenu = new HelpMenuView();
    helpMenu.display();
    }

    private void exitGame() {
                ErrorView.display(this.getClass().getName(),"exit game");
    }

    
}
