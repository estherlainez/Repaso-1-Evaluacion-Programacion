package Repaso;

import javax.swing.JOptionPane;

public class CompruebaEmail_For {

	public static void main(String[] args) {
		//Comprobamos el email si es correcto
		//Para que sea correcto deba llavar @
		
		int arroba=0;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba++;				
			}
			
			if(mail.charAt(i)=='.') {
				
				punto=true;
				
			}
			
		}
		
		if(arroba==1 && punto==true) {
			
			System.out.println("Es correcto");
			
		}else {
			
			System.out.println("No es correcto");
		}
		
	}

}