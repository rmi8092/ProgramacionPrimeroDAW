package listadoBasico2;

/**
* Define la clase EsPositivoNegativoCero que pide un entero
* por teclado e indica si es positivo, negativo o cero.
*
* @author Rafa Miranda
* @version 1.0
*/

public class EsPositivoNegativoCero{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		
		System.out.println("\nIntroduce un numero. Yo te dire si es positivo, negativo o cero: ");
		int numero;
		numero=scanner.nextInt();

		if (numero>0)
			System.out.println("El numero introducido es POSITIVO.");
			else if (numero<0)
				System.out.println("El numero introducido es NEGATIVO.");
			else
				System.out.println("El numero introducido es CERO.");
	}
}