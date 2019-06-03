package Repaso;
import javax.swing.*;
public class Factorial_For {

	public static void main(String[] args) {
		// Factorial de un numero con el for descendente
		
		//La declaramos como long porque con int la desbordamos
		//poniendo despues del valor L
		long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial de "+numero+" es igual a "+resultado);

	}

}
