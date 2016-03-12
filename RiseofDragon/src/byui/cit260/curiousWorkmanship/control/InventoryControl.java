
package byui.cit260.curiousWorkmanship.control;

import byui.cit260.curiousWorkmanship.view.GameControl;

	public class InventoryControl {

    private double size;
	
	    public double calcSatchelSize(double height, double diameter) {
		
		    if (height < 0) { //height is negative?
			    return -1;
			}
			
			if (diameter < 0 || diameter > 36) { //diameter out of range?
			    return -1;
			}
			
			double radius = diameter / 2;
			double volume = (Math.PI * Math.pow(radius, 2) * height) / 1601;
			
			return size;
		}
            public static InventoryItem[] createInventoryList() {
                
                // created array(list) of inventory items
                InventoryItem[] inventory =
                        new InventoryItem[6];
                
                InventoryItem dragonScales = new InventoryItem();
                dragonScales.setDescription("dragonScales");
                dragonScales.setQuantityInStock(0);
                dragonScales.setRequiredAmount(0);
                inventory[Item.dragonScales.ordinal()] = dragonScales;
                
                InventoryItem magic = new InventoryItem();
                magic.setDescription("magic");
                magic.setQuantityInStock(0);
                magic.setRequiredAmount(0);
                inventory[Item.magic.ordinal()] = magic;
                
                InventoryItem goldCoin = new InventoryItem();
                goldCoin.setDescription("goldCoin");
                goldCoin.setQuantityInStock(0);
                goldCoin.setRequiredAmount(0);
                inventory[Item.goldCoin.ordinal()] = goldCoin;
                
                InventoryItem diamond = new InventoryItem();
                diamond.setDescription("diamond");
                diamond.setQuantityInStock(0);
                diamond.setRequiredAmount(0);
                inventory[Item.diamond.ordinal()] = diamond;
                
                InventoryItem wizardStaff = new InventoryItem();
                wizardStaff.setDescription("wizardStaff");
                wizardStaff.setQuantityInStock(0);
                wizardStaff.setRequiredAmount(0);
                inventory[Item.wizardStaff.ordinal()] = wizardStaff;
                
                InventoryItem claw = new InventoryItem();
                claw.setDescription("claw");
                claw.setQuantityInStock(0);
                claw.setRequiredAmount(0);
                inventory[Item.claw.ordinal()] = claw;
                
                return inventory;
            }
	public enum Item {
            dragonScales,
            magic,
            goldCoin,
            diamond,
            wizardStaff,
            claw;
        }
        private void viewInventory() {
            // get the sorted list of inventory items for the current game
            InventoryItem[] inventory = GameControl.getSortedInventoryList();
            
            System.out.println("\nList of Inventory Items");
            System.out.println("Description" + "\t" +
                                "Required" + "\t" +
                                "In Stock");
            
            // for each inventory item
            for (InventoryItem inventoryItem : inventory) {
                // DISPLAY the description, the required amount and amount in stock
                System.out.println(inventoryItem.getDescription() + "\t  " +
                                    inventoryItem.getRequiredAmount() + "\t  " +
                                    inventoryItem.getQuantityInStock());
            }
        public static InventoryItem[] getSortedInventoryList(){
            System.out.println("\n*** getSortedInventoryList stub funtion called ***");
            return null;
        }
        }
	}