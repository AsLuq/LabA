package ristoratori;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestaurantLoginGUI extends JFrame {

	private final JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	static RestaurantLoginGUI frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					frame = new RestaurantLoginGUI();
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
		
	public RestaurantLoginGUI() {
		setFont(new Font("Tahoma", Font.BOLD, 13));
		setTitle("Applicativo Ristoratori");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setBounds(180, 20, 80, 25);
		contentPane.add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(160, 50, 120, 25);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(180, 80, 80, 25);
		contentPane.add(lblPassword);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(160, 110, 120, 25);
		contentPane.add(textFieldPassword);
		
		final JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogin.setBounds(70, 151, 90, 25);
		contentPane.add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String correctUser = "RistAdmin";
				String correctPassword = "Defaultpwd";
				
				String enteredUser = textFieldUsername.getText();
				String enteredPassword = textFieldPassword.getText();
				
				if(correctUser.compareTo(enteredUser) == 0) {
					if(correctPassword.compareTo(enteredPassword) == 0) {
						SecondaryRestaurantGUI addRestaurant = new SecondaryRestaurantGUI();
						addRestaurant.show();
						frame.setVisible(false);
					}
					
					 lblLogin.setText("Login Failed !");
					 
					}
				
				lblLogin.setText("Login Failed !");
			}
			});
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(175, 150, 90, 25);
		contentPane.add(btnLogin);
		
		
	}
}
