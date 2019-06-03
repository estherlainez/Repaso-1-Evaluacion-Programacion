package Ejercicios_Libro_Repaso;
import java.util.*;
public class NotasDeUnCentroEducativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		int alumnos=5;
		int trimestres=3;
		int notas[][]= new int[3][5];
		
		for(int i=0;i<trimestres;i++) {
			System.out.println();
			for(int j=0;j<alumnos;j++) {
				notas[i][j]=(int)(Math.random()*11);
				System.out.print(notas[i][j]+" \t");
			}
		}
		System.out.println("\n");

		int sumaF=0;
		for(int i=0;i<trimestres;i++) {	
			for(int j=0;j<alumnos;j++) {					
				sumaF=sumaF+notas[i][j];	
				System.out.print(notas[i][j]+"\t ");
			}
			System.out.println(sumaF);
			System.out.println("La media del trimestre ha sido de         "+ sumaF/5);
			System.out.println();
			sumaF=0;
		}
		
		System.out.println("¿Que alumno necesita conocer sus datos?");
		int n= teclado.nextInt();	
		double media=0;
		int suma=notas[0][n]+notas[1][n]+notas[2][n];
		media=(double) suma/3;
		System.out.println("La media de este alumno es de "+media);
		
		
	}

}
