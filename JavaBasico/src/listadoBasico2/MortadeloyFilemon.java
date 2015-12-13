package listadoBasico2;

/**
* Define la clase MortadeloYFilemon que muestre 5 veces el mensaje
* Mortadelo y Filemón. Realízalo usando el decremento y los tres
* bucles for, while y do..while.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MortadeloyFilemon{
	public static void main(String[]args){
		
		byte b=5;

		System.out.println("\nCon While: ");
		while (b>0){
		System.out.println("Mortadelo y Filemon");
		b--;
		}

		System.out.println("\nCon Do...While: ");
		b=5;
		do {
			System.out.println("Mortadelo y Filemon");
			b--;
			} while(b>0);

		System.out.println("\nCon For: ");
		for (b=5; b>0; b--){
			System.out.println("Mortadelo y Filemon");
		}
	}
}