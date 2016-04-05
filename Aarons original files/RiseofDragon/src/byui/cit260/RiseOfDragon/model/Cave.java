/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.RiseOfDragon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author robertaustin
 */
public class Cave implements Serializable {
    
    // class instance variables
    private String name;
    private double bestTime;

    public Cave() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public enum Item {
        scales,
        staff,
        magic,
        sword,
        gold,
        diamond,
        water,
        claws;
    }
