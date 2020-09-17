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

/**
 *
 * @author luqmanasghar
 */
public class Parser {

    public Parser() {
    }

    public static String path = new File(System.getProperty("user.dir")).getParentFile().getPath() + File.separator + "FileDati" + File.separator + "Utenti.dati";

    // <editor-fold desc="methods">
    /**
     * Read the specified clients files from the given path
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
     * Aggiorno il file dei cliente con i dati del nuovo cliente
     *
     * @author luqmanasghar
     * @param cliente
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void UpdateFile(Cliente cliente) throws FileNotFoundException, IOException, Exception {
        try {
            File file = new File(path);
            if (file.exists()) {
                writeToFile(file, cliente);
            } else {
                file.createNewFile();
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
            if(listCli.size() > 0)
                lastCliId = listCli.get(listCli.size() - 1).getId();
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write("\n");
            writer.write(calcStringLength(cliente.getName(), Cliente.LENGTH_NAME));
            writer.write(calcStringLength(cliente.getSurname(), Cliente.LENGTH_SURNAME));
            writer.write(calcStringLength(cliente.getCity(), Cliente.LENGTH_CITY));
            writer.write(calcStringLength(cliente.getProvince(), Cliente.LENGTH_PROVINCE));
            writer.write(calcStringLength(cliente.getMail(), Cliente.LENGTH_MAIL));
            writer.write(calcStringLength(cliente.getNickName(), Cliente.LENGTH_NICKNAME));
            writer.write(calcStringLength(cliente.getPassword(), Cliente.LENGTH_PASSWORD));
            writer.write(calcStringLength(Integer.toString(lastCliId + 1), Cliente.LENGTH_ID));
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {/*ignore*/
            }
        }
    }
    // </editor-fold>
}
