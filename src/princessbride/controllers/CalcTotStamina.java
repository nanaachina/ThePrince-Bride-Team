/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Random;
import princessbride.view.ErrorView;
/**
 * @author Administrator
 */
public class CalcTotStamina implements Serializable{
 
    private int totalRemainingStamina;
    public void CalcTotalStamina(){
        
    
    Scanner reader = new Scanner(System.in);
    ErrorView.display(this.getClass().getName(),"Enter your Strike Force: ");
    int sf = reader.nextInt();
    ErrorView.display(this.getClass().getName(),"Enter Dodge speed: ");
    
    int ds = reader.nextInt();
    int totStamina = 1000;
    
Random rand = new Random();

int randomEnemyDodge = rand.nextInt(4) + 1; 


    
    int totalRemaingStamina = totStamina - (sf + ds) * randomEnemyDodge;
    
    ErrorView.display(this.getClass().getName(),"Total stamina is now:" + totalRemainingStamina);
}
    
}
