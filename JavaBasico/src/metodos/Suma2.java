package metodos;

import utiles.Teclado;

/**
* Define la clase Suma2 que realice una suma y la muestre. Para ello implementa el 
* método sumar que devuelva la suma de dos números, solicitados por teclado. 
*
* @author Rafa Miranda
* @version 1.0
*/

public class Suma2{
	public static void main (String[]args){
		int num1, num2, suma;

		System.out.println("\nIntroduce dos numeros y yo los sumare: ");
		num1 = Teclado.leerEntero();
		num2 = Teclado.leerEntero();

		suma = sumar(num1, num2);

		System.out.println("\nLa suma de tus numeros es: "+suma);
	}

	/**
	* Devuelve la suma de dos enteros
	*
	* @param sum1 Primer sumando
	* @param sum2 Segundo sumando
	* @return Resultado de la suma
	*/
	static int sumar(int num1, int num2){
		return num1+num2;
	}
}