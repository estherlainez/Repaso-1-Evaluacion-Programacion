package Repaso;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce numero (Se recomienda menor que 40)");
		int num= teclado.nextInt();
		int resultado=0;
		resultado=Fibonaci(num);
		System.out.println("Su resultado sera de   "+resultado);

	}
	
	public static int Fibonaci(int n) {
		int r;
		if(n==0) {
			r=1;
		}else {
			if (n==1) {
				r=1;
			}else {
				r=Fibonaci(n - 1) + Fibonaci(n - 2);
			}
		}
		return r;
	}

}
