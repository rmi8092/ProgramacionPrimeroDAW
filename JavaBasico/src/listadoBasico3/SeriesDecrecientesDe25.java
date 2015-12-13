package listadoBasico3;

/**
* Define la clase SeriesDecrecientesDe25. Utilizando las
* tres estructuras de repetición (while, do while y for)
* genera las series del 1000 al 0 con un decremento de 25 (ambos incluídos).
*
* @author Rafa Miranda
* @version 1.0
*/

public class SeriesDecrecientesDe25{
	public static void main (String[]args){
		int n=1000;

		System.out.println("\nLa serie del 1000 al 0 con decrementos de 25 es: ");
		System.out.println("\nCon While: ");
			while (n<=1000 && n>-1){
				System.out.println("\t"+n);
				n-=25;
			}//while

		System.out.println("\nCon Do... While: ");
		n=1000;
			do {
				System.out.println("\t"+n);
				n-=25;
			} while (n<=1000 && n>-1);
			
		System.out.println("\nCon For: ");
			for (n=1000;(n<=1000 && n>-1); n-=25)
				System.out.println("\t"+n);
	}//main
}//class