/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ristoratori.Ristorante;

/**
 *
 * @author AndreaBaz
 */
public class Sorts {
    
    /**
     * Empty constructor
     */
    public Sorts()
    {
    }
    
    /**
     * Filters the Restaurant list by City name and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l
     * @param city
     * @return
     */
    public static ArrayList<String> findByCity(List<Ristorante> l, String city)
    {
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l)
        {
            if (r.getCity().equals(city)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
    }
    
    /**
     * Filters the Restaurant list by Type and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l
     * @param type
     * @return
     */
    public static ArrayList<String> findByType(List<Ristorante> l, String type) {
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantType().equals(type)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
    }
    
    /**
     * Filters the Restaurant list by Name and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l
     * @param name
     * @return
     */
    public static ArrayList<String> findByName(List<Ristorante> l, String name)
    {
        //questo metodo si può implementare anche con le wildcard verificando almeno le prime 3 lettere
        /* NOT WORKING
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantName().matches(name.substring(0, 2).concat("*"))) {
                listaNomiR.add(r.getRestaurantName());
            }
        }*/
        
        //WORKS
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantName().equals(name)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
    }
    
    /**
     * Filters the Restaurant list by City and Type and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l
     * @param city
     * @param type
     * @return
     */
    public static ArrayList<String> findByCityAndType(List<Ristorante> l, String city, String type)
    {
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getCity().equals(city) && r.getRestaurantType().equals(type)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
    }
}