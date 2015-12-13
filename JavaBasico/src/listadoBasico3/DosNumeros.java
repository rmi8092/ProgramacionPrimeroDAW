package listadoBasico3;

/**
* Define la clase DosNumeros. Lee dos enteros hasta que sean distintos.
* Si no lo son, se mostrará el mensaje "Son iguales". Una vez introducidos
* ambos de forma correcta se mostrará el menor de ellos. Utiliza el operador ?
*
* @author Rafa Miranda
* @version 1.0
*/

public class DosNumeros{
	private static java.util.Scanner scanner;

	public static void main(String[]args){
		scanner = new java.util.Scanner(System.in);
		int i1, i2, menor;

		do{
			System.out.println("Introduce dos numeros: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			
			if (i1==i2){
				System.out.println("Los dos numeros son iguales.");
				break;
			}

			menor = (i1<i2)?i1:i2;
			System.out.println(menor+" es el menor.");

		}while(true);
	}//main
}//class