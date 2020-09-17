package clienti;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ristoratori.Ristorante;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ristoratori.RestaurantParser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RecensioniGUI extends JFrame {

    // Variables declaration - do not modify   
    public JPanel contentPane;
    static RecensioniGUI frame;
    protected Ristorante ristorante = null;
    protected Boolean logged = false;
    private JTable table;

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new RecensioniGUI(new Ristorante(), false);
                    frame.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    /**
     * Create the frame.
     * @param tmpRist
     * @param logged
     * @throws java.io.IOException
     */
    public RecensioniGUI(Ristorante tmpRist, Boolean logged) throws IOException, Exception {
        this.ristorante = tmpRist;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 630, 735);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblRestaurantName = new JLabel("Restaurant name: ");
        lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRestaurantName.setBounds(10, 11, 125, 25);
        contentPane.add(lblRestaurantName);

        JLabel lblAddress = new JLabel("Address: ");
        lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAddress.setBounds(10, 45, 125, 25);
        contentPane.add(lblAddress);

        JLabel lblCity = new JLabel("City");
        lblCity.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblCity.setBounds(10, 81, 125, 25);
        contentPane.add(lblCity);

        JLabel lblProvince = new JLabel("Province: ");
        lblProvince.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblProvince.setBounds(10, 117, 125, 25);
        contentPane.add(lblProvince);

        JLabel lblPostalCode = new JLabel("Postal Code: ");
        lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPostalCode.setBounds(10, 153, 125, 25);
        contentPane.add(lblPostalCode);

        JLabel lblTelephoneNumber = new JLabel("Telephone Number");
        lblTelephoneNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblTelephoneNumber.setBounds(10, 189, 125, 25);
        contentPane.add(lblTelephoneNumber);

        JLabel lblWebsite = new JLabel("Website: ");
        lblWebsite.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblWebsite.setBounds(10, 225, 125, 25);
        contentPane.add(lblWebsite);

        JLabel lblRestaurantType = new JLabel("Restaurant Type: ");
        lblRestaurantType.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRestaurantType.setBounds(10, 261, 125, 25);
        contentPane.add(lblRestaurantType);

        JLabel lblGetRestName = new JLabel(ristorante.getRestaurantName());
        lblGetRestName.setBounds(145, 12, 150, 25);
        contentPane.add(lblGetRestName);

        JLabel lblGetAddress = new JLabel(ristorante.getAddress());
        lblGetAddress.setBounds(145, 46, 150, 25);
        contentPane.add(lblGetAddress);

        JLabel lblGetCity = new JLabel(ristorante.getCity());
        lblGetCity.setBounds(145, 81, 150, 25);
        contentPane.add(lblGetCity);

        JLabel lblGetProvince = new JLabel(ristorante.getProvince());
        lblGetProvince.setBounds(145, 117, 150, 25);
        contentPane.add(lblGetProvince);

        JLabel lblGetPostalcode = new JLabel(ristorante.getCap());
        lblGetPostalcode.setBounds(145, 153, 150, 25);
        contentPane.add(lblGetPostalcode);

        JLabel lblGetTelepNumb = new JLabel(ristorante.getTelephoneNumber());
        lblGetTelepNumb.setBounds(145, 189, 150, 25);
        contentPane.add(lblGetTelepNumb);

        JLabel lblgetWebSite = new JLabel(ristorante.getWebSite());
        lblgetWebSite.setBounds(145, 225, 425, 25);
        contentPane.add(lblgetWebSite);

        JLabel lblgetRestType = new JLabel(ristorante.getRestaurantType());
        lblgetRestType.setBounds(145, 261, 150, 25);
        contentPane.add(lblgetRestType);

        JLabel lbl1Star = new JLabel("1 Star Reviews: ");
        lbl1Star.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl1Star.setBounds(400, 17, 125, 25);
        contentPane.add(lbl1Star);

        JLabel lbl2Stars = new JLabel("2 Stars Reviews: ");
        lbl2Stars.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl2Stars.setBounds(400, 51, 125, 25);
        contentPane.add(lbl2Stars);

        JLabel lbl3Stars = new JLabel("3 Stars Reviews: ");
        lbl3Stars.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl3Stars.setBounds(400, 87, 125, 25);
        contentPane.add(lbl3Stars);

        JLabel lbl4Stars = new JLabel("4 Stars Reviews: ");
        lbl4Stars.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl4Stars.setBounds(400, 123, 125, 25);
        contentPane.add(lbl4Stars);

        JLabel lbl5Stars = new JLabel("5 Stars Reviews: ");
        lbl5Stars.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl5Stars.setBounds(400, 159, 125, 25);
        contentPane.add(lbl5Stars);

        JLabel lblCont1Star = new JLabel("");
        lblCont1Star.setBounds(535, 18, 60, 25);
        contentPane.add(lblCont1Star);

        JLabel lblCont2Stars = new JLabel("");
        lblCont2Stars.setBounds(535, 51, 60, 25);
        contentPane.add(lblCont2Stars);

        JLabel lblCont3Stars = new JLabel("");
        lblCont3Stars.setBounds(535, 87, 60, 25);
        contentPane.add(lblCont3Stars);

        JLabel lblCont4Stars = new JLabel("");
        lblCont4Stars.setBounds(535, 123, 60, 25);
        contentPane.add(lblCont4Stars);

        JLabel lblCont5Stars = new JLabel("");
        lblCont5Stars.setBounds(535, 159, 60, 25);
        contentPane.add(lblCont5Stars);

        table = new JTable();
        table.setBounds(10, 297, 594, 254);
        contentPane.add(table);

        JLabel lblRecensione = new JLabel("Recensione Completa:");
        lblRecensione.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRecensione.setBounds(10, 562, 150, 25);
        contentPane.add(lblRecensione);

        JLabel lblSelectedReview = new JLabel("");
        lblSelectedReview.setBounds(10, 588, 594, 73);
        contentPane.add(lblSelectedReview);

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"Customer Name", "Stars", "Reviews"}
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        /*
		 * It will open the AddReviewGUI for the registered client.
		 * 
         */
        if (logged) {
            JButton btnNewButton = new JButton("Add Review");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    AddReviewGUI tmpAdd = new AddReviewGUI();
                    tmpAdd.show();
                    frame.setVisible(false);

                }
            });
            btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
            btnNewButton.setBounds(365, 297, 200, 25);
            contentPane.add(btnNewButton);
        }

    }

    public void populateJTable() {
        try {
            Parser p = new Parser();
            RestaurantParser rp = new RestaurantParser();

            List<Recensione> reviewList = p.readRecensioniFromFile();
            List<Cliente> listCli = p.readFromFile();
            List<Ristorante> restaurantList = rp.ReadFromFile();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] rowData = new Object[3];
            for (Recensione rec : reviewList) {
                for (Cliente cliente : listCli) {
                    if (cliente.getId() == rec.getClientID()) {
                        rowData[0] = cliente.getNickName();
                        break;
                    }
                }
                rowData[1] = rec.getStars();
                rowData[2] = rec.getRecensione();

                model.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(RecensioniGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
