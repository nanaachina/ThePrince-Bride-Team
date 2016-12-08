/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;
import java.util.Scanner;
/**
 *
 * @author Ryan
 */
public class HelpMenuView extends View {
    private String menu;
    
    public  HelpMenuView () {
        super("\n"
            + "\n------------------------------------------"
            + "\n|Help Menu                               |"
            + "\n------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move?"
            + "\nL - Find locations"
            + "\nR - Available resources"
            + "\nQ - Quit"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        char selection = value.charAt(0);
        switch (selection) {

            case 'G':
                ErrorView.display(this.getClass().getName(),"The goal of the game is to save princess");
                break;
            case 'M':
                ErrorView.display(this.getClass().getName(),"From the Game menu you can select which direction to move");
                break;
            case 'L':
                for(SceneType sce : SceneType.values()){
                    System.out.println(sce);
                }
                break;
            case 'R':
                 for(ItemEnum i : ItemEnum.values()){
                   System.out.println(i);
                }
                break;
            case 'Q':

                return false;

            default:
                ErrorView.display(this.getClass().getName(),"Invalid selection - Try again");
        }
        return true;
    }
}
