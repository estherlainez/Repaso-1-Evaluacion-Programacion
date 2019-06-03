package Repaso;
import java.util.*;
import javax.swing.*;
public class pesoIdeal_Uso_doWhile {

	public static void main(String[] args) {
		//Introducir el genero y la altura y el programa
		//te muestra tu peso ideal
		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		//este metodo es igual que equals pero no distingue entre mayusculas y minusculas	
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		//el metodo showInputDialog devuelve un String
		//este metodo es estatico
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal=altura-110;
		}else if(genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal);
	}

}
