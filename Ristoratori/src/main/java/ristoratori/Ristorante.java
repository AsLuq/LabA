package ristoratori;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 * @author Andrea Basilico
 */
// 
public class Ristorante {

    // <editor-fold desc="Attributes">
    private String restaurantName;
    private String address;
    private String buildingNumber;
    private String city;
    private String province;
    private String cap;
    private String telephoneNumber;
    private String webSite;
    private String restaurantType;
    private int restaurantID;

    static final int LENGTH_RESTAURANTNAME = 30;
    static final int LENGHT_ADDRESS = 30;
    static final int LENGTH_BUILDINGNUMBER = 5;
    static final int LENGTH_CITY = 40;
    static final int LENGTH_PROVINCE = 3;
    static final int LENGTH_CAP = 6;
    static final int LENGTH_TELEPHONENUMBER = 10;
    static final int LENGTH_WEBSITE = 100;
    static final int LENGTH_RESTAURANTTYPE = 8;
    static final int LENGTH_RESTAURANT_ID = 3;

    //</editor-fold>
    
    public Ristorante() {

    }

    public Ristorante(String restaurantName, String adress, String buildingNumber, String city, String province, String cap, String telephoneNumber, String webSite, String restaurantType) {
        this.restaurantName = restaurantName;
        this.address = adress;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.province = province;
        this.cap = cap;
        this.telephoneNumber = telephoneNumber;
        this.webSite = webSite;
        this.restaurantType = restaurantType;
    }

    //<editor-fold desc="Getters&Setters">
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

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
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

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }
    //</editor-fold>

}
