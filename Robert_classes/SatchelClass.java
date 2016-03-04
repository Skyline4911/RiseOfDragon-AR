/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseofdragon;

import byui.cit260.curiousWorkmanship.model.Map;

/**
 *
 * @author robertaustin
 */
public class SatchelClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Satchel satchelOne = new Satchel();
       
       satchelOne.setSatchel("UtilityBelt");
       satchelOne.setMaxWeight(7.00);
       
       String satchelInfo = satchelOne.toString();
       System.out.println(satchelInfo);
       
    }
    
}


