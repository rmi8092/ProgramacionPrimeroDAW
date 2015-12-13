package listadoBasico3;

/**
* Define la clase Menor que pide repetidas veces dos enteros
* por teclado e indica cuál es el menor. En caso de ser iguales
* se sale del programa diciendo adiós. Utiliza la sentencia break.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Menor{
	private static java.util.Scanner scanner;

	public static void main(String[]args){
		scanner = new java.util.Scanner(System.in);
		int n1, n2;

		for(int c=1;c>0;c++){
		System.out.println("\nDame dos numeros y te dire cual es menor. "+
				"Si fueran iguales saldre del programa.");
			n1=scanner.nextInt();
			n2=scanner.nextInt();

			if(n1==n2){
				System.out.println("\nLos dos numeros son iguales.");
				break;
			}//if
				else{
					if (n1<n2)
						System.out.println(n1+" es menor que "+n1);
					else
							System.out.println(n2+" es menor que "+n1);
				}//else
		}//for
	}//main
}//class