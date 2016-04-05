
    package byui.cit260.RiseOfDragon.control;

	public class dragonControl {
	
	    public double rideOnDragon(double player, double inventory) {
		
		    if (player < 0) { //player is negative?
			    return -1;
			}
			
			if (inventory < 0 || inventory > 42) { //inventory out of range?
			    return -1;
			}

			double weight = (player + inventory);
                double ride = 0;
			
			return ride;
            }
            
	}