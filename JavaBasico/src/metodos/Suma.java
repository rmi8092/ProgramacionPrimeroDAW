package metodos;

import utiles.Teclado;

/**
* Define la clase Suma que realice una suma y la muestre. Para ello implementa
* el método sumar con los dos argumentos que sean los sumandos. Ha de devolver su suma.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Suma{
	public static void main (String[]args){
		int suma;

		suma = sumar();

		System.out.println("\nLa suma de tus numeros es: "+suma);
	}

	/**
	* Devuelve la suma de dos enteros
	*
	* @param sum1 Primer sumando
	* @param sum2 Segundo sumando
	* @return Resultado de la suma
	*/
	static int sumar(){
		System.out.println("\nIntroduce dos numeros y yo los sumare: ");
		int num1, num2;
		num1 = Teclado.leerEntero();
		num2 = Teclado.leerEntero();
		return num1+num2;
	}
}