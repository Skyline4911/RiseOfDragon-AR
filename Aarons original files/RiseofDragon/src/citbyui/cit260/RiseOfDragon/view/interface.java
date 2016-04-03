/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.RiseOfDragon.view;

import byui.cit260.curiousWorkmanship.model.Player;
import static com.sun.java.accessibility.util.EventID.MENU;

/**
 *
 * @author robertaustin
 */

public interface ViewInterface {
    public void display();
    public String getInput();
    public boolean doAction(String value);
}
