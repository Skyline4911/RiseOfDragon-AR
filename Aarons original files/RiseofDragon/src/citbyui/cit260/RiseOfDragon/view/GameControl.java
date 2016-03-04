/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.RiseOfDragon.view;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author aaronrose
 */
class GameControl {
        
    public static Player createPlayer(String name) {
            
            if (name == null) {
                return null;
            }
            
            Player player = new Player();
            player.setName(name);
            
            CuriousWorkmanship.setPlayer(player); // save the player
            
            return player;
        }
       
    }
    
    private boolean doAction(String playersName) {
        
        // if the length of the playersName < 2 then
            // display "Invalid name: The name must be > 1 character"
            // return false
            
        // create Player with specified name
        // if unsuccessful then
            // display "Invalid name: The name is too short"
            // return false
            
        // display customized welcome message
        // display mainMenuView
        // return true
    }
}
