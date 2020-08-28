package clienti;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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

    public static String path = "/Users/luqmanasghar/Desktop/text file";

    // <editor-fold desc="methods">
    /**
     * Read the specified clients files from the given path
     *
     * @author luqmanasghar
     * @return list of clients
     */
    public List<Cliente> readFromFile() throws Exception {
        File file = new File("filename.txt");
        Scanner scanner = new Scanner(file);
        List<Cliente> listCli = new ArrayList<>();

        if (file.exists()) {
            while (scanner.hasNextLine()) {
                Cliente cliente = new Cliente();
                String line = scanner.nextLine();
                cliente.setName(line.substring(0, 30).trim());
                cliente.setSurname(line.substring(30, 60).trim());
                cliente.setCity(line.substring(60, 100).trim());
                cliente.setProvince(line.substring(100, 103).trim());
                cliente.setMail(line.substring(103, 135).trim());
                cliente.setNickName(line.substring(135, 161).trim());
                cliente.setPassword(line.substring(161, 178).trim());

                listCli.add(cliente);
            }
        } else {
            file.createNewFile();
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
    public void UpdateFile(Cliente cliente) throws FileNotFoundException, IOException {
        try {
            File file = new File("filename.txt");
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
     */
    public void writeToFile(File file, Cliente cliente) {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write("\n");
            writer.write(calcStringLength(cliente.getName(), Cliente.LENGTH_NAME));
            writer.write(calcStringLength(cliente.getSurname(), Cliente.LENGTH_SURNAME));
            writer.write(calcStringLength(cliente.getCity(), Cliente.LENGTH_CITY));
            writer.write(calcStringLength(cliente.getProvince(), Cliente.LENGTH_PROVINCE));
            writer.write(calcStringLength(cliente.getMail(), Cliente.LENGTH_MAIL));
            writer.write(calcStringLength(cliente.getNickName(), Cliente.LENGTH_NICKNAME));
            writer.write(calcStringLength(cliente.getPassword(), Cliente.LENGTH_PASSWORD));
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/
            }
        }
    }
    // </editor-fold>
}
