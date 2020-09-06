
package ristoratori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class RestaurantParser {
    
    
    public RestaurantParser(){
    }
    
    //<editor-fold desc = "Methods";
    
    public String calcStringLength(String word,int lengthToCheck){
        String tmpString = word;
        try{
            if(word.length() < lengthToCheck)
                tmpString = String.format("%-" + lengthToCheck + "s",tmpString);
        }catch(Exception ex){
            Logger.getLogger(RestaurantParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tmpString;
    }
   
    public List<Ristorante> RestaurantReadFromFile() throws FileNotFoundException, IOException{
        File file = new File("eatAdvisor.txt");
        Scanner scanner = new Scanner(file);
        List<Ristorante> tmpRestaurantList = new ArrayList<>();
        
        if (file.exists()) {
            while (scanner.hasNextLine()) {
            String tmpRestaurantLine =scanner.nextLine();
                    
            Ristorante tmpRestaurant = new Ristorante();
            tmpRestaurant.setRestaurantName(tmpRestaurantLine.substring(0,30).trim());
            tmpRestaurant.setAddress(tmpRestaurantLine.substring(30, 60).trim());
            tmpRestaurant.setBuildingNumber(tmpRestaurantLine.substring(60,65).trim());
            tmpRestaurant.setCity(tmpRestaurantLine.substring(65, 105).trim());
            tmpRestaurant.setProvince(tmpRestaurantLine.substring(105, 108).trim());
            tmpRestaurant.setCap(tmpRestaurantLine.substring(108,114).trim());
            tmpRestaurant.setTelephoneNumber(tmpRestaurantLine.substring(114,124).trim());
            tmpRestaurant.setWebSite(tmpRestaurantLine.substring(124,224).trim());
            tmpRestaurant.setRestaurantType(tmpRestaurantLine.substring(224,232).trim());
                           
            tmpRestaurantList.add(tmpRestaurant);
                
            }
        }
        scanner.close();
        return tmpRestaurantList;
    }

    public void RestaurantWriteToFile(Ristorante restaurant) throws IOException {
        File eatAdvisor = new File("eatAdvisor.txt");
        if(eatAdvisor.exists()){
            FileOutputStream restaurantFOP = new FileOutputStream("eatAdvisor.txt",true);
            PrintWriter restaurantWriter = new PrintWriter(restaurantFOP);
            restaurantWriter.write("\n");
            restaurantWriter.write(calcStringLength(restaurant.getRestaurantName(),Ristorante.LENGTH_RESTAURANTNAME));
            restaurantWriter.write(calcStringLength(restaurant.getAddress(),Ristorante.LENGHT_ADDRESS));
            restaurantWriter.write(calcStringLength(restaurant.getBuildingNumber(),Ristorante.LENGTH_BUILDINGNUMBER));
            restaurantWriter.write(calcStringLength(restaurant.getCity(),Ristorante.LENGTH_CITY));
            restaurantWriter.write(calcStringLength(restaurant.getProvince(),Ristorante.LENGTH_PROVINCE));
            restaurantWriter.write(calcStringLength(String.valueOf(restaurant.getCap()),Ristorante.LENGTH_CAP));
            restaurantWriter.write(calcStringLength(restaurant.getTelephoneNumber(),Ristorante.LENGTH_TELEPHONENUMBER));
            restaurantWriter.write(calcStringLength(restaurant.getWebSite(),Ristorante.LENGTH_WEBSITE));
            restaurantWriter.write(calcStringLength(restaurant.getRestaurantType(),Ristorante.LENGTH_RESTAURANTTYPE));
            
                
            restaurantWriter.close();
        }else if(eatAdvisor.createNewFile()){
            PrintWriter restaurantWriter = new PrintWriter(eatAdvisor);
              
            restaurantWriter.write(calcStringLength(restaurant.getRestaurantName(),Ristorante.LENGTH_RESTAURANTNAME));
            restaurantWriter.write(calcStringLength(restaurant.getAddress(),Ristorante.LENGHT_ADDRESS));
            restaurantWriter.write(calcStringLength(restaurant.getBuildingNumber(),Ristorante.LENGTH_BUILDINGNUMBER));
            restaurantWriter.write(calcStringLength(restaurant.getCity(),Ristorante.LENGTH_CITY));
            restaurantWriter.write(calcStringLength(restaurant.getProvince(),Ristorante.LENGTH_PROVINCE));
            restaurantWriter.write(calcStringLength(String.valueOf(restaurant.getCap()),Ristorante.LENGTH_CAP));
            restaurantWriter.write(calcStringLength(restaurant.getTelephoneNumber(),Ristorante.LENGTH_TELEPHONENUMBER));
            restaurantWriter.write(calcStringLength(restaurant.getWebSite(),Ristorante.LENGTH_WEBSITE));
            restaurantWriter.write(calcStringLength(restaurant.getRestaurantType(),Ristorante.LENGTH_RESTAURANTTYPE));
            
            restaurantWriter.close();
            }	
	}
}
    

