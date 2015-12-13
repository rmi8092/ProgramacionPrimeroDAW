package listadoBasico3;

/**
* Define la clase Intercambio que pide dos enteros por
* teclado e intercambia el valor de ambas variables.
* Muestra el valor antes y después del intercambio.
*
* @author Rafa Miranda
* @version 1.0
*/

public class IntercambioB{
	private static java.util.Scanner scanner;

	public static void main (String[]args){
		
		scanner = new java.util.Scanner(System.in);
		int n1, n2, auxiliar;

		System.out.println("\nDame un entero:");
		n1=scanner.nextInt();
		System.out.println("\nDame otro entero:");
		n2=scanner.nextInt();

		System.out.println("\nAntes del intercambio, \tn1 :  "+n1+", n2: "+n2);

		//intercambio mediante variable auxiliar
		auxiliar = n1;//guardo uno de los valores en una variable auxiliar para no perderlo
		n1 = n2;
		n2 = auxiliar;
	
		System.out.println("\nDespués del intercambio, \tn1 :  "+n1+", n2: "+n2);
	}
}

