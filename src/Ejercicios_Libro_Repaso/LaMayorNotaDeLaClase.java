package Ejercicios_Libro_Repaso;
public class LaMayorNotaDeLaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La mayor nota de la clase
				int i=0,j=0,n=5,promedio,PA=0,mayor=0;
				String nombre="",NA="",nom="";
				int P[]={8,7,8,9,10,6,7,8,4,8};
				String N[]= {"Juan","Pedro","Esther","Javier","Raquel","Alejandro","Jesus","Luis","Roberto","David"};
				
				 
				
				for(i=0;i<10;i++) {		
					System.out.print(N[i]+" \t");
					System.out.print(P[i]+" \t");
					
				}
				System.out.println("\n");
				
				for ( i = 0; i < 10; i++) {
					for ( j = 0; j < 10; j++) {
							if (P[j] > mayor) {
								mayor = P[j];
								nom = N[j];
							} 
					}
				}

				System.out.println(" El/la " + nom + "  es la mayor nota de la clase con: " + mayor);
						
	}

}