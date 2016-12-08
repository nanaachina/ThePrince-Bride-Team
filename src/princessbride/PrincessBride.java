/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import princessbride.Model.Game;
import princessbride.Model.Player;
import princessbride.Model.TheShop;
import princessbride.Model.Tower;
import princessbride.view.ErrorView;
import princessbride.view.StartProgramView;

/**
 *
 * @author ryan
 */
public class PrincessBride {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            // open character stream files for end user input and output
            PrincessBride.inFile = new BufferedReader(new InputStreamReader(System.in));
            PrincessBride.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            PrincessBride.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        finally {
            try {
                if (PrincessBride.inFile != null)
                    PrincessBride.inFile.close();
                
                if (PrincessBride.outFile != null);
                    PrincessBride.outFile.close();
                    
                if (PrincessBride.logFile != null);
                    PrincessBride.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PrincessBride.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PrincessBride.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PrincessBride.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PrincessBride.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PrincessBride.logFile = logFile;
    }
    
}
