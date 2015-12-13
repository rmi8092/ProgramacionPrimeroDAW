package listadoBasico3;

/**
* Define la clase EsPositivoNegativo que pide repetidas veces un
* entero por teclado e indica si es positivo o negativo. En caso
* de ser cero, se sale del programa diciendo adiós. Crea tres versiones
* con las tres estructuras repetitivas y utilizando la sentencia break.
*
* @author Rafa Miranda
* @version 1.0
*/

public class EsPositivoNegativo{
	private static java.util.Scanner scanner;

	public static void main (String[]args){
		scanner = new java.util.Scanner(System.in);
		int numero;

		while (true){
			System.out.println("\nEste bucle es con While:");
			System.out.println("\nDame un numero y te dire si es positivo o negativo. Si es cero "+
				"saldre del programa.");
			numero=scanner.nextInt();
			if (numero>0)
					System.out.println("Positivo.");
				else{
					if (numero<0)
						System.out.println("Negativo.");
					else{
							System.out.println("Adios.");
							break;
					}//else
				}//else
		}//while
		do{
			System.out.println("\nEste bucle es con Do...While:");
			System.out.println("\nDame un numero y te dire si es positivo o negativo. Si es cero "+
				"saldre del programa.");
			numero=scanner.nextInt();
			if (numero>0)
					System.out.println("Positivo.");
				else{
					if (numero<0)
						System.out.println("Negativo.");
					else{
							System.out.println("Adios.");
							break;
					}//else
				}//else
		}while(true);
		for (numero=1;numero>0;numero++){
			System.out.println("\nEste bucle es con For:");
			System.out.println("\nDame un numero y te dire si es positivo o negativo. Si es cero "+
				"saldre del programa.");
			numero=scanner.nextInt();
			if (numero>0)
					System.out.println("Positivo.");
				else{
					if (numero<0)
						System.out.println("Negativo.");
					else{
							System.out.println("Adios.");
							break;
						}
				}
		}
	}
}