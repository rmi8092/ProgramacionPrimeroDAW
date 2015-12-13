package listadoBasico2;

/**
* Define la clase LeeEnteros. Lee 10 enteros e
* indica al final si se ha introducido algún cero.
*
* @author Rafa Miranda
* @version 1.0
*/

public class LeeEnteros{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		
		System.out.println("\nIntroduce diez numeros y te dire "+
		"si has introducido algun cero: ");
		int numero;
		int cont=0;
		
		for (int n=1; n<11; n++){ //con este bucle obligo a introducir 10 numeros.
			numero=scanner.nextInt();
			if (numero==0)
				cont++;			
		}
		System.out.println("En su secuencia de enteros hay "+cont+" ceros.");
	}
}