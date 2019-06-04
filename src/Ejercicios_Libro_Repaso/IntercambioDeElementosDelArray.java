package Ejercicios_Libro_Repaso;
public class IntercambioDeElementosDelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//intercambio de elementos del array
				int i=0,j=0;
				int au=0;
				int[] v = new int[5];
				System.out.println("mostramos valores");
				for(i=0;i<5;i++) {
					
					v[i]=(int)(Math.random()*5+1);
					//System.out.print(v[i]+"\t");		
					
					for(j=1;j<5;j++) {
						
						au=v[i];
						v[i]=v[j];
						v[j]=au;
						j=j+1;
						System.out.print(v[i]+"\t");		
					}
					System.out.println();
			
					
				}
	}

}