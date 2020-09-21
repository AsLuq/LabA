package ristoratori;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 * @author Andrea Basilico
 */
public class RestaurantParser {

    public static String path = ".." + File.separator + "data" + File.separator + "eatAdvisor.dati";
//    public static String path = new File(System.getProperty("user.dir")).getParentFile().getPath() + File.separator + "FileDati" + File.separator + "eatAdvisor.dati";
    private int lastListID;
    private Boolean newFile = false;

    public RestaurantParser() {
    }

    //<editor-fold desc="Methods">;
    /**
     * Checks if the given word length is equals to given length,if it isn't it
     * will add the remeaning character with space
     *
     * @param word word to set to a specific length
     * @param lengthToCheck length to set
     * @return the word with the desidered length
     */
    public String calcStringLength(String word, int lengthToCheck) {
        String tmpString = word;
        try {
            if (word.length() < lengthToCheck) {
                tmpString = String.format("%-" + lengthToCheck + "s", tmpString);
            }
        } catch (Exception ex) {
            Logger.getLogger(RestaurantParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tmpString;
    }
    /**
     * Reads the eatAdvisor.dati file
     *
     * @return List of Ristorants
     * @throws FileNotFoundException
     * @throws IOException
     */
    public List<Ristorante> ReadFromFile() throws FileNotFoundException, IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner scanner = new Scanner(file);
        List<Ristorante> tmpRestaurantList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String tmpRestaurantLine = scanner.nextLine();

            Ristorante tmpRestaurant = new Ristorante();
            tmpRestaurant.setRestaurantName(tmpRestaurantLine.substring(0, 30).trim());
            tmpRestaurant.setAddress(tmpRestaurantLine.substring(30, 60).trim());
            tmpRestaurant.setBuildingNumber(tmpRestaurantLine.substring(60, 65).trim());
            tmpRestaurant.setCity(tmpRestaurantLine.substring(65, 105).trim());
            tmpRestaurant.setProvince(tmpRestaurantLine.substring(105, 108).trim());
            tmpRestaurant.setCap(tmpRestaurantLine.substring(108, 114).trim());
            tmpRestaurant.setTelephoneNumber(tmpRestaurantLine.substring(114, 124).trim());
            tmpRestaurant.setWebSite(tmpRestaurantLine.substring(124, 224).trim());
            tmpRestaurant.setRestaurantType(tmpRestaurantLine.substring(224, 232).trim());
            tmpRestaurant.setRestaurantID(Integer.parseInt(tmpRestaurantLine.substring(232, 235).trim()));

            tmpRestaurantList.add(tmpRestaurant);

        }

        scanner.close();
        return tmpRestaurantList;
    }
    
    /**
     * Updates the eatAdvisor.dati file with new Restaurants
     * @param restaurant restaurant to add
     * @throws IOException
     */
    public void WriteToFile(Ristorante restaurant) throws IOException {
        List<Ristorante> restaurantList = ReadFromFile();
        if (restaurantList.size() > 0) {
            lastListID = restaurantList.size();
        } else {
            lastListID = 0;
        }

        File eatAdvisor = new File(path);
        if (!eatAdvisor.exists()) {
            eatAdvisor.createNewFile();
            newFile = true;
        }

        FileOutputStream restaurantFOP = new FileOutputStream(eatAdvisor, true);
        PrintWriter restaurantWriter = new PrintWriter(restaurantFOP);
        if (!newFile) {
            restaurantWriter.write("\n");
        }
        restaurantWriter.write(calcStringLength(restaurant.getRestaurantName(), Ristorante.LENGTH_RESTAURANTNAME));
        restaurantWriter.write(calcStringLength(restaurant.getAddress(), Ristorante.LENGHT_ADDRESS));
        restaurantWriter.write(calcStringLength(restaurant.getBuildingNumber(), Ristorante.LENGTH_BUILDINGNUMBER));
        restaurantWriter.write(calcStringLength(restaurant.getCity(), Ristorante.LENGTH_CITY));
        restaurantWriter.write(calcStringLength(restaurant.getProvince(), Ristorante.LENGTH_PROVINCE));
        restaurantWriter.write(calcStringLength(String.valueOf(restaurant.getCap()), Ristorante.LENGTH_CAP));
        restaurantWriter.write(calcStringLength(restaurant.getTelephoneNumber(), Ristorante.LENGTH_TELEPHONENUMBER));
        restaurantWriter.write(calcStringLength(restaurant.getWebSite(), Ristorante.LENGTH_WEBSITE));
        restaurantWriter.write(calcStringLength(restaurant.getRestaurantType(), Ristorante.LENGTH_RESTAURANTTYPE));
        restaurantWriter.write(calcStringLength(Integer.toString(lastListID + 1), Ristorante.LENGTH_RESTAURANT_ID));

        restaurantWriter.close();
        JOptionPane.showMessageDialog (null, "Ristorante aggiunto correttamente!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    //</editor-fold>
}
