package ristoratori;

/**
 *
 * @author crist
 */

public class Ristoratori {
    public static void main(String args[]) throws Exception{
         
        String path = "C:\\Users\\crist\\Desktop\\text file.txt"; 
        Parser parser = new Parser();
        parser.RestaurantReadFromFile(path);
    }
}
