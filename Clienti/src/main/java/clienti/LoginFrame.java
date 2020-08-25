package clienti;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author luqmanasghar
 */
public class LoginFrame extends JFrame{
    
    public LoginFrame(){
        // creazione container
        super("Clienti");
        this.setSize(400, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        
        //Label
        JLabel labelNickName = new JLabel("NickName");
        labelNickName.setBounds(15, 20, 80, 20);
        panel.add(labelNickName);
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(15, 70, 80, 20);
        panel.add(labelPassword);
        
        //TextArea
        JTextField nickNameText = new JTextField(20);
        nickNameText.setBounds(100, 20, 150, 20);
        panel.add(nickNameText);
        JTextField passwordText = new JTextField(20);
        nickNameText.setBounds(100, 70, 150, 20);
        panel.add(passwordText);
        
        //creazione button
        JButton btnLogin = new JButton("Accedi");
        btnLogin.setBounds(15, 20, 80, 20);
        JButton btnRegister = new JButton("Registrati");        
        btnRegister.setBounds(15, 20, 80, 20);
        
        
        // creazione panel che verra inserito nella JFrame

        
        this.add(panel, BorderLayout.CENTER);
        
        
    }
}
