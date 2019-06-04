package Ejercicios_Libro_Repaso;

public class Maximo_y_Minimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] num=new int[6][10];
		int maximo=0; int minimo=1000;
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				num[i][j]=((int)(Math.random()*1000));
			}
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]>maximo) {
					maximo=num[i][j];
					}
				if (num[i][j]<minimo) {
					minimo=num[i][j];
				}
			}
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]==minimo) {
					System.out.print(" *"+num[i][j]+"*    ");	
				}
				if (num[i][j]==maximo) {
					System.out.print(" *"+num[i][j]+"* ");
				}
				if ((num[i][j]!=minimo)&&(num[i][j]!=maximo)) {
					System.out.print(num[i][j]+"\t ");
				}
			}
		System.out.println(" ");
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]==minimo) {
					System.out.println("El minimo se encuentra en la posicion: ["+i+"]["+j+"]");	
				}
				if (num[i][j]==maximo) {
					System.out.println("El maximo se encuentra en la posicion: ["+i+"]["+j+"]");
				}
			}
		}	
	}

}
