
package ristoratori;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class RecensioniGUI extends JFrame {

	private JPanel contentPane;
	private JList list;
	

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        RecensioniGUI frame = new RecensioniGUI();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
        
	public RecensioniGUI() {
		setTitle("Restaurant Rewiew");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final DefaultListModel defaultModel = new DefaultListModel();
		final JList listRewiew = new JList();
		JScrollPane scroll = new JScrollPane(listRewiew);
		scroll.setBounds(197,155,460,245);
		contentPane.add(scroll);
		
		JLabel lblListRewiew = new JLabel("Restaurant Rewiew: ");
		lblListRewiew.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblListRewiew.setBounds(47, 255, 140, 25);
		contentPane.add(lblListRewiew);
		
		JTextArea textAreaReview = new JTextArea();
		textAreaReview.setDocument(new RestaurantJTextFieldLimit(256));
		textAreaReview.setBounds(197, 11, 460, 133);
		contentPane.add(textAreaReview);
		
		JButton btnAddRecensione = new JButton("Add Rewiew");
		btnAddRecensione.addActionListener((ActionEvent e) -> {
                    String empty = "";
                    
                    if(!textAreaReview.equals(empty)){
                        
                        File restaurantReview = new File("restaurantReview.txt");
                        Recensioni review = new Recensioni(textAreaReview.getText());
                        
                        if(restaurantReview.exists()) {
                            FileOutputStream restaurantReviewFOP = null;
                            try {
                                restaurantReviewFOP = new FileOutputStream("restaurantReview",true);
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                            PrintWriter restaurantReviewWriter = new PrintWriter(restaurantReviewFOP);
                            restaurantReviewWriter.println(review.getRestaurantReviews());
                            restaurantReviewWriter.close();
                        } else
                            try {
                                if(restaurantReview.createNewFile()){
                                    PrintWriter restaurantReviewWriter = new PrintWriter("restaurantReview.txt");
                                    restaurantReviewWriter.println(review.getRestaurantReviews());
                                    restaurantReviewWriter.close();
                                    
                                }
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        
                        defaultModel.addElement(textAreaReview.getText());
                        listRewiew.setModel(defaultModel);
                        
                    }
                    
                });
                
		btnAddRecensione.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddRecensione.setBounds(57, 52, 130, 25);
		contentPane.add(btnAddRecensione);
			
	}
}
