package clienti;

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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;



public class AddReviewGUI extends JFrame {
	
	
	// Variables declaration - do not modify

	private JPanel contentPane;
	private JTextField textReview;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReviewGUI frame = new AddReviewGUI();
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

	public AddReviewGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStarReview = new JLabel("Star Review:");
		lblStarReview.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStarReview.setBounds(10, 11, 100, 25);
		contentPane.add(lblStarReview);

		String[] starReview = { "Select an option: ", "1", "2", "3", "4", "5" };
		JComboBox comboBox = new JComboBox(starReview);
		comboBox.setBounds(120, 13, 125, 25);
		contentPane.add(comboBox);

		JLabel lblRestReview = new JLabel("Restaurant Review: ");
		lblRestReview.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRestReview.setBounds(10, 47, 150, 25);
		contentPane.add(lblRestReview);

		textReview = new JTextField();
		textReview.setDocument(new JTextFieldLimit(256));
		textReview.setBounds(170, 48, 240, 25);
		contentPane.add(textReview);
		textReview.setColumns(10);

		JButton btnNewButton = new JButton("Add Review");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String empty = "";

				if (!comboBox.equals("Select an option: ") && !textReview.equals(empty)) {
					
					File restaurantReview = new File("restaurantReview.txt");
					String selectedStarReview = (String) comboBox.getSelectedItem();
					Recensione review = new Recensione(Integer.parseInt(selectedStarReview),textReview.getText());
					
					if(restaurantReview.exists()) {
						try {
							FileOutputStream tmpFOP = new FileOutputStream("restaurantReview.txt",true);
							PrintWriter tmpWriter = new PrintWriter(tmpFOP);
							tmpWriter.println(review.getStars() + " - " + review.getRecensione());
							tmpWriter.close();
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
					} else
						try {
							if(restaurantReview.createNewFile()){
								PrintWriter tmpWriter = new PrintWriter("restaurantReview.txt");
								tmpWriter.println(review.getStars() + " - " + review.getRecensione());
								tmpWriter.close();
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				}
				comboBox.setSelectedIndex(0);
				textReview.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(150, 100, 150, 25);
		contentPane.add(btnNewButton);

	}

}
