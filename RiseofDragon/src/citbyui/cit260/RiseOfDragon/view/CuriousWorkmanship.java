/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.RiseOfDragon.view;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author starleneowen
 */
public class CuriousWorkmanship {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CuriousWorkmanship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CuriousWorkmanship.player = player;
    }
    
    
}
