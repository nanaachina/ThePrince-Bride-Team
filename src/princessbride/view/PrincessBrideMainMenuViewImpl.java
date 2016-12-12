/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;


/**
 *
 * @author adm-achina
 */
public abstract class PrincessBrideMainMenuViewImpl extends MainMenuView {

    public void doInput(String value) {
        
    }

    public void doAction(char choice) {
        do{
        switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'C':
                this.displaySceneView();
                break;
            case 'G':
                    this.getSavedGame();
                    break;
            case 'H':
                    this.displayHelpMenu();                   
                    break;
            case 'S':
                    this.saveGame();
                    break;
            case 'Q':
                     case 'P':
                               this.HelpToPLAY();
                               break;
                     case 'W'://Get Existing Game
                                                                                           
                                               this.UseMap();
                                                break;
                     case 'D':
                                                this.Defend();
                                                break;
                     //quit = true;
        }              
        }while (choice != 'Q') ;
       
    }

  //  @Override
   // public String getInputHelp() {
        
   // }

   // @Override
    //public void doActionHelp() {
        
   // }

    public void startNewGame() {
        
    }
    
     private void displaySceneView() {
        
    }

    private void getSavedGame() {
        
    }

    private void displayHelpMenu() {
        
    }

    private void saveGame() {
        
    }

    private void HelpToPLAY() {

    }

       private void UseMap() {
    }

    private void Defend() {
    }

       
}

