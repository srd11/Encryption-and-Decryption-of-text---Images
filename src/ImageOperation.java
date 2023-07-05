
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageOperation {

    public static void operate(int key)
    {

        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
        
        try
        {

            FileInputStream fis=new FileInputStream(file);

            byte []data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data)
            {
                System.out.println(b);
                data[i]=(byte)(b&key);
                i++;
            }

            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
    public void m1() {
    
    	
    	
    	
    	JFrame f=new JFrame();
        f.setTitle("Image Operation");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        
        f.setLayout(new BorderLayout());
        f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\SDP\\img.png")));
        f.setLayout(new FlowLayout());
       // f.getContentPane().setBackground(Color.BLUE);
        

        Font font=new Font("Roboto",Font.BOLD,25);
        //creating button
        JButton button=new JButton();
        button.setText("Encrypt");
        button.setFont(font);
        final JTextField textField=new JTextField(10);
        textField.setFont(font);

        
        
        JButton button1=new JButton();
        button1.setText("Decrypt");
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked");
			    String text=textField.getText();
			    int temp=Integer.parseInt(text);
			    operate(temp);
			}
		});
        First f1 = new First();
        f.show();
        f1.dispose();

        //creating text field

       
        
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    System.out.println("button clicked");
			    String text=textField.getText();
			    int temp=Integer.parseInt(text);
			    operate(temp);
			}
		});

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(button1);
        f.add(textField);
        f.setVisible(true);
       // return true;
    }
  	
    	
    
    public static void main(String[] args) {
        
        
    	
    	System.out.println("this is testing");

        
}
    }




















