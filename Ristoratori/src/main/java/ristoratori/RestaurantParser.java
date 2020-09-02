
package ristoratori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 *
 * @author crist
 */
public class RestaurantParser {
    
    
    public RestaurantParser(){
    }
    
    /**
     *
     * @throws Exception
     */
    
    // <editor-fold desc = "Attributes">
    
    public static String path = "C:\\Users\\crist\\Desktop\\LabA-working Corretto\\Ristoratori\\eatAdvisor.txt";
    
    //<editor-fold desc = "Methods";
    
        public List<Ristorante> RestaurantReadFromFile() throws Exception{
            FileReader eatAdvisor = new FileReader("eatAdvisor.txt");
            BufferedReader eatAdvisorBR = new BufferedReader(eatAdvisor);
            
            List<Ristorante> tmpRestaurantList = new ArrayList();
            String restaurantLine = eatAdvisorBR.readLine();
            
            while(restaurantLine!= null){
                Ristorante tmpRestaurant = new Ristorante();
                
                tmpRestaurant.setRestaurantName(restaurantLine.substring(0, 29).trim());
                tmpRestaurant.setAddress(restaurantLine.substring(30,59 ).trim());
                tmpRestaurant.setBuildingNumber(restaurantLine.substring(60, 64).trim());
                tmpRestaurant.setCity(restaurantLine.substring(65, 104).trim());
                tmpRestaurant.setProvince(restaurantLine.substring(105, 107).trim());
                tmpRestaurant.setCap(Integer.parseInt(restaurantLine.substring(108, 112).trim()));
                tmpRestaurant.setTelephoneNumber(restaurantLine.substring(113, 122).trim());
                tmpRestaurant.setWebSite(restaurantLine.substring(123, 222).trim());
                tmpRestaurant.setRestaurantType(restaurantLine.substring(223, 230).trim());
               
                tmpRestaurantList.add(tmpRestaurant);
                
                restaurantLine = eatAdvisorBR.readLine();
                eatAdvisor.close();
            }
        return tmpRestaurantList;
        }
	
	public void RestaurantWriteToFile(Ristorante restaurant) throws IOException {
		File eatAdvisor = new File("eatAdvisor.txt");
            if(eatAdvisor.exists()){
                FileOutputStream restaurantFOP = new FileOutputStream("eatAdvisor.txt",true);
		PrintWriter restaurantWriter = new PrintWriter(restaurantFOP);
		restaurantWriter.println(restaurant.getRestaurantName()  + " - " + restaurant.getAddress() + " - " + restaurant.getBuildingNumber() + " - " + restaurant.getCity() + " - " + restaurant.getProvince() + " - " + restaurant.getCap() + " - " + restaurant.getTelephoneNumber() + " - " + restaurant.getWebSite() + " - " + restaurant.getRestaurantType());
		restaurantWriter.close();
            }else if(eatAdvisor.createNewFile()){
		PrintWriter restaurantWriter = new PrintWriter(eatAdvisor);
		restaurantWriter.println(restaurant.getRestaurantName()  + " - " + restaurant.getAddress() + " - " + restaurant.getBuildingNumber() + " - " + restaurant.getCity() + " - " + restaurant.getProvince() + " - " + restaurant.getCap() + " - " + restaurant.getTelephoneNumber() + " - " + restaurant.getWebSite() + " - " + restaurant.getRestaurantType());
		restaurantWriter.close();
            }
		
	}
       
}
    

