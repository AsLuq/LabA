package ristoratori;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.awt.event.ActionEvent;

public class RestaurantGUI extends JFrame {
// <editor-fold desc="Attributes">

    private final JPanel contentPane;
    private JTextField textFieldRestName;
    private JTextField textFieldAddress;
    private JTextField textFieldBuildNumb;
    private JTextField textFieldCity;
    private JTextField textFieldProvince;
    private JTextField textFieldPostalCode;
    private JTextField textFieldTelephNumb;
    private JTextField textFieldWebsite;
//</editor-fold>

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RestaurantGUI frame = new RestaurantGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    
    public RestaurantGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblRestName = new JLabel("Nome del Ristorante: ");
        lblRestName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRestName.setBounds(51, 46, 150, 25);
        contentPane.add(lblRestName);

        JLabel lblAdress = new JLabel("Indirizzo: ");
        lblAdress.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAdress.setBounds(51, 82, 150, 25);
        contentPane.add(lblAdress);

        JLabel lblBuildNumb = new JLabel("Numero Civico: ");
        lblBuildNumb.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblBuildNumb.setBounds(51, 118, 150, 25);
        contentPane.add(lblBuildNumb);

        JLabel lblCity = new JLabel("Città: ");
        lblCity.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblCity.setBounds(51, 154, 150, 25);
        contentPane.add(lblCity);

        JLabel lblProvince = new JLabel("Provincia: ");
        lblProvince.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblProvince.setBounds(51, 190, 150, 25);
        contentPane.add(lblProvince);

        JLabel lblPostalCode = new JLabel("Cap: ");
        lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPostalCode.setBounds(51, 226, 150, 25);
        contentPane.add(lblPostalCode);

        JLabel lblTelephNumb = new JLabel("Recapito telefonico: ");
        lblTelephNumb.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblTelephNumb.setBounds(51, 262, 150, 25);
        contentPane.add(lblTelephNumb);

        JLabel lblWebsite = new JLabel("Sito web: ");
        lblWebsite.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblWebsite.setBounds(51, 298, 150, 25);
        contentPane.add(lblWebsite);

        JLabel lblRestType = new JLabel("Tipologia: ");
        lblRestType.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRestType.setBounds(51, 336, 150, 25);
        contentPane.add(lblRestType);

        JLabel lblMissedGap = new JLabel("You missed something!");
        lblMissedGap.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMissedGap.setBounds(211, 417, 150, 25);
        lblMissedGap.setVisible(false);
        contentPane.add(lblMissedGap);

        textFieldRestName = new JTextField();
        textFieldRestName.setDocument(new RestaurantJTextFieldLimit(30));
        textFieldRestName.setBounds(211, 49, 150, 20);
        contentPane.add(textFieldRestName);
        textFieldRestName.setColumns(10);

        textFieldAddress = new JTextField();
        textFieldAddress.setDocument(new RestaurantJTextFieldLimit(30));
        textFieldAddress.setColumns(10);
        textFieldAddress.setBounds(211, 85, 150, 20);
        contentPane.add(textFieldAddress);

        textFieldBuildNumb = new JTextField();
        textFieldBuildNumb.setDocument(new RestaurantJTextFieldLimit(5));
        textFieldBuildNumb.setColumns(10);
        textFieldBuildNumb.setBounds(211, 121, 150, 20);
        contentPane.add(textFieldBuildNumb);

        textFieldCity = new JTextField();
        textFieldCity.setDocument(new RestaurantJTextFieldLimit(40));
        textFieldCity.setColumns(10);
        textFieldCity.setBounds(211, 157, 150, 20);
        contentPane.add(textFieldCity);

        textFieldProvince = new JTextField();
        textFieldProvince.setDocument(new RestaurantJTextFieldLimit(3));
        textFieldProvince.setColumns(10);
        textFieldProvince.setBounds(211, 193, 150, 20);
        contentPane.add(textFieldProvince);

        textFieldPostalCode = new JTextField();
        textFieldPostalCode.setDocument(new RestaurantJTextFieldLimit(5));
        textFieldPostalCode.setColumns(10);
        textFieldPostalCode.setBounds(211, 229, 150, 20);
        contentPane.add(textFieldPostalCode);

        textFieldTelephNumb = new JTextField();
        textFieldTelephNumb.setDocument(new RestaurantJTextFieldLimit(10));
        textFieldTelephNumb.setColumns(10);
        textFieldTelephNumb.setBounds(211, 265, 150, 20);
        contentPane.add(textFieldTelephNumb);

        textFieldWebsite = new JTextField();
        textFieldWebsite.setDocument(new RestaurantJTextFieldLimit(100));
        textFieldWebsite.setColumns(10);
        textFieldWebsite.setBounds(211, 301, 150, 20);
        contentPane.add(textFieldWebsite);

        String[] RestaurantTypes = {"Seleziona un opzione: ", "Italian", "Etnic", "Fusion"};

        JComboBox comboRestaurant = new JComboBox(RestaurantTypes);
        comboRestaurant.setBounds(211, 338, 150, 22);
        contentPane.add(comboRestaurant);

        /**
         * to add the restaurant checks if all the textField are populated and even that the comboBox isn't selected
         */
        JButton btnAddRest = new JButton("Add Restaurant");
        btnAddRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emptyString = "";

                if (!textFieldRestName.getText().equals(emptyString) || !textFieldAddress.getText().equals(emptyString)
                        || !textFieldBuildNumb.getText().equals(emptyString) || !textFieldCity.getText().equals(emptyString)
                        || !textFieldProvince.getText().equals(emptyString) || !textFieldPostalCode.getText().equals(emptyString)
                        || !textFieldTelephNumb.getText().equals(emptyString) || !textFieldWebsite.getText().equals(emptyString)
                        || !comboRestaurant.getSelectedItem().equals("Seleziona un opzione: ")) {

                    Ristorante tmpRestaurant = new Ristorante();

                    tmpRestaurant.setRestaurantName(textFieldRestName.getText());
                    tmpRestaurant.setAddress(textFieldAddress.getText());
                    tmpRestaurant.setBuildingNumber(textFieldBuildNumb.getText());
                    tmpRestaurant.setCity(textFieldCity.getText());
                    tmpRestaurant.setProvince(textFieldProvince.getText());
                    tmpRestaurant.setCap((textFieldPostalCode.getText()));
                    tmpRestaurant.setTelephoneNumber(textFieldTelephNumb.getText());
                    tmpRestaurant.setWebSite(textFieldWebsite.getText());
                    tmpRestaurant.setRestaurantType(String.valueOf(comboRestaurant.getSelectedItem()));

                    RestaurantParser tmpEatAdvisorParser = new RestaurantParser();

                    textFieldRestName.setText("");
                    textFieldAddress.setText("");
                    textFieldBuildNumb.setText("");
                    textFieldCity.setText("");
                    textFieldProvince.setText("");
                    textFieldPostalCode.setText("");
                    textFieldTelephNumb.setText("");
                    textFieldWebsite.setText("");
                    comboRestaurant.setSelectedIndex(0);

                    try {
                        tmpEatAdvisorParser.WriteToFile(tmpRestaurant);
                    } catch (IOException e1) {

                    }

                } else {
                    lblMissedGap.setVisible(true);
                }

            }
        });

        btnAddRest.setBounds(211, 381, 150, 25);
        contentPane.add(btnAddRest);

    }
}
