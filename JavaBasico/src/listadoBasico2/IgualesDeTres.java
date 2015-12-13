package listadoBasico2;

/**
* Define la clase IgualesDeTres que lea tres numeros de teclado
* y determine si la suma de cualquier pareja de ellos es igual
* al tercer numero. Si se cumple esta condicion, escribir Iguales
* y en caso contrario escribir Distintos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class IgualesDeTres{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		int ent1, ent2, ent3;
		int suma12, suma23, suma13;

		System.out.println("\nIntroduce tres numeros. Yo te dire "+
		"si la suma de cualquier pareja es igual al tercero,"+
		" o si no lo es: ");
		ent1 = scanner.nextInt();
		ent2 = scanner.nextInt();
		ent3 = scanner.nextInt();

		suma12=ent1+ent2;
		suma23=ent2+ent3;
		suma13=ent1+ent3;

		if (suma12==ent1)
				System.out.println("Iguales.");
			else if (suma23==ent1)
					System.out.println("Iguales.");
				else if (suma13==ent1)
						System.out.println("Iguales.");
					else if (suma12==ent2)
							System.out.println("Iguales.");
						else if (suma23==ent2)
								System.out.println("Iguales.");
							else if (suma13==ent2)
									System.out.println("Iguales.");
								else if (suma12==ent3)
										System.out.println("Iguales.");
									else if (suma23==ent3)
											System.out.println("Iguales.");
										else if (suma13==ent3)
												System.out.println("Iguales.");
											else
													System.out.println("Distintos.");
	}//main
}//class