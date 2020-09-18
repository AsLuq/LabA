/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import ristoratori.RestaurantParser;
import ristoratori.Ristorante;

/**
 *
 * @author Luqman Asghar
 */

public class ListRistoratori extends javax.swing.JFrame {

    private Cliente cli;
    private List<Ristorante> listCli;

    /**
     * Creates new form ListClients for guests
     *
     * @throws java.lang.Exception
     */
    public ListRistoratori() throws Exception {
        initComponents();
        jTable1.getTableHeader().setBackground(Color.LIGHT_GRAY);
        populateJTable();
        jLabelUenteLoggato.setText("Accesso Libero");

        ListSelectionModel model = jTable1.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!model.getValueIsAdjusting()) {

                    Ristorante tmpRist = new Ristorante();

                    tmpRist.setRestaurantID((int)jTable1.getValueAt(model.getMinSelectionIndex(), 0));
                    tmpRist.setRestaurantName((String) jTable1.getValueAt(model.getMinSelectionIndex(), 1));
                    tmpRist.setAddress((String) jTable1.getValueAt(model.getMinSelectionIndex(), 2));
                    tmpRist.setCity((String) jTable1.getValueAt(model.getMinSelectionIndex(), 3));
                    tmpRist.setCap((String) jTable1.getValueAt(model.getMinSelectionIndex(), 4));
                    tmpRist.setProvince((String) jTable1.getValueAt(model.getMinSelectionIndex(), 5));
                    tmpRist.setTelephoneNumber((String) jTable1.getValueAt(model.getMinSelectionIndex(), 6));
                    tmpRist.setWebSite((String) jTable1.getValueAt(model.getMinSelectionIndex(), 7));
                    tmpRist.setRestaurantType((String) jTable1.getValueAt(model.getMinSelectionIndex(), 8));

                    RecensioniGUI tmp = null;
                    try {
                        tmp = new RecensioniGUI(tmpRist, false);
                    } catch (Exception ex) {
                        Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    tmp.setLocationRelativeTo(null);
                    tmp.setVisible(true);

                }
            }
        });
    }
    
    /**
     * Creates new form ListClients for logged client
     * @param cli logged client
     * @throws Exception 
     */
    public ListRistoratori(Cliente cli) throws Exception {
        this.cli = cli;
        initComponents();
        jTable1.getTableHeader().setBackground(Color.LIGHT_GRAY);
        populateJTable();
        jLabelClientName.setText(cli.getName() + " " + cli.getSurname());

        ListSelectionModel model = jTable1.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!model.getValueIsAdjusting()) {

                    Ristorante tmpRist = new Ristorante();

                    tmpRist.setRestaurantID((int)jTable1.getValueAt(model.getMinSelectionIndex(), 0));
                    tmpRist.setRestaurantName((String) jTable1.getValueAt(model.getMinSelectionIndex(), 1));
                    tmpRist.setAddress((String) jTable1.getValueAt(model.getMinSelectionIndex(), 2));
                    tmpRist.setCity((String) jTable1.getValueAt(model.getMinSelectionIndex(), 3));
                    tmpRist.setCap((String) jTable1.getValueAt(model.getMinSelectionIndex(), 4));
                    tmpRist.setProvince((String) jTable1.getValueAt(model.getMinSelectionIndex(), 5));
                    tmpRist.setTelephoneNumber((String) jTable1.getValueAt(model.getMinSelectionIndex(), 6));
                    tmpRist.setWebSite((String) jTable1.getValueAt(model.getMinSelectionIndex(), 7));
                    tmpRist.setRestaurantType((String) jTable1.getValueAt(model.getMinSelectionIndex(), 8));

                    RecensioniGUI tmp = null;
                    try {
                        tmp = new RecensioniGUI(tmpRist, cli, true);
                    } catch (Exception ex) {
                        Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    tmp.setLocationRelativeTo(null);
                    tmp.setVisible(true);

                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClientName = new javax.swing.JLabel();
        jLabelUenteLoggato = new javax.swing.JLabel();
        javax.swing.JButton jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelComune = new javax.swing.JLabel();
        jTextFieldComune = new javax.swing.JTextField();
        jLabelTipologia = new javax.swing.JLabel();
        jTextFieldTipologia = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonClearFilter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabelFilter = new javax.swing.JLabel();
        jComboBoxFilter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUenteLoggato.setText("Utente Loggato: ");
        jLabelUenteLoggato.setToolTipText("");

        jButtonBack.setText("Back");
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUenteLoggato, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientName)
                    .addComponent(jLabelUenteLoggato))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelNome.setText("Nome");

        jLabelComune.setText("Comune");

        jLabelTipologia.setText("Tipologia");

        jButtonSearch.setText("Search");
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
        });

        jButtonClearFilter.setText("Clear Filter");
        jButtonClearFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearFilterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addComponent(jButtonClearFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelComune, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTipologia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTipologia))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldComune)))))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComune)
                    .addComponent(jTextFieldComune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipologia)
                    .addComponent(jTextFieldTipologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jButtonClearFilter))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Indirizzo", "Città", "Cap", "Prov", "Numero", "Sito Web", "Tipologia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        jLabelFilter.setText("Filtra per");

        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comune", "Tipologia", "Nome", "Comune e Tipologia" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilter)
                    .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * applies the sorting filters
     * @param evt mmouse clicked event
     */
    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        try {
            RestaurantParser parser = new RestaurantParser();
            this.listCli = new ArrayList<>();
            try {
                listCli = parser.ReadFromFile();
            } catch (IOException ex) {
                Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch ((String) jComboBoxFilter.getSelectedItem()) {
                case "Comune":
                    listCli = Sorts.findByCity(listCli, jTextFieldComune.getText());
                    refreshJTable();
                    break;
                case "Tipologia":
                    listCli = Sorts.findByType(listCli, jTextFieldTipologia.getText());
                    refreshJTable();
                    break;
                case "Nome":
                    listCli = Sorts.findByName(listCli, jTextFieldNome.getText());
                    refreshJTable();
                    break;
                case "Comune e Tipologia":
                    listCli = Sorts.findByCityAndType(listCli, jTextFieldComune.getText(), jTextFieldTipologia.getText());
                    refreshJTable();
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSearchMouseClicked

    /**
     * populate jTable
     *
     * @author luqmanasghar
     * @throws java.lang.Exception
     */
    public void populateJTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RestaurantParser parser = new RestaurantParser();
        listCli = parser.ReadFromFile();
        Object[] rowData = new Object[9];
        for (Ristorante rist : listCli) {            
            rowData[0] = rist.getRestaurantID();
            rowData[1] = rist.getRestaurantName();
            rowData[2] = rist.getAddress() + " " + rist.getBuildingNumber();
            rowData[3] = rist.getCity();
            rowData[4] = rist.getCap();
            rowData[5] = rist.getProvince();
            rowData[6] = rist.getTelephoneNumber();
            rowData[7] = rist.getWebSite();
            rowData[8] = rist.getRestaurantType();
            model.addRow(rowData);
        }
    }

    /**
     * refresh jtable
     *
     * @author Basilico Andrea
     * @throws java.lang.Exception
     */
    public void refreshJTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Object[] rowData = new Object[9];
        for (Ristorante rist : listCli) {
            rowData[0] = rist.getRestaurantID();
            rowData[1] = rist.getRestaurantName();
            rowData[2] = rist.getAddress() + " " + rist.getBuildingNumber();
            rowData[3] = rist.getCity();
            rowData[4] = rist.getCap();
            rowData[5] = rist.getProvince();
            rowData[6] = rist.getTelephoneNumber();
            rowData[7] = rist.getWebSite();
            rowData[8] = rist.getRestaurantType();

            model.addRow(rowData);
        }
    }

    /**
     * Clear sorting filters
     *
     * @param evt mouse click event
     * @author Luqman Asghar
     */
    private void jButtonClearFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearFilterMouseClicked
        jTextFieldNome.setText("");
        jTextFieldComune.setText("");
        jTextFieldTipologia.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            populateJTable();
        } catch (Exception ex) {
            Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonClearFilterMouseClicked

    /**
     * returns to loginFrame
     * @param evt mouse click event
     */
    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        try {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
            
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListRistoratori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListRistoratori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListRistoratori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListRistoratori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListRistoratori().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ListRistoratori.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClearFilter;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JLabel jLabelClientName;
    private javax.swing.JLabel jLabelComune;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTipologia;
    private javax.swing.JLabel jLabelUenteLoggato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldComune;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipologia;
    // End of variables declaration//GEN-END:variables
}
