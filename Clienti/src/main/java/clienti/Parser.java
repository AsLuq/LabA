package clienti;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luqmanasghar
 */
public class Parser {

    public Parser() {
    }

//    public static String path = ".." + File.separator + "data" + File.separator + "Utenti.dati";
//    public static String pathRecensioni = ".." + File.separator + "data" + File.separator + "Recensioni.dati";
    public static String path = new File(System.getProperty("user.dir")).getParentFile().getPath() + File.separator + "FileDati" + File.separator + "Utenti.dati";
    public static String pathRecensioni = new File(System.getProperty("user.dir")).getParentFile().getPath() + File.separator + "FileDati" + File.separator + "Recensioni.dati";
    private Boolean newFile = false;

    // <editor-fold desc="methods">
    /**
     * Read the clients files from the given path
     *
     * @author luqmanasghar
     * @return list of clients
     * @throws java.lang.Exception
     */
    public List<Cliente> readFromFile() throws Exception {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner scanner = new Scanner(file);
        List<Cliente> listCli = new ArrayList<>();
        int startChar, endChar;

        while (scanner.hasNextLine()) {
            Cliente cliente = new Cliente();
            String line = scanner.nextLine();

            endChar = Cliente.LENGTH_NAME;
            startChar = 0;
            cliente.setName(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME;
            cliente.setSurname(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY;
            cliente.setCity(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE;
            cliente.setProvince(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL;
            cliente.setMail(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL + Cliente.LENGTH_NICKNAME;
            cliente.setNickName(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL + Cliente.LENGTH_NICKNAME;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL + Cliente.LENGTH_NICKNAME + Cliente.LENGTH_PASSWORD;
            cliente.setPassword(line.substring(startChar, endChar).trim());

            startChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL + Cliente.LENGTH_NICKNAME + Cliente.LENGTH_PASSWORD;
            endChar = Cliente.LENGTH_NAME + Cliente.LENGTH_SURNAME + Cliente.LENGTH_CITY + Cliente.LENGTH_PROVINCE + Cliente.LENGTH_MAIL + Cliente.LENGTH_NICKNAME + Cliente.LENGTH_PASSWORD + Cliente.LENGTH_ID;
            cliente.setId(Integer.parseInt(line.substring(startChar, endChar).trim()));

            listCli.add(cliente);
        }
        scanner.close();

        return listCli;
    }

    /**
     * Updates the utenti.dati file with new Client
     *
     * @author luqman asghar
     * @param cliente client to add
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void UpdateFile(Cliente cliente) throws FileNotFoundException, IOException, Exception {
        try {
            File file = new File(path);
            if (file.exists()) {
                newFile = false;
                writeToFile(file, cliente);
            } else {
                file.createNewFile();
                newFile = true;
                writeToFile(file, cliente);
            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Checks if the given work matches the length need, otherwise id adds blank
     * space
     *
     * @param word Word to analise
     * @param lengthToCheck length needed
     * @return word with the given length
     */
    public String calcStringLength(String word, int lengthToCheck) {

        String tmp = word;
        try {

            if (word.length() < lengthToCheck) {
                tmp = String.format("%-" + lengthToCheck + "s", tmp);
            }

        } catch (Exception ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    /**
     * Writes the client data on the file
     *
     * @author luqmanasghar
     * @param file
     * @param cliente client object
     * @throws java.io.IOException
     */
    public void writeToFile(File file, Cliente cliente) throws IOException, Exception {
        Writer writer = null;
        List<Cliente> listCli = null;
        int lastCliId = 0;
        try {
            listCli = readFromFile();
            if (listCli.size() > 0) {
                lastCliId = listCli.get(listCli.size() - 1).getId();
            }
            writer = new BufferedWriter(new FileWriter(file, true));
            if (!newFile) {
                writer.write("\n");
            }
            writer.write(calcStringLength(cliente.getName(), Cliente.LENGTH_NAME));
            writer.write(calcStringLength(cliente.getSurname(), Cliente.LENGTH_SURNAME));
            writer.write(calcStringLength(cliente.getCity(), Cliente.LENGTH_CITY));
            writer.write(calcStringLength(cliente.getProvince(), Cliente.LENGTH_PROVINCE));
            writer.write(calcStringLength(cliente.getMail(), Cliente.LENGTH_MAIL));
            writer.write(calcStringLength(cliente.getNickName(), Cliente.LENGTH_NICKNAME));
            writer.write(calcStringLength(cliente.getPassword(), Cliente.LENGTH_PASSWORD));
            writer.write(calcStringLength(Integer.toString(lastCliId + 1), Cliente.LENGTH_ID));
            JOptionPane.showMessageDialog(null, "Cliente aggiunto correttamente!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {/*ignore*/
            }
        }
    }

    /**
     * Updates the recensioni.dati file with new review
     *
     * @param recensione recensione to add
     * @throws IOException
     * @throws Exception
     */
    public void addRecensione(Recensione recensione) throws IOException, Exception {
        Writer writer = null;
        try {
            File file = new File(pathRecensioni);
            if (!file.exists()) {
                file.createNewFile();
                newFile = true;
            }
            writer = new BufferedWriter(new FileWriter(file, true));
            if (!newFile) {
                writer.write("\n");
            }
            writer.write(calcStringLength(Integer.toString(recensione.getClientID()), Recensione.LENGTH_CLIENTID));
            writer.write(calcStringLength(Integer.toString(recensione.getRestaurantID()), Recensione.LENGTH_RESTAURANTID));
            writer.write(calcStringLength(Integer.toString(recensione.getStars()), Recensione.LENGTH_STARS));
            writer.write(calcStringLength(recensione.getRecensione(), Recensione.LENGTH_RESTAURANTREVIEWS));
            JOptionPane.showMessageDialog(null, "Recensione aggiunta!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {/*ignore*/
            }
        }
    }

    /**
     * Read the review files from the given path
     *
     * @return @throws Exception
     */
    public List<Recensione> readRecensioniFromFile() throws Exception {
        File file = new File(pathRecensioni);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner scanner = new Scanner(file);
        List<Recensione> tmpList = new ArrayList<>();
        int startChar, endChar;

        while (scanner.hasNextLine()) {
            Recensione tmpRecensione = new Recensione();
            String line = scanner.nextLine();

            endChar = Recensione.LENGTH_CLIENTID;
            startChar = 0;
            tmpRecensione.setClientID(Integer.parseInt(line.substring(startChar, endChar).trim()));

            startChar = Recensione.LENGTH_CLIENTID;
            endChar = Recensione.LENGTH_CLIENTID + Recensione.LENGTH_RESTAURANTID;
            tmpRecensione.setRestaurantID(Integer.parseInt(line.substring(startChar, endChar).trim()));

            startChar = Recensione.LENGTH_CLIENTID + Recensione.LENGTH_RESTAURANTID;
            endChar = Recensione.LENGTH_CLIENTID + Recensione.LENGTH_RESTAURANTID + Recensione.LENGTH_STARS;
            tmpRecensione.setStars(Integer.parseInt(line.substring(startChar, endChar).trim()));

            startChar = Recensione.LENGTH_CLIENTID + Recensione.LENGTH_RESTAURANTID + Recensione.LENGTH_STARS;
            endChar = Recensione.LENGTH_CLIENTID + Recensione.LENGTH_RESTAURANTID + Recensione.LENGTH_STARS + Recensione.LENGTH_RESTAURANTREVIEWS;
            tmpRecensione.setRecensione(line.substring(startChar, endChar).trim());

            tmpList.add(tmpRecensione);
        }
        scanner.close();

        return tmpList;
    }
    // </editor-fold>
}
