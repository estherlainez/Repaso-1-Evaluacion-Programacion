package Ejercicios_Libro_Repaso;
import java.util.*;
public class NumeroCapicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int dm,um,c,d,u;
		boolean capicua= false;
		
		System.out.println("Introduzca numero");
		int num=teclado.nextInt();
		
		u=num%10;
		num=num/10;
		
		d=num%10;
		num=num/10;
		
		c=num%10;
		num=num/10;
		
		um=num%10;
		num=num/10;
		
		dm=num%10;
		num=num;
		
		if(dm!=0 && dm==u && um==d) {
			capicua=true;
		}
		
		if(dm==0 && um!=0 && um==u && c==d) {
			capicua=true;
		}
		
		if(dm==0 && um==0 && c!=0 && c==u) {
			capicua=true;
		}
		
		if(dm==0 && um==0 && c==0 && d!=0 && d==u) {
			capicua=true;
		}
		
		if(capicua==true) {
			System.out.println("El numero que ha introducido es un numero capicua");
		}else {
			System.out.println("El numero que ha introducido no es un numero capicua");
		}
		
		
	}

}
