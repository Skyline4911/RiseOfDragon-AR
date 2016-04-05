/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseofdragon;

import byui.cit260.RiseOfDragon.model.Player;

/**
 *
 * @author aaronrose
 */
public class RiseofDragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Batman");
       playerOne.setBestTime(7.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
    }
    
}
