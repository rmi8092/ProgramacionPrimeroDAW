package metodos;

import utiles.Teclado;

/**
* Define la clase Resta que realice de forma repetitiva restas y las muestre,
* siempre y cuando el usuario responda afirmativamente a la pregunta: ¿Desea continuar? (s/n).
* Para ello utiliza un método continuar (ejercicio anterior) e implementa también
* el método restar con los dos argumentos que sean los operandos. Ha de devolver su diferencia.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Resta{
	public static void main (String[]args){

		char resp;
		int num1, num2, resta;

		do{
			System.out.println("\nIntroduzca dos numeros y los restare: ");
			num1 = Teclado.leerEntero();
			num2 = Teclado.leerEntero();
			resta = restar(num1, num2);
			System.out.println("\nEl resultado de su resta es: "+resta);
			
			System.out.println("\nDesea continuar? (s/n)");
			resp = Character.toUpperCase(Teclado.leerCaracter());
		}while(continuar(resp));
	}

	/**
	* Devuelve la resta de dos enteros.
	*
	* @param num1 Primer sumando.
	* @param num2 Segundo sumando.
	* @return Resultado de la resta.
	*/
	static int restar(int num1, int num2){
		return num1-num2;
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