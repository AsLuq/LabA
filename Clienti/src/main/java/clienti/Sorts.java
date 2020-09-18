/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    //<editor-fold desc="Methods">
    /**
     * Filters the Restaurant list by City name and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l restaurant list
     * @param city city name
     * @return sorted list
     */
    public static ArrayList<Ristorante> findByCity(List<Ristorante> l, String city)
    {
        /*
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l)
        {
            if (r.getCity().equals(city)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
        */
        
        ArrayList<Ristorante> filteredList = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getCity().equals(city)) {
                filteredList.add(r);
            }
        }
        Collections.sort(filteredList, new Comparator<Ristorante>()
        {
            public int compare(Ristorante r1, Ristorante r2)
            {
                return Integer.valueOf(r1.getRestaurantName().compareTo(r2.getRestaurantName()));
            }
        });
        return filteredList;
    }
    
    /**
     * Filters the Restaurant list by Type and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l restaurant list
     * @param type restaurant type
     * @return sorted list
     */
    public static ArrayList<Ristorante> findByType(List<Ristorante> l, String type) {
        /*
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantType().equals(type)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
        */
        ArrayList<Ristorante> filteredList = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantType().equals(type)) {
                filteredList.add(r);
            }
        }
        Collections.sort(filteredList, new Comparator<Ristorante>() {
            public int compare(Ristorante r1, Ristorante r2) {
                return Integer.valueOf(r1.getRestaurantName().compareTo(r2.getRestaurantName()));
            }
        });
        return filteredList;
    }
    
    /**
     * Filters the Restaurant list by Name and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l restaurant list
     * @param name restaurant name
     * @return sorted list
     */
    public static ArrayList<Ristorante> findByName(List<Ristorante> l, String name)
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
        ArrayList<Ristorante> filteredList = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getRestaurantName().equals(name)) {
                filteredList.add(r);
            }
        }
        Collections.sort(filteredList, new Comparator<Ristorante>() {
            public int compare(Ristorante r1, Ristorante r2) {
                return Integer.valueOf(r1.getRestaurantName().compareTo(r2.getRestaurantName()));
            }
        });
        return filteredList;
    }
    
    /**
     * Filters the Restaurant list by City and Type and then
     * returns an ArrayList of Strings (restaurant names)
     * sorted in alphabetical order
     * 
     * @param l restaurant list
     * @param city  city name
     * @param type  restaurant type
     * @return sorted list
     */
    public static ArrayList<Ristorante> findByCityAndType(List<Ristorante> l, String city, String type)
    {
        /*
        ArrayList<String> listaNomiR = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getCity().equals(city) && r.getRestaurantType().equals(type)) {
                listaNomiR.add(r.getRestaurantName());
            }
        }
        Collections.sort(listaNomiR);
        return listaNomiR;
        */
        
        ArrayList<Ristorante> filteredList = new ArrayList<>();
        for (Ristorante r : l) {
            if (r.getCity().equals(city) && r.getRestaurantType().equals(type)) {
                filteredList.add(r);
            }
        }
        Collections.sort(filteredList, new Comparator<Ristorante>() {
            public int compare(Ristorante r1, Ristorante r2) {
                return Integer.valueOf(r1.getRestaurantName().compareTo(r2.getRestaurantName()));
            }
        });
        return filteredList;
    }
    //</editor-fold>
}
