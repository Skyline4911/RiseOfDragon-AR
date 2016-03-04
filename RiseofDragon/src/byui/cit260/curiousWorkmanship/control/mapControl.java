
    package byui.cit260.curiousWorkmanship.control;
	
	public class mapControl {
	
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