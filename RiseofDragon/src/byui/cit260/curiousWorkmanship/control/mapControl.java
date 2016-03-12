
    package byui.cit260.curiousWorkmanship.control;
	
import javafx.scene.Scene;

	public class mapControl {
	
            public static Map createMap() {
                // create the map
                Map map = new Map(20, 20);
                
                // create a list of the different scenes in the game
                Scene[] scenes = createScenes();
                
                // assign the different scenes to locations in the map
                assignScenesToLocations(map, scenes);
                
                return map;
            }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	    public double move(double actor, double location) {
		
		    if (actor < 0) { //actor is negative?
			    return -1;
			}
			
			if (location < 0 || location > 2) { //location out of range?
			    return -1;
			}

			double change = (location / actor);
                double movement = 0;
			
			return movement;
		}
	
	}