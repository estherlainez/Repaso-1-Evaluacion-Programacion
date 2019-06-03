package Repaso;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear la matriz de una manera mas simple
		int [][] matriz= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		//recorrer la matriz bidimensional con for each
		for (int[]fila:matriz) {
			
			for(int z: fila) {
				
				System.out.print(z+" \t");	
			}
			System.out.println();
		}
		System.out.println("\n");
		
		//crear la matriz y dar valores
		int [][] matrix= new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		
		//para mostrar un valor de la matriz
		//System.out.println("valor almacenado en la posicion 2,3 --->"+matrix[2][3]);
		
		//recorrer la matriz con for para mostrar por pantalla
		for (int i=0;i<4;i++) {
			
			for(int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j]+" \t");	
			}
			System.out.println();
		}

	}

}
