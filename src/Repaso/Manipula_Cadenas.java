package Repaso;

public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Maria Pilar";
		
		System.out.println("Mi nombre es: "+nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length()+" caracteres");
		
		System.out.println("La primera letra de "+nombre+" es la "+nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es la "+nombre.charAt(ultima_letra-1));
	}

}
