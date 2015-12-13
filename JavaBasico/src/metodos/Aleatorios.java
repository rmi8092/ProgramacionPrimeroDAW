package metodos;

import utiles.Teclado;

/**
* Define la clase Aleatorios que de forma repetitiva muestre un número
* aleatorio entre un mínimo y un máximo. Define el método generarAleatorio(min, max).
*
* @author Rafa Miranda
* @version 1.0
*/

public class Aleatorios{
	public static void main (String[]args){
		int min, max;
		double aleatorio;

		System.out.println("\nIntroduce el minimo y maximo entre los "+
			"que mostrar numeros aleatorios.");
			min = Teclado.leerEntero();
			max = Teclado.leerEntero();
		do{
			aleatorio = generarAleatorio(min, max);
			System.out.println(aleatorio);
		}while(true);
	}

	/**
	* Devuelve numeros aleatorios entre un maximo y minimo.
	*
	* @param min El minimo establecido por usuario.
	* @param max El maximo establecido por usuario.
	* @return Resultado de multiplicar el metodo Math.Random() por la resta de nuestro maximo menos
	* 			nuestro minimo, y sumarle finalmente nuestro minimo a este parcial .
	*/
	static double generarAleatorio(double min, double max){
		double factor = max-min;	
		return (Math.random()*factor)+min;
	}
}