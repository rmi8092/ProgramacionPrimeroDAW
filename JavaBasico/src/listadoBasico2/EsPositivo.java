package listadoBasico2;

/**
* Define la clase EsPositivo que pide un entero por teclado e indica si es positivo.
*
* @author Rafa Miranda
* @version 1.0
*/

public class EsPositivo{
	private static java.util.Scanner scanner;

	public static void main(String[] args){

		scanner = new java.util.Scanner(System.in);
		
		System.out.println("\nIntroduce un numero. Yo te dire si es positivo o no: ");
		int entero;
		entero=scanner.nextInt();

		if(entero>0)
			System.out.println(entero+" es positivo.");
		else
			System.out.println(entero+" NO es positivo.");
	}
}