import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class First extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JTextArea textArea;
	static String str="",str1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
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
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 462);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Text");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 48, 138, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(215, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Encrypt Text");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=textField.getText();
				// Invokecall i = new Invokecall();
				 //i.dataTransfer(str);
				Cipherdecrypt c = new Cipherdecrypt();
				str1=c.dataTransfer(str);		
			    textArea.setText(str1);	
			}
		});
		btnNewButton.setBounds(123, 103, 178, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(26, 151, 886, 168);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FFirst f1 = new FFirst();
				f1.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(826, 389, 86, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Security System");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1.setBounds(288, 11, 238, 33);
		contentPane.add(lblNewLabel_1);
	}
}
