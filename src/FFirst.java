import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FFirst extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FFirst frame = new FFirst();
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
	public FFirst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\SDP\\img.png")));
		
		JLabel lblNewLabel = new JLabel("Security System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel.setBounds(306, 11, 233, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Text Encryption");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First f = new First();
				f.show();
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(112, 198, 196, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Image Encryption");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageOperation i = new ImageOperation();
				i.m1();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(584, 198, 209, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Crypto\\src\\Images\\encryption-encoding-hashing.jpg"));
		lblNewLabel_1.setBounds(0, 0, 922, 423);
		contentPane.add(lblNewLabel_1);
	}
}
