package Repaso;
import java.util.*;
public class while_adivinaNumero {

	public static void main(String[] args) {
		// El programa genera un numero aleatorio y el usuario
		//acierta el numero. El programa dice las veces que
		//ha intentado el usuario
		
		int aleatorio=(int)(Math.random()*100);		
		
		Scanner teclado=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;		
		
		while(numero!=aleatorio) {
			intentos++;
			
			System.out.println("Introduce numero por favor");
				
			numero=teclado.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo ");
				
			}else if(aleatorio>numero) {
				
				System.out.println("Mas alto ");
			}
			
		}
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");

	}

}
