package clienti;

/**
 *
 * @author luqmanasghar
 */
public class Cliente {
    
    // <editor-fold desc="Attributes"> 
    private String name;
    private String surname;
    private String city;
    private String province;
    private String mail;
    private String nickName;
    private String password;    
    static final int LENGTH_NAME = 30;
    static final int LENGTH_SURNAME = 30;
    static final int LENGTH_CITY = 40;
    static final int LENGTH_PROVINCE = 3;
    static final int LENGTH_MAIL = 32;
    static final int LENGTH_NICKNAME = 26;
    static final int LENGTH_PASSWORD = 17;
    
    // </editor-fold>

    public Cliente(String name, String surname, String city, String province, String mail, String nickName, String password) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.province = province;
        this.mail = mail;
        this.nickName = nickName;
        this.password = password;
    }

    public Cliente() {}
    
    // <editor-fold desc="Getters & Setters"> 
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getMail() {
        return mail;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //</editor-fold>
    
    /*
    
        - name          0   -   29
        - surname       30  -   59
        - comune        60  -   99
        - provincia     100 -   102
        - mail          103 -   134
        - nickName      135 -   145
        - password      145 -   160
    
    */
    
    // <editor-fold desc="Methods"> 
    
    public void printCliente(){
        System.out.println(name + " " + surname + " " + city + " " + province + " " + nickName + " " + password);
    }
    
    // ricerca per comune
    
    // ricerca per tipologia
    
    // ricerca per nome
    
    // ricerca per comune e tipologia
    
    // seleziona ristorante (lettura dal file)
    
    // readInfo ristorazione
    
    
    
    // </editor-fold> 
}
