/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.RiseOfDragon.view;

import byui.cit260.RiseOfDragon.model.Player;
import java.util.Scanner;

/**
 *
 * @author aaronrose
 */
public class StartProgramView {

    private final String promptMessage;
    
    public StartProgramView() {
        // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        this.console.println(
            "\n**********************************************"
          + "\n*                                            *"
          + "\n* This is the game Rise of the Dragon        *"
          + "\n* This is a time when dragons ruled the      *"
          + "\n* world. For ages man feared these           *"
          + "\n* mystical beasts.                           *"
          + "\n*                                            *"
          + "\n* But times have changed, these creatures    *"
          + "\n* are being hunted down one by one.          *"
          + "\n* Your objective is to train and find        *"
          + "\n* 35 dragons to save them from extinction.   *"
          + "\n*                                            *"
          + "\n* Warning: These creatures are dangerous     *"
          + "\n* so proceed with caution.                   *"
          + "\n*                                            *"
          + "\n**********************************************"
          );
    }
    /**
     * displays the start program view
     */
    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
        
    }

    private String getPlayersName() {
        

        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            value = keyboard.readLine(); //get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
        this.console.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
    }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            ErrorView.display(this.getClass().getName(),
                    "You must enter a value.");
            return false;
        }
        
        // display next view
        this.displayNextView();
        
        return true; // success !
    }

    private void displayNextView(Player player) {
        
        //display a custom welcome message
        this.console.println("\n===================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n===================================="
                          );         
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }

    private void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
