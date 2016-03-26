/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.model.Player;
import static com.sun.java.accessibility.util.EventID.MENU;

/**
 *
 * @author aaronrose
 */
class MainMenuView {
    
    void displayMainMenuView() {
        this.console.println("\n*** displayMenu() function called ***");
    }
    private void displayNextView(Player player) {
        
        // display a custom welcome message
        this.console.println("\n======================================"
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n======================================"
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
    private void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class mainMenuView extends View {
        
        public mainMenuView() {
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
        public void displayManu() {
            char selection = ' ';
            do {
                
                this.console.println(MENU); // display the main menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'E'); // an selection is not "Exit"
        }

        private void displayMainMenuView() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public void doAction(char choice) {
            
            switch (choice) {
                case 'N': // create and start a new game
                    this.startNewGame();
                    break;
                case 'G': // get and start an existing game
                    this.startExistingGame();
                    break;
                case 'H': // display the help menu
                    this.displayHelpMenu();
                    break;
                case 'S': // save the current game
                    this.saveGame();
                    break;
                case 'E': // Exit the program
                    return;
                default:
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;               
            }
        }
        private void startNewGame() { 
            // create a new game
            GameControl.createNewGame(CuriousWorkmanship.getPlayer());
            this.console.println("*** startNewGame function called ***");
            
            // display a game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.dispay();
        }
        private void startExistingGame() {
            this.console.println("*** startExistingGame function called ***");
        }
        private void startSavedGame() {
            
            // prompt for and get the name of the file to save the game in
            this.console.println("\n\nEnter the file path for file where the game "
                                + "is to be saved.");
            String filePath = this.getInput();
            
            try {
                // start a saved game
                GameControl.getSavedGame(filePath);
                
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
            // display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.dispay();
        }
        private void saveGame() {
            this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved.");
            String filePath = this.getInput();
            
            try {
                // save the game to the specified file
                GameControl.saveGame(CuriousWorkmanship.getCurrentGame(), filePath);
            } catch (Exception ex) {
                ErrorView.display("MainMenuView", ex.getMessage());
            }
        }
        private void displayHelpMenu() {
            this.console.println("*** displayHelpMenu function called ***");
        }
        public void displayMap() {
            this.console.println("*** displayMap stub function called ***");
        }

        @Override
        public void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getInput() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean doAction(String value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
    public class GameControl {

        private static void saveGame(Game currentGame, String filePath) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void getSavedGame(String filePath) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public void createNewGame(Player player) {
            this.console.println("\n*** createNewGame stub function called ***");
        }
    public class GameMenuView {
        
        void displayMenu() {
            this.console.println("\n*** displayMenu stub function called ***");
        }
    }
    }

    private class console {

        private static void println(String_displayMenu_function_called_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public console() {
        }
    }
}
