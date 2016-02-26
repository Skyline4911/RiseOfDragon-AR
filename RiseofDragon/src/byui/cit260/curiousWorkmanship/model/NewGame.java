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
public class NewGame implements Serializable {
    
    //class instance variables
    private String totalTime;
    private double noPeople;

    public NewGame() {
    }

    
    public String getTotalTim() {
        return totalTime;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.totalTime);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }
    
}
