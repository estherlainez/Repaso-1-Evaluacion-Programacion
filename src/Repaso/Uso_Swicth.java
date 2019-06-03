package Repaso;
import java.util.*;
import javax.swing.*;
public class Uso_Swicth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		 int figura= teclado.nextInt();
		 switch(figura) {
		 case 1:
			 
			 //estas ventanas se usan para introducir datos y
			 //aparecen detras de eclipse, asi que habra que minimizar eclipse
			 
			 int lado= Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			 
			 System.out.println("El area del cuadrado es: "+ Math.pow(lado, 2));
			 
			 break;
			 
		 case 2: 
			 
			 int base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			 
			 int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			 
			 System.out.println("El area del rectangulo es: "+ base * altura);
			 
			 break;
			 
		 case 3:
			 
			  base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			  
			  altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			 
			 System.out.println("El area del rectangulo es: "+ (base * altura)/2);
			 
			 break;
			 
		 case 4:
			 
			 int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			 
			 System.out.print("El area del circulo es :");
			 
			 //con esta instrucion consigo que solo me imprima dos decimales en vez de muchos decimales
			 
			 System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			 break;
		 
		 }

	}

}
