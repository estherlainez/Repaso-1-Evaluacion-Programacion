package Ejercicios_Libro_Repaso;
import java.util.*;
public class JuegoDeLaCamaraSecreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la longitud de la cambinacion secreta");
		int longitud=teclado.nextInt();
		int numeroIntentos=0;
		int combinacionSecreta[]=new int [longitud];
		int combinacionJugador[]=new int [longitud];
		
		generarCombinacion(combinacionSecreta);
		System.out.println(Arrays.toString(combinacionSecreta));
		System.out.println("Escribe una combinacion");
		leerArray(combinacionJugador);
		
		while(!Arrays.equals(combinacionSecreta, combinacionJugador)) {
			mostrarPistas(combinacionSecreta, combinacionJugador);
			System.out.println("Escribe una combinacion");
			leerArray(combinacionJugador);
			numeroIntentos++;
		}
		
		System.out.println("Perfecto!!!Ha sido consegido en "+numeroIntentos+" Intentos");

	}
	
	public static void generarCombinacion(int t[]) {
		int limite=5;
		for(int i=0;i<t.length;i++) {
			t[i]=(int)(Math.random()*limite+1);
		}
	}
	
	public static void leerArray(int t[]) {
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<t.length;i++) {
			t[i]=teclado.nextInt();
		}
	}
	
	public static void mostrarPistas(int secreta[], int jugador[]) {
		for(int i=0;i<jugador.length;i++) {
			System.out.println(jugador[i]);
			if(secreta[i]>jugador[i]) {
				System.out.println("Mayor");
			}else if(secreta[i]<jugador[i]) {
				System.out.println("Menor");
			}else {
				System.out.println("Correcto");
			}
		}
	}

}
