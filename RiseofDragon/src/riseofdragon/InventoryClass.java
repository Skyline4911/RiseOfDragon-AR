/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseofdragon;

/**
 *
 * @author robertaustin
 */
public class InventoryClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Game gameOne = new Game();
       
       inventoryOne.setInventory("Batarang");
       inventoryOne.setRequiredAmount(7.00);
       
       String inventoryInfo = inventoryOne.String();
       System.out.println(inventoryInfo);
       
    }
    
}


