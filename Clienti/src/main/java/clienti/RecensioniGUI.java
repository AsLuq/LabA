/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;

import java.awt.Color;
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
 * @author crist
 */
public class RecensioniGUI extends javax.swing.JFrame {

    protected Ristorante rist = null;
    protected Boolean logged = false;

    /**
     * Creates new form RecensioniGUI
     *
     * @param tmpRec restaurant clicked from ListRistoratori
     * @param logged client logged
     * @throws java.lang.Exception
     */
    public RecensioniGUI(Ristorante tmpRec, Boolean logged) throws Exception {
        this.rist = tmpRec;
        this.logged = logged;
        initComponents();
        jTable1.getTableHeader().setBackground(Color.LIGHT_GRAY);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(550);
        populateJTable();

        Parser tmpParser = new Parser();
        List<Recensione> tmpListRece = tmpParser.readRecensioniFromFile();

        int contatore1S = 0;
        int contatore2S = 0;
        int contatore3S = 0;
        int contatore4S = 0;
        int contatore5S = 0;

        for (Recensione rece : tmpListRece) {
            if (rece.getStars() == 1) {
                contatore1S += 1;

            } else if (rece.getStars() == 2) {
                contatore2S += 1;

            } else if (rece.getStars() == 3) {
                contatore3S += 1;

            } else if (rece.getStars() == 4) {
                contatore4S += 1;

            } else if (rece.getStars() == 5) {
                contatore5S += 1;

            }
        }
        jLabelGet1Stars.setText(String.valueOf(contatore1S));
        jLabelGet2Stars.setText(String.valueOf(contatore2S));
        jLabelGet3Stars.setText(String.valueOf(contatore3S));
        jLabelGet4Stars.setText(String.valueOf(contatore4S));
        jLabelGet5Stars.setText(String.valueOf(contatore5S));
        
         /*   for (Recensione rece : tmpListRece) {
            for (int contatore1S = 0; rece.getStars() == 1; contatore1S++) {
                jLabelGet1Stars.setText(String.valueOf(contatore1S));

            }
            for (int contatore2S = 0; rece.getStars() == 2; contatore2S++) {
                jLabelGet2Stars.setText(String.valueOf(contatore2S));

            }
            for (int contatore3S = 0; rece.getStars() == 3; contatore3S++) {
                jLabelGet3Stars.setText(String.valueOf(contatore3S));

            }
            for (int contatore4S = 0; rece.getStars() == 4; contatore4S++) {
                jLabelGet4Stars.setText(String.valueOf(contatore4S));

            }
            for (int contatore5S = 0; rece.getStars() == 5; contatore5S++) {
                jLabelGet5Stars.setText(String.valueOf(contatore5S));

            }

        }
         */
        ListSelectionModel model = jTable1.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!model.getValueIsAdjusting()) {
                    try {

                        Parser tmpParser = new Parser();
                        List<Cliente> listCli = tmpParser.readFromFile();
                        List<Recensione> listRece = tmpParser.readRecensioniFromFile();
                        for (Recensione rece : listRece) {
                            for (Cliente cli : listCli) {
                                if (rece.getClientID() == cli.getId()) {
                                    jLabelReceCompleta.setText(rece.getRecensione());
                                }
                            }
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(RecensioniGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        });

        jLabelGetName.setText(rist.getRestaurantName());
        jLabelGetAddress.setText(rist.getAddress());
        jLabelGetCity.setText(rist.getCity());
        jLabelGetProvince.setText(rist.getProvince());
        jLabelGetCap.setText(rist.getCap());
        jLabelGetNumber.setText(rist.getTelephoneNumber());
        jLabelGetWebsite.setText(rist.getWebSite());
        jLabelGetType.setText(rist.getRestaurantType());

    }

    private RecensioniGUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        jLabelProvince = new javax.swing.JLabel();
        jLabelCap = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jLabelWebsite = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jLabel1StarReview = new javax.swing.JLabel();
        jLabel2StarReviews = new javax.swing.JLabel();
        jLabel3StarsReviews = new javax.swing.JLabel();
        jLabel14StarsReviews = new javax.swing.JLabel();
        jLabel5StarsReviews = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelRecCompleta = new javax.swing.JLabel();
        jLabelGetName = new javax.swing.JLabel();
        jLabelGetAddress = new javax.swing.JLabel();
        jLabelGetCity = new javax.swing.JLabel();
        jLabelGetProvince = new javax.swing.JLabel();
        jLabelGetCap = new javax.swing.JLabel();
        jLabelGetNumber = new javax.swing.JLabel();
        jLabelGetWebsite = new javax.swing.JLabel();
        jLabelGetType = new javax.swing.JLabel();
        jLabelGet1Stars = new javax.swing.JLabel();
        jLabelGet2Stars = new javax.swing.JLabel();
        jLabelGet4Stars = new javax.swing.JLabel();
        jLabelGet3Stars = new javax.swing.JLabel();
        jLabelGet5Stars = new javax.swing.JLabel();
        jLabelReceCompleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelName.setText("Name");
        jLabelName.setToolTipText("");

        jLabelAddress.setText("Address");
        jLabelAddress.setToolTipText("");

        jLabelCity.setText("City");
        jLabelCity.setToolTipText("");

        jLabelProvince.setText("Province");
        jLabelProvince.setToolTipText("");

        jLabelCap.setText("Cap");
        jLabelCap.setToolTipText("");

        jLabelNumber.setText("Number");
        jLabelNumber.setToolTipText("");

        jLabelWebsite.setText("Website");
        jLabelWebsite.setToolTipText("");

        jLabelType.setText("Type");
        jLabelType.setToolTipText("");

        jLabel1StarReview.setText("1 Star Reviews");

        jLabel2StarReviews.setText("2 Stars Reviews");

        jLabel3StarsReviews.setText("3 Stars Reviews");

        jLabel14StarsReviews.setText("4 Stars Reviews");

        jLabel5StarsReviews.setText("5 Stars Reviews");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Stelle", "Recensione"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabelRecCompleta.setText("Recensione Completa");

        jLabelGetName.setText("\"\"");

        jLabelGetAddress.setText("\"\"");

        jLabelGetCity.setText("\"\"");

        jLabelGetProvince.setText("\"\"");

        jLabelGetCap.setText("\"\"");

        jLabelGetNumber.setText("\"\"");

        jLabelGetWebsite.setText("\"\"");

        jLabelGetType.setText("\"\"");

        jLabelGet1Stars.setText("\"\"");

        jLabelGet2Stars.setText("\"\"");

        jLabelGet4Stars.setText("\"\"");

        jLabelGet3Stars.setText("\"\"");

        jLabelGet5Stars.setText("\"\"");

        jLabelReceCompleta.setText("\"\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelRecCompleta)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetProvince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGetCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel5StarsReviews, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel14StarsReviews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3StarsReviews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2StarReviews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1StarReview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGet5Stars, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGet4Stars, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGet3Stars, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGet2Stars, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGet1Stars, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelGetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelGetWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(25, 25, 25))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelReceCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelName)
                                        .addComponent(jLabelGetName))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1StarReview)
                                        .addComponent(jLabelGet1Stars)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelAddress)
                                        .addComponent(jLabelGetAddress))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2StarReviews)
                                        .addComponent(jLabelGet2Stars)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCity)
                                        .addComponent(jLabelGetCity))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3StarsReviews)
                                        .addComponent(jLabelGet3Stars)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProvince)
                                    .addComponent(jLabelGetProvince)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14StarsReviews)
                                .addComponent(jLabelGet4Stars)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCap)
                            .addComponent(jLabelGetCap)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5StarsReviews)
                        .addComponent(jLabelGet5Stars)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumber)
                    .addComponent(jLabelGetNumber))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWebsite)
                    .addComponent(jLabelGetWebsite))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(jLabelGetType))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRecCompleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelReceCompleta)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RecensioniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecensioniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecensioniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecensioniGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RecensioniGUI(new Ristorante(), false).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(RecensioniGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * popola la jtable di default
     *
     * @author luqmanasghar
     * @throws java.lang.Exception
     */
    public void populateJTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Parser tmpParser = new Parser();
        List<Cliente> listCli = tmpParser.readFromFile();
        List<Recensione> listRece = tmpParser.readRecensioniFromFile();

        Object[] rowData = new Object[3];

        for (Recensione rece : listRece) {
            if (this.rist.getRestaurantID() == rece.getRestaurantID()) {
                for (Cliente cli : listCli) {
                    if (rece.getClientID() == cli.getId()) {
                        rowData[0] = cli.getName();
                    }
                }
                rowData[1] = rece.getStars();
                rowData[2] = rece.getRecensione();
            }
            model.addRow(rowData);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14StarsReviews;
    private javax.swing.JLabel jLabel1StarReview;
    private javax.swing.JLabel jLabel2StarReviews;
    private javax.swing.JLabel jLabel3StarsReviews;
    private javax.swing.JLabel jLabel5StarsReviews;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCap;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelGet1Stars;
    private javax.swing.JLabel jLabelGet2Stars;
    private javax.swing.JLabel jLabelGet3Stars;
    private javax.swing.JLabel jLabelGet4Stars;
    private javax.swing.JLabel jLabelGet5Stars;
    private javax.swing.JLabel jLabelGetAddress;
    private javax.swing.JLabel jLabelGetCap;
    private javax.swing.JLabel jLabelGetCity;
    private javax.swing.JLabel jLabelGetName;
    private javax.swing.JLabel jLabelGetNumber;
    private javax.swing.JLabel jLabelGetProvince;
    private javax.swing.JLabel jLabelGetType;
    private javax.swing.JLabel jLabelGetWebsite;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelProvince;
    private javax.swing.JLabel jLabelRecCompleta;
    private javax.swing.JLabel jLabelReceCompleta;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelWebsite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
