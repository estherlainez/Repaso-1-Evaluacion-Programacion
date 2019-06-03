package Repaso;
import java.util.*;
public class Uso_Condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca tu edad");
		int edad = teclado.nextInt();
		
		if(edad<18) {
			
			System.out.println("Eres un adolescente");
			
		}else if(edad<40) {
			
			System.out.println("Eres joven");
			
		}else if(edad<65) {
			
			System.out.println("Eres maduro");
			
		}else {
			
			System.out.println("Cuidate");
		}
	}

}
