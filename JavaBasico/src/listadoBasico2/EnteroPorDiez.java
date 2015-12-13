package listadoBasico2;

/**
* Define la clase EnteroPorDiez que pide un entero por
* teclado y lo multiplica por 10
*
* @author Rafa Miranda
* @version 1.0
*/

public class EnteroPorDiez{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		System.out.println("\nIntroduce un numero y te dire el resultado"+
			" de multiplicarlo por diez: ");
		int numero;
		scanner = new java.util.Scanner(System.in);
		numero=scanner.nextInt();
		int result=numero*10;

		System.out.println("El resultado es: "+result);
	}
}