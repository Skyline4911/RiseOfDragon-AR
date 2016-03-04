/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import byui.cit260.curiousWorkmanship.control.Dragon;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author robertaustin
 */
public class NewDragon implements Serializable {
    
    //class instance variables
    private String description;
    private double maxCapacity;
    private Object inventoryType;
    private double requiredAmount;

    public NewDragon() {
    }

    
    public String getDescription() {
        return description;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.inventoryType);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Dragon{" + "description=" + description + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dragon other = (Dragon) obj;
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }
}
