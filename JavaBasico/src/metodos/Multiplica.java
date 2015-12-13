package metodos;

import utiles.Teclado;

/**
* Define la clase Multiplica que realice de forma repetitiva multiplicaciones
* y las muestre, siempre y cuando el usuario responda afirmativamente a la pregunta:
* ¿Desea continuar? (s/n). Para ello utiliza un método continuar
* (ejercicio anterior) e implementa también el método multiplicar con los dos
* argumentos que sean los factores. Ha de devolver su producto.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Multiplica{
	public static void main (String[]args){
		char resp;
		int num1, num2, mult;

		do{
			System.out.println("\nIntroduzca dos numeros y los multiplicare: ");
			num1 = Teclado.leerEntero();
			num2 = Teclado.leerEntero();
			mult = multiplicar(num1, num2);
			System.out.println("\nEl resultado de su multiplicacion es: "+mult);
			
			System.out.println("\nDesea continuar? (s/n)");
			resp = Character.toUpperCase(Teclado.leerCaracter());
		}while(continuar(resp));
	}

	/**
	* Devuelve la multiplicacion de dos enteros
	*
	* @param num1 Primer factor
	* @param num2 Segundo factor
	* @return Resultado de la multiplicacion
	*/	
	static int multiplicar(int num1, int num2){
		return num1*num2;
	}

	/**
	* Devuelve true o false en función de si se desea continuar o no.
	*
	* @param respuesta si (S) o no (N).
	* @return Booleano true o false.
	*/
	static boolean continuar (char resp){
		return resp=='S'?true:false;
	}
}