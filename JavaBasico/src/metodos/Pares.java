package metodos;

import utiles.Teclado;

/**
* Define la clase Pares que de forma repetitiva indique si un
* número es par o impar. Define el método esPar(int).
*
* @author Rafa Miranda
* @version 1.0
*/

public class Pares{
	public static void main (String[]args){
		int n;
		boolean p;

		do{
			System.out.println("\nIntroduce un numero y te dire si es par o no.");
			n = Teclado.leerEntero();
			p = esPar(n);
			if (p)
				System.out.println("El numero "+n+" es par.");
			else
				System.out.println("El numero "+n+" es impar.");
		}while(true);
	}

	/**
	* Controla si el entero objeto es par o impar.
	*
	* @param n Entero objeto.
	* @return Devuelve true si es un numero par y false en caso contrario.
	*/
	static boolean esPar(int n){
		return (n%2)==0?true:false;
	}
}