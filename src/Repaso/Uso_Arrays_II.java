package Repaso;
import javax.swing.*;
import java.util.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String [] paises=new String [8];
		
		/*
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		*/
		
		//String []paises= {"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		/*
		for(int i=0; i<paises.length;i++) {
			
			System.out.println("Pais " +(i+1)+" "+paises[i]);
		}
		*/
		
		//recorrer el array con for each
		/*
		for(String e: paises) {
			System.out.println("Pais: "+e);
		}
		*/
		//para meterlos por teclado o por JOptionPane
		
		for(int i=0;i<8;i++) {
			//paises[i]=JOptionPane.showInputDialog("Introduce pais"+ (i+1));
			paises[i]=teclado.nextLine();
			System.out.println("Pais " +(i+1)+" "+paises[i]);
		}
		
		int [] matriz_aleatorios=new int[150];
		
		for(int i=0;i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)(Math.random()*100+1);
		}
		
		for (int numeros: matriz_aleatorios) {
			System.out.print(numeros+" ");
		}

	}

}
