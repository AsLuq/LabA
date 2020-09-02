package ristoratori;

/**
 *
 * @author crist
 */

public class Ristoratori {

    public static void main(String args[]) throws Exception{
         
        // RestaurantLoginGUI restaurantLogin = new RestaurantLoginGUI();
        // restaurantLogin.setVisible(true);
        
        Ristorante prov = new Ristorante();
        RestaurantParser provParser = new RestaurantParser();
        
        System.out.println(provParser.RestaurantReadFromFile());

    }
}
