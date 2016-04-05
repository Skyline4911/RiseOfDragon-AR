/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RiseOfDragon;

import byui.cit260.RiseOfDragon.model.Map;

/**
 *
 * @author robertaustin
 */
public class MapClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map mapOne = new Map();
       
       mapOne.setMap("Batcave");
       mapOne.setBestTime(7.00);
       
       String mapInfo = mapOne.toString();
       System.out.println(mapInfo);
       
    }
    
}


