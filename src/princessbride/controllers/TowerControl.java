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
public class TowerControl {
    
    public double calMinutes(double steps, double feetSec){
        
                          if (steps  != 600){
                              return -1;
                             }
                          if (feetSec < 2 || feetSec >4 ) {
                                return -1;
                             }   
                          double stepSec= steps/60;
                          double  minutes = stepSec /feetSec ;

                          return minutes;

    
    }
    
}