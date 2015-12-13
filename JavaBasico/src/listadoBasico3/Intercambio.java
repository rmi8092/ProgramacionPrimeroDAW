package listadoBasico3;

/**
* Define la clase Intercambio que pide dos enteros por
* teclado e intercambia el valor de ambas variables.
* Muestra el valor antes y después del intercambio.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Intercambio{
	private static java.util.Scanner scanner;

	public static void main (String[]args){
		scanner = new java.util.Scanner(System.in);
		int n1, n2;

		System.out.println("\nDame dos numeros e intercambiare sus valores.");
		n1=scanner.nextInt();
		n2=scanner.nextInt();

		n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("\nLos valores intercambiados son: A = "+n1+" y B = "+n2);
	}//main
}//class
