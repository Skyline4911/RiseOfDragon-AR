/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.RiseOfDragon.view;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author robertaustin
 */
class Game {
        
    public static Player resumeGame(String name) {
            
            if (game == null) {
                return null;
            }
            
            Game game = new Game();
            player.setName(name);
            
            CuriousWorkmanship.setGame(game); // save the game
            
            return game;
        }
       
    }
    
    private boolean doAction(String resumeGame) {
        
        // if the length of the playersName < 2 then
            // display "Invalid game: The game must be > 1 oldGame"
            // return false
            
        // create Game with specified name
        // if unsuccessful then
            // display "Invalid name: The name is too short"
            // return false
            
        // display customized welcome message
        // display mainMenuView
        // return true
    }
}

