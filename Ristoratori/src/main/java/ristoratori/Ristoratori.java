package ristoratori;

import java.util.List;

/**
 *
 * @author crist
 */

public class Ristoratori {

    public static void main(String args[]) throws Exception{
         
        // RestaurantLoginGUI restaurantLogin = new RestaurantLoginGUI();
        // restaurantLogin.setVisible(true);
        
         RestaurantParser provParser = new RestaurantParser(); 
         List<Ristorante> tmpList = provParser.ReadFromFile();
         System.out.println(tmpList);
    }
}
