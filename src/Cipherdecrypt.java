
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Scanner;

import javax.crypto.Cipher;


public class Cipherdecrypt{	
	
		public String dataTransfer(String txt) {
			
            try {
		    Signature sign = Signature.getInstance("SHA256withRSA");
		      
		     
		      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		      
		      
		      keyPairGen.initialize(2048);
		      
		      
		      KeyPair pair = keyPairGen.generateKeyPair();   
		      
		      
		      PublicKey publicKey = pair.getPublic();  

		      
		      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

		      
		      cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			  
		    
		      byte[] input= txt.getBytes();
		    
		     
		    
		      cipher.update(input);
			  
		      //encrypting the data
		      byte[] cipherText = cipher.doFinal();	 
		      System.out.println( new String(cipherText, "UTF8"));
		      txt = "Message to encrypt"+"\n"+txt+"\n\nEncrypted message= "+new String(cipherText, "UTF8")+"\n";

		    
		      cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
		      
		      
		      byte[] decipheredText = cipher.doFinal(cipherText);
		      System.out.println("Again Message is decrypted");
		      System.out.println(new String(decipheredText));
		      txt = ""+txt + new String(decipheredText);
		    
            }
            catch(Exception e){
            	e.printStackTrace();
            }
		   
            return txt;
             
		}
	


	
   public static void main(String args[]) {
	   //Creating a Signature object
	  
   }
}