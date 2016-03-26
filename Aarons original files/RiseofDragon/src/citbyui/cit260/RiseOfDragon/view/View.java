/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author aaronrose
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    private Object String;
    
    protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
    protected final PrintWriter console = CuriousWorkmanship.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public java.lang.String display() {
        
        boolean done = false;
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit the view when done == true
        
    @Override
     public String getInput() {
        

        boolean valid = false;
        String value = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            // prompt for the player's name
            this.console.println("\n" + this.displayMessage);
            
            // get the value entered from the keyboard
            value = keyboard.readLine();
            value = value.trim();
            
            if (value.length() < 1) { // blank value entered 
                this.console.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }
        
        return value; // return the name
    }
      
    @Override
     public boolean doAction(String choice) {
        Character character = null;
        
        MapControl.moveCharactersToStartingLocation(character, coordinates);
    }
{
{
        
        value = value.toUpperCase(); // convert to al upper case
    }
}
    }
}
