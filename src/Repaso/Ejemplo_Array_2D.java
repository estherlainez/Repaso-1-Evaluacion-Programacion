package Repaso;

public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double acumulado;
		double interes=0.10;
		
		double [][] saldo= new double [6][5];
		
		for(int i=0; i<6;i++) {
			//para que no mueva la segunda dimension 
			saldo[i][0]=10000;
			acumulado=10000;
			
			//no necesito recorrer j=0 porque ya lo he rellenado
			for(int j=1;j<5;j++) {
				
				acumulado=acumulado+(acumulado * interes);
				
				saldo[i][j]=acumulado;
				
			}
			
			interes= interes +0.01;
			//vuelve arriba incrementando el interes
		}
		
		
		for(int z=0;z<6;z++) {
			
			System.out.println();
			
			for(int h=0;h<5;h++) {
				
				System.out.printf("   %1.2f",saldo [z][h]);
			}
			
		}
		
	}

}
