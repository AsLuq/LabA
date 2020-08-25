package clienti;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luqmanasghar
 */
public class Parser {

    public Parser() {}    
    
    // <editor-fold desc="methods">
    
    /**
     * Read the specified clients files from the given path
     * 
     * @author luqmanasghar
     * @param path path of the file
     * @return list of clients
     */
    public List<Cliente> readFromFile(String path) throws Exception
    {
        File file = new File(path);        
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(file);
        List<Cliente> listCli = new ArrayList<>();
        
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          cliente.setName(line.substring(0, 29).trim());
          cliente.setSurname(line.substring(29, 59).trim());
          cliente.setCity(line.substring(59, 99).trim());
          cliente.setProvince(line.substring(99, 102).trim());
          cliente.setMail(line.substring(102, 134).trim());
          cliente.setNickName(line.substring(134, 155).trim());
          cliente.setPassword(line.substring(155, 170).trim());
          
          listCli.add(cliente);
        }
        scanner.close();
        
        return listCli;
    } 
                
    // </editor-fold>
    
}
