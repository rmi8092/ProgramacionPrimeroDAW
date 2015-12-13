package metodos;

/**
* Define la clase ProductoPotencias que calcule y visualice
* el producto de las potencias de 2 entre 0 y 10.
*
* @author Rafa Miranda
* @version 1.0
*/

public class ProductoPotencias{
	public static void main (String[]args){
		int exponente=0, total=1;
		double potencia=0;

		System.out.println("Voy a mostrarte el producto de las potencias de 2 entre 0 y 10.");
		for(exponente=0;exponente<11;exponente++){
			total *= (resPotencia(exponente, potencia));
		}
			System.out.println("\t "+total);
	}

	/**
	* Queremos calcular la potencia en base 2 de una seria de exponentes entre 0 y 10.
	*
	* @param exponente es el numero entre 0 y 10 al que vamos a elevar la base 2.
	* @param potencia es el resultado de elevar la base 2 al exponente.
	* @return Devuelve el resultado de la potencia de nuestra base y los diferentes exponentes.
	*/	
	static double resPotencia(int exponente, double potencia){
		potencia = Math.pow(2,exponente);
		return potencia;
	}
}