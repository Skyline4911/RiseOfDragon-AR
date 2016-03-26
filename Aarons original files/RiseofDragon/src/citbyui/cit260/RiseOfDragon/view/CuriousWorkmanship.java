/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author aaronrose
 */
public class CuriousWorkmanship {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            
            // open character stream files for end user input and output
            CuriousWorkmanship.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            CuriousWorkmanship.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            CuriousWorkmanship.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
            
        } catch (Throwable e) {
            
            this.console.println("Execution: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally {
            try {
                if (CuriousWorkmanship.inFile != null)
                    CuriousWorkmanship.inFile.close();
                    ErrorView.display(this.getClass().getName(),
                                      "You must enter a value.");
                    
                if (CuriousWorkmanship.outFile != null)
                    CuriousWorkmanship.outFile.close();
                
                if (CuriousWorkmanship.logFile != null)
                    CuriousWorkmanship.logFile.close();
                              
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                                  "Error reading input: " + e.getMessage());
                
                return;
            }
            
        }
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

    public static Character getCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param game
     */
    public static void setGame(citbyui.cit260.RiseOfDragon.view.Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Object console;

    static class setCurrentGame {

        public setCurrentGame() {
        }
    }

    private static class BuffererdReader {

        public BuffererdReader() {
        }
        
    
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CuriousWorkmanship.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CuriousWorkmanship.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CuriousWorkmanship.logFile = logFile;
    }
    
    
    
    
}
