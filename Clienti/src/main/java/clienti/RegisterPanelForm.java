/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luqmanasghar
 */
public class RegisterPanelForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPanelForm
     */
    public RegisterPanelForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldProvincia = new javax.swing.JTextField();
        jTextFieldProvincia.setDocument(new JTextFieldLimit(3));
        jLblPassword = new javax.swing.JLabel();
        jLblSurname = new javax.swing.JLabel();
        jTextFieldComune = new javax.swing.JTextField();
        jTextFieldComune.setDocument(new JTextFieldLimit(40));
        jLblComune = new javax.swing.JLabel();
        jBtnSignUp = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNome.setDocument(new JTextFieldLimit(30));
        jLblProvincia = new javax.swing.JLabel();
        jTextFieldCognome = new javax.swing.JTextField();
        jTextFieldCognome.setDocument(new JTextFieldLimit(30));
        jLblEmail = new javax.swing.JLabel();
        JLblTitle = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEmail.setDocument(new JTextFieldLimit(32));
        jLblNickName = new javax.swing.JLabel();
        jLblName = new javax.swing.JLabel();
        jTextFieldNickName = new javax.swing.JTextField();
        jTextFieldNickName.setDocument(new JTextFieldLimit(26));
        jBtnCancel = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldPassword.setDocument(new JTextFieldLimit(17));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblPassword.setText("Password");

        jLblSurname.setText("Cognome");

        jLblComune.setText("Comune");

        jBtnSignUp.setText("Sign Up!");
        jBtnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSignUpMouseClicked(evt);
            }
        });

        jTextFieldNome.setInheritsPopupMenu(true);

        jLblProvincia.setText("Provincia");

        jLblEmail.setText("Email");

        JLblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N
        JLblTitle.setText("Informazioni Cliente");
        JLblTitle.setMaximumSize(new java.awt.Dimension(128, 16));
        JLblTitle.setMinimumSize(new java.awt.Dimension(128, 16));

        jLblNickName.setText("NickName");

        jLblName.setText("Nome");

        jBtnCancel.setText("Cancel");
        jBtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblComune, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldComune, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblName)
                    .addComponent(jLblSurname)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblComune)
                    .addComponent(jLblProvincia)
                    .addComponent(jTextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNickName)
                    .addComponent(jTextFieldNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSignUp)
                    .addComponent(jBtnCancel))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes REgister frame and open login Frame
     *
     * @param evt
     */
    private void jBtnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMouseClicked
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jBtnCancelMouseClicked

    /**
     * Add the new client in the file that contains clients data
     *
     * @param evt
     */
    private void jBtnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSignUpMouseClicked
        Parser parser = new Parser();
        Cliente cliente = new Cliente();

        try {
            cliente.setName(jTextFieldNome.getText());
            cliente.setSurname(jTextFieldCognome.getText());
            cliente.setCity(jTextFieldComune.getText());
            cliente.setProvince(jTextFieldProvincia.getText());
            cliente.setMail(jTextFieldEmail.getText());
            cliente.setNickName(jTextFieldNickName.getText());
            cliente.setPassword(jTextFieldPassword.getText());
            parser.UpdateFile(cliente);
        } catch (IOException ex) {
            Logger.getLogger(RegisterPanelForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBtnSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterPanelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPanelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPanelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPanelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPanelForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblTitle;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnSignUp;
    private javax.swing.JLabel jLblComune;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblNickName;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblProvincia;
    private javax.swing.JLabel jLblSurname;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldComune;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNickName;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldProvincia;
    // End of variables declaration//GEN-END:variables
}