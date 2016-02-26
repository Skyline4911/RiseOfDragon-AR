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
public class NewMap implements Serializable {
    
    //class instance variables
    private String rowCount;
    private double bestTime;

    public NewMap() {
    }

    
    public String getRowCount() {
        return rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        return true;
    }
    
}
