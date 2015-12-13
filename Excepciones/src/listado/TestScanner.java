package listado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author rafael miranda ibañez
 */

public class TestScanner {
/**
* Probando la clase Scanner
*
* @param args
*/
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean continuar = false;
		do{
			System.out.println("Introduce un entero: ");
			try{
				System.out.println(scanner.nextInt());
				return;
				//continuar = false;
			} catch (InputMismatchException e){
				System.err.println("no");
				scanner.nextLine();
				continuar=true;
			}
		}while(continuar);
	}
}
