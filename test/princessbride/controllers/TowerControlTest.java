/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.controllers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Pari
 */
public class TowerControlTest {
    
    public TowerControlTest() {
    }

    /**
     * Test of calMinutes method, of class TowerControl.
     */
    @Test
    public void testCalMinutes() {
        ErrorView.display(this.getClass().getName(),"calMinutes");
        /**********
         * Test case  # 1         
         *************/
         ErrorView.display(this.getClass().getName(),"\tTest case #1");
         //input values for test cases
        double steps = 600.0;
        double feetSec = 2.0;
        double expResult = 5.0;//expected output value.
        
        //create instance of TowerControl class.
        TowerControl instance = new TowerControl();
      //call function to run test.
        double result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
         /******************
         * Test case  # 2        
         *******************/
         
         ErrorView.display(this.getClass().getName(),"\tTest case #2");
         //input values for test cases 
        steps = -1.0;
        feetSec = 2.0;
        expResult = -1.0;//expected output value.
        
         //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /******************
         * Test case  # 3        
         *******************/
        
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
         //input values for test cases 
        steps = 600.0;
        feetSec = -1.0;
        expResult = -1.0;//expected output value.
        
       //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
     
         /******************
         * Test case  # 4       
         *******************/
        
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
         //input values for test cases 
        steps = 700.0;
        feetSec = 2.0;
        expResult = -1.0;//expected output value.
        
       //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
         /******************
         * Test case  # 5        
         *******************/
        
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
         //input values for test cases 
        steps = 0.0;
        feetSec = 2.0;
        expResult = -1.0;//expected output value.
        
       //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
         /******************
         * Test case  # 6        
         *******************/
        
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
         //input values for test cases 
        steps = 600.0;
        feetSec = 0.0;
        expResult = -1.0;//expected output value.
        
       //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
         /******************
         * Test case  # 7        
         *******************/
        
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
         //input values for test cases 
        steps = 600.0;
        feetSec = 3.0;
        expResult = 3.3;//expected output value.
        
       //call function to run test
        result = instance.calMinutes(steps, feetSec);
       // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
    }
    
}
