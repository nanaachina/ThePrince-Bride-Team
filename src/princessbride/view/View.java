/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import princessbride.PrincessBride;
import princessbride.view.ErrorView;

/**
 *
 * @author Jeff
 */
public abstract class View implements ViewInterface {
    
     private String message;
    
    protected final BufferedReader keyboard = PrincessBride.getInFile();
    protected final PrintWriter console = PrincessBride.getOutFile();
    
    protected String displayMessage;
    
    public View(String message) {
            this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.displayMessage);  //print message
            value = this.getInput(); //get the input from the user
            done = this.doAction(value); //do action based on selection
        }
        while (!done);
    }
    
    public String getInput() {
        boolean valid = false; 
        String selection = null;
        
        try {
            //while a valid letter has not been retrieved
            while(!valid) { 
            
                //get the letter from the keyboard and trim the blanks
                selection = keyboard.readLine();
                selection = selection.trim().toUpperCase();
                    
                //if the letter is invalid (out of the menu scope)
                if (selection.length() < 1) { //blanc value entered
                    ErrorView.display(this.getClass().getName(),
                            "Invalid letter - the letter must be from the menu");
                    continue; //and repeat again
                }
                break;
            }
        } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        return selection; //return the name
    }
}
