package ristoratori;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

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
		
            String filePath = "eatAdvisor.txt";
            File file = new File(filePath);
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
                    restaurant.setWebSite(line.substring(123,222).trim());
                    restaurant.setRestaurantType(line.substring(223 , 230).trim());
                
                    restaurantList.add(restaurant);
                
                }
            
                return restaurantList;
		
        }
	
	public void RestaurantWriteToFile(Ristorante restaurant) throws IOException {
		
            File eatAdvisorFile = new File("eatAdvisor.txt");
		
            if(eatAdvisorFile.exists()){
		FileOutputStream restaurantFOP = new FileOutputStream("eatAdvisor.txt",true);
		PrintWriter restaurantWriter = new PrintWriter(restaurantFOP);
		restaurantWriter.println(restaurant.getRestaurantName()  + " - " + restaurant.getAddress() + " - " + restaurant.getBuildingNumber() + " - " + restaurant.getCity() + " - " + restaurant.getProvince() + " - " + restaurant.getCap() + " - " + restaurant.getTelephoneNumber() + " - " + restaurant.getWebSite() + " - " + restaurant.getRestaurantType());
		restaurantWriter.close();
            }else if(eatAdvisorFile.createNewFile()){
		PrintWriter restaurantWriter = new PrintWriter(eatAdvisorFile);
		restaurantWriter.println(restaurant.getRestaurantName()  + " - " + restaurant.getAddress() + " - " + restaurant.getBuildingNumber() + " - " + restaurant.getCity() + " - " + restaurant.getProvince() + " - " + restaurant.getCap() + " - " + restaurant.getTelephoneNumber() + " - " + restaurant.getWebSite() + " - " + restaurant.getRestaurantType());
		restaurantWriter.close();
            }
		
	}
    
        
}
    

