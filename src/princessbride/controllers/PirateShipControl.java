/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;

/**
 *
 * @author Carlos Pari
 */
public class PirateShipControl {
    
    public double calTotalWater(double people, double days){
           
                   if (days>8){
                   return -1;
                   }
                   if (people < 0 || people>51 ){
                   return -1;
                   }
                   double gallon = people*2;
                   double total = gallon *days;

                   return total;

    }
    
}
