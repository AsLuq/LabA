package ristoratori;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

/**
 *
 * @author crist
 */

public class Recensioni {
    
    // <editor-fold desc = "Attributes">
    
    private String RestaurantReviews;
    
    static final int LENGTH_RESTAURANTREVIEWS = 256 ;
    
    // <editor-fold desk = "Builders">
    
    public Recensioni(){
        
    }
    
    public Recensioni(String  RestaurantReviews){
        this.RestaurantReviews = RestaurantReviews;
    }
    
    // <editor-fold desc = "Getters&Setters">

    public String getRestaurantReviews() {
        return RestaurantReviews;
    }

    public void setRestaurantReviews(String RestaurantReviews) {
        this.RestaurantReviews = RestaurantReviews;
    }
    
    //<editor-fold desc = "Methods";
    
     public List<Recensioni> RestaurantReviewList (){
            List<Recensioni> RestaurantReviewList = new ArrayList();
            
            return RestaurantReviewList;
        }
        
        public void printRestaurantReview(){
            System.out.println(RestaurantReviews);
        }
        
}
