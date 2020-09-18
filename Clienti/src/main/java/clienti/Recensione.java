package clienti;

public class Recensione {

    // <editor-fold desc="Attributes">
    private int clientID;
    private int restaurantID;
    private int stars;
    private String recensione;

    static final int LENGTH_RESTAURANTREVIEWS = 256;
    static final int LENGTH_RESTAURANTID = 3;
    static final int LENGTH_CLIENTID = 3;
    static final int LENGTH_STARS = 1;
    //</editor-fold>

    public Recensione() {

    }

    public Recensione(int clientID, int restaurantID, int stars, String recensione) {
        super();
        this.clientID = clientID;
        this.restaurantID = restaurantID;
        this.stars = stars;
        this.recensione = recensione;
    }

    //<editor-fold desc="Getters&Setters">
    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getRecensione() {
        return recensione;
    }

    public void setRecensione(String recensione) {
        this.recensione = recensione;
    }
    //</editor-fold>
}
