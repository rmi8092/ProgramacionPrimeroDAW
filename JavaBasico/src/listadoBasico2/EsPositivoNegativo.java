package listadoBasico2;

/**
* Define la clase EsPositivoNegativo que pide repetidas veces un entero
* por teclado e indica si es positivo o negativo. En caso de ser cero,
* se sale del programa diciendo adiós. Crea tres versiones con las tres
* estructuras repetitivas y utilizando la sentencia break.
* @author Rafa Miranda
* @version 1.0
*/

public class EsPositivoNegativo{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		
		int numero;
		
		while (true){
			System.out.println("\nEste bucle es con While:");
			System.out.println("Introduce un numero y te dire si es"+
			" positivo o negativo. Si es cero saldre: ");
			numero=scanner.nextInt();
			if (numero>0)
				System.out.println("\nEl numero introducido es POSITIVO");
				else{
					if (numero<0)
							System.out.println("\nEl numero introducido es NEGATIVO");
						else {
							System.out.println("Adios.");
							break;
					}
				}
		}
		do {
			System.out.println("\nEste bucle es con Do...While:");
			System.out.println("Introduce un numero y te dire si es"+
			" positivo o negativo. Si es cero saldre: ");
			numero=scanner.nextInt();
			if (numero>0)
				System.out.println("\nEl numero introducido es POSITIVO");
				else{
					if (numero<0)
						System.out.println("\nEl numero introducido es NEGATIVO");
					else {
						System.out.println("Adios.");
						break;
					}
				}
		} while (true);
		
		for (int n=1; n>0; n++){
			System.out.println("\nEste bucle es con For:");
			System.out.println("Introduce un numero y te dire si es"+
			" positivo o negativo. Si es cero saldre: ");
			numero=scanner.nextInt();
			if (numero>0)
				System.out.println("\nEl numero introducido es POSITIVO");
				else{
					if (numero<0)
						System.out.println("\nEl numero introducido es NEGATIVO");
					else {
						System.out.println("Adios.");
						break;
					}
				}
		}
	}
}