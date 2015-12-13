package listadoBasico2;

/**
* Define la clase TablaDeMultiplicar. Muestra la tabla de multiplicar.
* Para ello, solicita el factor al usuario. Sólo se admiten la tabla
* de multiplicar de los número 1, 2... 12 (solicitud repetitiva).
* @author Rafa Miranda
* @version 1.0
*/

public class TablaDeMultiplicar{
	private static java.util.Scanner scanner;

	public static void main (String[]args){

		scanner = new java.util.Scanner(System.in);
		int factor;
		int multiplo;
		int tabla;
		
		while (true){

			System.out.println("\nIntroduce un entero del 1 al 12. Yo te dare su "+
				"tabla de multiplicar hasta 10: \n0 PARA SALIR.");
			factor = scanner.nextInt();
			if (factor==0)
				break;
			if (factor>0 && factor<13){
				System.out.println("\nTu tabla de multiplicar es: ");
				for (multiplo=0;multiplo<11;multiplo++){
					tabla=factor*multiplo;
					System.out.println("\t"+factor+"\tx"+"\t"+multiplo+"\t=\t"+tabla);
				}//for
			}//if
			else {
				System.out.println("ERROR. Su numero esta fuera de rango.");		
			}//else
		}//while
		System.out.println("Adios.");
	}//main
}//class