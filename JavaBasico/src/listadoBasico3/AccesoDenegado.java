package listadoBasico3;

/**
* Define la clase AccesoDenegado que simule el acceso a un sitio en función de dos 
* valores introducidos por el usuario: edad del usuario y autorización paterna. Sólo 
* aparecerá el mensaje "Bienvenido" si el usuario es mayor de edad o si siendo menor 
* de edad tiene la autorización paterna. En cualquier otro caso, que muestre "Acceso 
* denegado".
*
* @author Rafa Miranda
* @version 1.0
*/

public class AccesoDenegado{
	private static java.util.Scanner scanner;

	public static void main (String[]args){
		scanner = new java.util.Scanner(System.in);
		int edad;
		boolean autorizacionPadre;

		System.out.println("Introduce tu edad: ");
		edad = scanner.nextInt();

		if (edad>17)
			System.out.println("Bienvenido.");
		else{
			System.out.println("Introduce si tienes autorización paterna (true/false): ");
			autorizacionPadre = scanner.nextBoolean();
			if (autorizacionPadre)
					System.out.println("Bienvenido.");
			else
					System.out.println("Acceso denegado.");
		}//else
	}//main
}//class