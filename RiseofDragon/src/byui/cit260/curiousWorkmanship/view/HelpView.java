/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

/**
 *
 * @author aaronrose
 */
public abstract class HelpView implements ViewInterface {
    
    protected String displayMessage;
    
    public HelpView() {
}
    public HelpView(String message) {
        this.displayMessage = message;
    }
    @Override
    public void display() {
        
        boolean done = false;
        do {
            // prompt player to make a selection
            String value = this.getInput();
            if (value.toUpperCase().equals("H")) // user wants help
                return; // open help menu
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit the help screen when done == true
    }
    
    public class HelpView extends View {
        
        public HelpView() {
            super("\n"
                + "\n-----------------------------------"
                + "\n| Main Menu                       |"
                + "\nN - Start game"
                + "\nH - Help"
                + "\nG - Get and start existing game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n-----------------------------------");
        }
    }
}
