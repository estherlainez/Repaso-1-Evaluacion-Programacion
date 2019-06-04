package Ejercicios_Libro_Repaso;

import java.util.Arrays;
import java.util.Scanner;
public class ConductorQueMasHorasHace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El conductor que mas horas hace los lunes
		Scanner teclado=new Scanner(System.in);
		int chofers=5,diaSemana=6,sueldoHora=10,horas=0;
		int i=0,j=0,suma = 0,conductores=5,sueldo=0,mayor=0;
		int filaMayor=0,columnaMayor=0;
		
		System.out.println("5 conductores");
		int s[][]=new int[5][6];
		System.out.println("6 dias, de lunes a sabado");
		
		for(i=0;i<conductores;i++) {
			System.out.println("Conductor "+i+" horas:");
			horas=teclado.nextInt();
			for(j=0;j<6;j++) {
				s[i][j]=teclado.nextInt();
						System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for( i=0;i<conductores;i++) {	
			for( j=1;j<diaSemana;j++) {					
				suma=suma+s[i][j];
				sueldo=suma*sueldoHora;
				System.out.print(s[i][j]+"\t ");
			}
				System.out.println(suma+" horas  "+sueldo+"  euros");
				suma=0;
		}
		for( i=0;i<conductores;i++) {	
			for( j=0;j<diaSemana;j++) {					
				suma=suma+s[i][j];
				sueldo=suma*sueldoHora;

					if(mayor<s[i][j]) {
						mayor=s[i][j];
						filaMayor=i;
						columnaMayor=j;
					}
				
			}	
		}
		System.out.println(suma+" horas  "+sueldo+"  euros");
		
		
		System.out.println("El mayor conductor de los lunes es el conductor numero "+filaMayor);

	}

}
