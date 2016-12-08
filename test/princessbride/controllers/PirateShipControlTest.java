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
public class PirateShipControlTest {
    
    public PirateShipControlTest() {
    }

    /**
     * Test of calTotalWater method, of class PirateShipControl.
     */
    @Test
    public void testCalTotalWater() {
        ErrorView.display(this.getClass().getName(),"calTotalWater");
        
        /********
         * Test case # 1
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #1");
        
        //input values for test case 1
        double people = 50.0;
        double days = 7.0;
        
        double expResult = 700.0; //expected output returned value
         // create instance of PirateShipControl class
        PirateShipControl instance = new PirateShipControl();
       
        //call function to run test
        double result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
        
        /********
         * Test case # 2
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #2");
        
        //input values for test case 2
        people = -1.0;
        days = 7.0;
        
        expResult = -1.0; //expected output returned value
        
       
        //call function to run test
       result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
        
        /********
         * Test case # 3
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
        
        //input values for test case 3
        people = -1.0;
        days = -1.0;
        
        expResult = -1.0; //expected output returned value
         
       
        //call function to run test
        result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
        
        /********
         * Test case # 4
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
        
        //input values for test case 4
        people = 60.0;
        days = 7.0;
        
        expResult = -1.0; //expected output returned value
         
       
        //call function to run test
        result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
         
        /********
         * Test case # 5
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
        
        //input values for test case 5
        people = 0.0;
        days = 7.0;
        
        expResult = 0.0; //expected output returned value
         
       
        //call function to run test
        result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
        
        /********
         * Test case # 6
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
        
        //input values for test case 6
         people = 50.0;
         days = 0.0;
        
         expResult = 0.0; //expected output returned value
         
       
        //call function to run test
         result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
        
        /********
         * Test case # 7
         ********************/
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
        
        //input values for test case 7
        people = 40.0;
        days = 7.0;
        
        expResult = 560.0; //expected output returned value
         
        //call function to run test
        result = instance.calTotalWater(people, days);
        // Compare expected return value with actual value returned
        assertEquals(expResult,result,0.1);
    }
    
}
