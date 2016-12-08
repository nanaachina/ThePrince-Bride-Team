/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

import java.io.PrintWriter;
import princessbride.PrincessBride;

/**
 *
 * @author ryanbrown
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = PrincessBride.getOutFile();
    private static final PrintWriter logFile = PrincessBride.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                    "---------------------------------"
                  + "\n- ERROR -" + errorMessage
                  + "\n-------------------------------");
        logFile.println(className + " - " +errorMessage);
    }
    
    
}
