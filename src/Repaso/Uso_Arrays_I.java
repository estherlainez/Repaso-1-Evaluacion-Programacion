package Repaso;

public class Uso_Arrays_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int [] mi_matriz= new int[5];
		
		//otra opcion
		//int mi_matriz2[]=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		*/
		
		int []mi_matriz= {5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78};
		
		//para imprimir un valor de la matriz
		System.out.println(mi_matriz[3]+"\n");
				
		//para recorrer la matriz mi_matriz.length o su longitud
		for(int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("Valor del indice "+i+" = "+mi_matriz[i]);
		}
		 
		
		
	}

}
