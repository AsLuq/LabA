package ristoratori;

/**
 *
 * @author crist
 */

public class Ristoratori {
    public static void main(String args[]) throws Exception{
         
        String path = "C:\\Users\\crist\\Desktop\\text file.txt"; 
        RestaurantParser parser = new RestaurantParser();
        parser.RestaurantReadFromFile(path);
    }
}
