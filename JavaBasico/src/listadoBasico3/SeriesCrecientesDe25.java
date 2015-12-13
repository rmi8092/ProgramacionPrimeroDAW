package listadoBasico3;

/**
* Define la clase SeriesCrecientesDe25. Utilizando las tres estructuras
* de repetición (while, do while y for) genera la serie del 0 al 1000
* con un incremento de 25 (ambos incluídos).
*
* @author Rafa Miranda
* @version 1.0
*/

public class SeriesCrecientesDe25{
	public static void main (String[]args){
		int n=0;

		System.out.println("\nLa serie del 0 al 1000 con incrementos de 25 es: ");
		System.out.println("\nCon While: ");
			while (n>=0 && n<1001){
				System.out.println("\t"+n);
				n+=25;
			}//while

		System.out.println("\nCon Do... While: ");
		n=0;
			do {
				System.out.println("\t"+n);
				n+=25;
			} while (n>=0 && n<1001);
			
		System.out.println("\nCon For: ");
			for (n=0;(n>=0 && n<1001); n+=25)
				System.out.println("\t"+n);
	}//main
}//class