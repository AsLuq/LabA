package ristoratori;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class RestaurantParser {
    
    /**
     *
     * @param path
     * @return
     * @throws Exception
     */
    
    public List<Ristorante> RestaurantReadFromFile(String path) throws Exception{
        
        File file = new File(path);
        Ristorante restaurant = new Ristorante();
        Scanner scannerFile = new Scanner(file); 
        List<Ristorante> restaurantList = new ArrayList();
        
            while(scannerFile.hasNextLine()){
                String line = scannerFile.nextLine();
                
                restaurant.setRestaurantName(line.substring(0, 29).trim());
                restaurant.setAddress(line.substring(30, 59).trim());
                restaurant.setBuildingNumber(line.substring(60, 64).trim());
                restaurant.setCity(line.substring(65, 104).trim());
                restaurant.setProvince(line.substring(105, 107).trim());
                restaurant.setCap(Integer.parseInt(line.substring(108, 112).trim()));
                restaurant.setTelephoneNumber(line.substring(113, 122).trim());
                restaurant.setWebSite(line.substring(123,172).trim());
                restaurant.setRestaurantType(line.substring(173 , 180).trim());
                
                restaurantList.add(restaurant);
                
            }
            return restaurantList;
    }
        
}
    

