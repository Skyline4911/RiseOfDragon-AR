/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseofdragon;

import byui.cit260.curiousWorkmanship.model.Map;

/**
 *
 * @author robertaustin
 */
public class NewClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Game gameOne = new Game();
       
       gameOne.setGame("Arkham");
       gameOne.setBestTime(7.00);
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);
       
    }
    
}


