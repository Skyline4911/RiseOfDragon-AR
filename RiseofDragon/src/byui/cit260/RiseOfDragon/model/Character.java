/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.RiseOfDragon.model;

import java.io.Serializable;

/**
 *
 * @author aaronrose
 */
public enum Character implements Serializable {
    
    Frodo("He is the keeper of the key."),
    Sam("He is Frodo's guardian."),
    Aragon("He is the king of the land."),
    Legolas("He is the best warrior the world."),
    Gimly("He is an apprentice to Legolas."),
    Gandolf("He is the white wizard."),
    Rey("She is the garbage collector.");
    
    private final String bestTime;

    Character(String description) {
    }   this.bestTime = bestTime;

    public String getBestTime() {
        return bestTime;
    }
    
    public character getCharacter() {
        return character;
}

    public void setCharacter(Character character) {
        this.character = character;
}
    public InventoryItem[] getInventory() {
        return inventory;
}
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }
   
}
