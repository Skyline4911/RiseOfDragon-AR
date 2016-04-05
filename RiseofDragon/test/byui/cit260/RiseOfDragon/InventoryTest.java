/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.RiseOfDragon;

import byui.cit260.RiseOfDragon.control.Inventory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author starleneowen
 */
public class InventoryTest {
    
    public InventoryTest() {
    }

    /**
     * Test of calcAmountNeededForTraining method, of class Inventory.
     */
    @Test
    public void testCalcAmountNeededForTraining() {
        System.out.println("calcAmountNeededForTraining");
        double height = 0.0;
        double diameter = 0.0;
        Inventory instance = new Inventory();
        double expResult = 0.0;
        double result = instance.calcAmountNeededForTraining(height, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
