/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import byui.cit260.curiousWorkmanship.control.Map;
import byui.cit260.curiousWorkmanship.view.GameControl;
import java.io.Serializable;
import java.util.Objects;
import javafx.scene.Scene;

/**
 *
 * @author robertaustin
 */
public class NewMap implements Serializable {

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variables
    private String rowCount;
    private double bestTime;
    private double columnCount;
    private Location[][] locations;
    
    private static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create the scenes for the game
        Scene[] scenes = createScenes();
        
        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    private int noOfRows;
    private int noOfColumns;
    public NewMap() {
    }
    
    public NewMap(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }

    
    public String getRowCount() {
        return rowCount;
    }

    public double getColumnCount() {
        double columnCount = 0;
        return columnCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    public InventoryItem[] getInventory() {
        InventoryItem[] inventory = null;
        return inventory;
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
        return Objects.equals(this.rowCount, other.rowCount);
    }
}
