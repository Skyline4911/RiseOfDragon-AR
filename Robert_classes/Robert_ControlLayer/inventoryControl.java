
    package byui.cit260.curiousworksmenship.control;
	
	public class InventoryControl {
	
	    public double calcSatchelSize(double height, double diameter) {
		
		    if (height < 0) { //height is negative?
			    RETURN -1
			}
			
			if (diameter < 0 || diameter > 36) { //diameter out of range?
			    RETURN -1
			}
			
			double radius = diameter / 2
			double volume = (Math.PI * Math.pow(radius, 2) * height) / 1601
			
			return size;
		}
	
	}