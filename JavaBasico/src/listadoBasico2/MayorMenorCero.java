package listadoBasico2;

/**
* Define la clase MayorMenorCero que permita saber si un número leído
* por teclado es mayor, menor o igual a cero, mostrando en pantalla
* las diferentes salidas. Ha de mostrar 10 resultados.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MayorMenorCero{
	private static java.util.Scanner scanner;

	public static void main (String[]args){

		scanner = new java.util.Scanner(System.in);
		System.out.println("\nIntroduce diez numeros y te dire si son "+
			"mayores, menores o iguales que cero:");

		for(int n=1;n<11;n++){
			int num;
			num=scanner.nextInt();
				if (num<0)
						System.out.println("Este numero es menor que cero.");
					else if (num>0)
							System.out.println("Este numero es mayor que cero.");
						else
								System.out.println("Este numero es igual a cero.");
		}//for
	}//main
}//class
