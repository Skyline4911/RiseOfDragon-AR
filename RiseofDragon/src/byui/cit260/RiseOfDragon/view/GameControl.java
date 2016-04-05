/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.RiseOfDragon.view;

import byui.cit260.RiseOfDragon.control.Dragon;
import byui.cit260.RiseOfDragon.control.InventoryItem;
import byui.cit260.RiseOfDragon.model.Map;
import byui.cit260.RiseOfDragon.model.Player;
import static java.lang.System.in;
import javafx.scene.Scene;

/**
 *
 * @author aaronrose
 */
public class GameControl {
        
    public static void createNewGame(Character character) {
    }
    
    public static InventoryItem[] createInventoryList() {
        System.out.println("*** called createInventoryList() in GameControl ***");
        return null;
    }

    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void assignScenesToLocations(byui.cit260.RiseOfDragon.control.Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        Game game = new Game(); //create new game
        CuriousWorkmanship.setCurrentGame(game); // save in CuriousWorkmanship
        
        game.setCharacter(character); // save character in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        
        Dragon dragon = new Dragon(); // create new dragon
        game.setDragon(dragon); save dragon in game
                
        Satchel satchel = new Satchel(); // create new satchel
        game.setSatchel(satchel); // save satchel in game
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveCharactersToStartingLocation(map);
    
    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(CuriousWorkmanship.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private static Scene[] createScenes() {
        Game game = CuriousWorkmanship.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\nFor thousands of years dragons roamed the earth, "
              + "striking fear to all those who were near. But those "
              + "days have passed, because man no longer fears dragons."
              + "Now it is up to you to find and rescue the remaining "
              + "dragons");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nWell done! You are on your way to taming dragons "
              + "in no time. Congratulations!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;

        public enum SceneType {
        (    start,
            dragon,
            ocean,
            sunset,
            field,
            claw,
            satchel,
            river
            );
}
                            
        private static class finish {

            private static int ordinal() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public finish() {
            }
        }
    }
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Locations[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.dragon.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.ocean.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sunset.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.claw.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.satchel.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.river.ordinal()]);
}   
}