/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RiseOfDragon;

import byui.cit260.RiseOfDragon.control.Dragon;

/**
 *
 * @author robertaustin
 */
public class DragonClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dragon dragonOne = new Dragon();
       
       dragonOne.setDragon("Batmobile");
       dragonOne.setMaxCapacity(7.00);
       
       String dragonInfo = dragonOne.toString();
       System.out.println(dragonInfo);
       
    }
    
}


