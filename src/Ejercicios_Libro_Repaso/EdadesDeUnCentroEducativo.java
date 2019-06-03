package Ejercicios_Libro_Repaso;
import java.util.*;
public class EdadesDeUnCentroEducativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int edad=0,sumaEdades=0,numeroPersonas=0,mayorEdad=0,menorEdad=0;
		System.out.println("Introduzca edad");
		edad=teclado.nextInt();
		while(edad>=0) {
			sumaEdades=sumaEdades+edad;
			numeroPersonas++;
			if(edad<18) {
				menorEdad++;	
			}else if(edad>=18) {
				mayorEdad++;
			}
			
			System.out.println("Introduzca edad");
			edad=teclado.nextInt();
		}
		System.out.println("Mayores de edad hay "+mayorEdad);
		System.out.println("Menores de edad hay "+menorEdad);
		System.out.println("Numero de alumnos "+numeroPersonas);
		System.out.println("Media de edad es "+sumaEdades/numeroPersonas);
	}

}
