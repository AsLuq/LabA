package ristoratori;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */

// 

public class Ristorante {
    
    // <editor-fold desc = "Attributes">
	
	private String restaurantName;  
	private String address;          
	private String buildingNumber;     
	private String city;            
	private String province;        
	private int cap;                
	private String telephoneNumber;    
	private String webSite;         
	private String restaurantType;  
	
        static final int LENGTH_RESTAURANTNAME = 30;
	static final int LENGHT_ADDRESS = 30;
	static final int LENGTH_BUILDINGNUMBER = 5;
	static final int LENGTH_CITY = 40;
	static final int LENGTH_PROVINCE = 3;
	static final int LENGTH_CAP = 5;
	static final int LENGTH_TELEPHONENUMBER = 10;
	static final int LENGTH_WEBSITE = 100;
        
        //<editor-fold>
        
        /**
         * restaurantName     0 - 29
         * address             30 - 59
         * buildingNumbers    60 - 64
         * city               65 - 104
         * province           105 - 107
         * cap                108 - 112
         * telephoneNumber    113 - 122
         * webSite            123 - 222
         * restaurantType     223 - 230
         * 
         */
	// caratteri totali 180
        
        // <editor-fold desk = "Builders">
        
        public Ristorante(){
            
        }
        
       /*public Ristorante(String restaurant){
           
          restaurantName = restaurant.substring(0, 29);
            address = restaurant.substring(30, 59);
            buildingNumber = restaurant.substring(60,64);
            city = restaurant.substring(65,104);
            province = restaurant.substring(105, 107);
            cap = Integer.parseInt(restaurant.substring(108,112));
            telephoneNumber = restaurant.substring(113,122);
            webSite = restaurant.substring(123,222);
            restaurantType = restaurant.substring(223,230);
        }*/
	
        
        public Ristorante(String restaurantName, String adress, String buildingNumber, String city, String province, int cap, String telephoneNumber, String webSite, String restaurantType){
            this.restaurantName = restaurantName;
            this.address = adress;
            this.buildingNumber = buildingNumber;
            this.city= city;
            this.province = province;
            this.cap = cap;
            this.telephoneNumber = telephoneNumber;
            this.webSite = webSite;
            this.restaurantType = restaurantType;
        }

        // <editor-fold desc = "Getters&Setters">
        
        public String getRestaurantName() {
            return restaurantName;
        }

        public void setRestaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
        }
    
        public String getAddress() {
            return address;
        }

        public void setAddress(String adress) {
            this.address = adress;
        }

        public String getBuildingNumber() {
            return buildingNumber;
        }

        public void setBuildingNumber(String buildingNumber) {
            this.buildingNumber = buildingNumber;
        }
        
        public String getCity() {
            return city;
        }
	
        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }
    
        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }
        
        public String getTelephoneNumber() {
            return telephoneNumber;
        }
		
        public void setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }
        
        public String getWebSite() {
            return webSite;
        }

        public void setWebSite(String webSite) {
            this.webSite = webSite;
        }

        public String getRestaurantType() {
            return restaurantType;
        }

        public void setRestaurantType(String restaurantType) {
            this.restaurantType = restaurantType;
        }
	
        
        //<editor-fold desc = "Methods";
        
        public List<Ristorante> restaurantList(){
            List<Ristorante> RestaurantList = new ArrayList();
            
            return RestaurantList;
        }
        
        public void printRestaurant(){
            System.out.println(restaurantName + " " + address + " " + buildingNumber + " " + city + " " + province + " " + cap + " " + telephoneNumber + " " + webSite + " " + restaurantType );
        }
        
}
    

