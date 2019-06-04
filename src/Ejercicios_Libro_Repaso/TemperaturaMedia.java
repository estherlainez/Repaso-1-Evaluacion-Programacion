package Ejercicios_Libro_Repaso;
import java.util.*;
public class TemperaturaMedia {

	/*Realiza  un  programa  que  pida  la  temperatura  media  que  ha  hecho  en  cada  mes  de  un 
	determinado  año  y  que  muestre  a  continuacion  un  diagrama  de  barras  horizontales  con  esos datos. 
	Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro caracter.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		  String[] mes = {
			      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
			    
			    int[] temperatura = new int[12];
			
		for(int i=0;i<12;i++) {
			System.out.print("Introduce la temperatura media de " + mes[i] +" ------> ");
			temperatura[i]=teclado.nextInt();
			System.out.println();
			
		}
		
		
			teclado.close();
	}

}
