package listadoBasico2;

/**
* Define la clase SonIguales que lea dos valores numéricos,
* y determine si son iguales y, en caso de no serlo,
* indique cuál de ellos es el mayor.
*
* @author Rafa Miranda
* @version 1.0
*/

public class SonIguales{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		int ent1, ent2;

		System.out.println("\nIntroduce dos numeros. Yo te dire "+
		"si son iguales, y si no lo son te dire cual es mayor: ");
		ent1 = scanner.nextInt();
		ent2 = scanner.nextInt();

		if (ent1==ent2)
				System.out.println("Ambos numeros son iguales.");
			else if (ent1>ent2)
					System.out.println(ent1+" es mayor que "+ent2);
				else
						System.out.println(ent1+" es menor que "+ent2);
	}//main
}//class