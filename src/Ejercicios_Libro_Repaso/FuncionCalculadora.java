package Ejercicios_Libro_Repaso;
import java.util.*;
public class FuncionCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduzca numero");
		int a= teclado.nextInt();
		System.out.println("Introduzca numero");
		int b= teclado.nextInt();
		System.out.println("Seleccione operacion: Sumar opcion 1, Restar opcion 2, Multiplicar opcion 3, Dividir opcion 4");
		int eligeOpcion=teclado.nextInt();

		int suResultado=Calculadora(a,b,eligeOpcion);
		System.out.println("El resultado sera de----->"+suResultado);
	}



public static int Calculadora(int a, int b, int opcion) {
	int resultado=0;
	switch(opcion) {
	case 1:
		resultado=a + b;
		break;
	case 2: 
		resultado=a - b;
		break;
	case 3: 
		resultado=a * b;
		break;
	case 4: 
		resultado=a / b;
		break;
	
	}
	return resultado;
 }

}