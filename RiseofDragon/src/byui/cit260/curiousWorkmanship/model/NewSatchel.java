/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author robertaustin
 */
public class NewSatchel implements Serializable {
    
    //class instance variables
    private String diameter;
    private double maxWeight;

    public NewSatchel() {
    }

    
    public String getDiameter() {
        return diameter;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.diameter);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Satchel{" + "diameter=" + diameter + ", maxWeight=" + maxWeight + '}';
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
        final Satchel other = (Satchel) obj;
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        return Objects.equals(this.maxWeight, other.maxWeight);
    }
    
}
