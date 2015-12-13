package metodos;

import utiles.Teclado;

/**
* Define la clase DeseaContinuar que realice la siguiente pregunta:
* ¿Desea continuar? (s/n). En caso de que el usuario indique una
* s (minúscula o mayúscula) el programa seguirá preguntando. En otro caso,
* que se salga del programa. Para ello implementa el método continuar
* que devuelva true en caso de introducir una s, y false en caso contrario.
*
* @author Rafa Miranda
* @version 1.0
*/

public class DeseaContinuar{
	public static void main (String[]args){
		char resp;

		do{
			System.out.println("\nDesea continuar? (s/n)");
			resp = Character.toUpperCase(Teclado.leerCaracter());
		}while(continuar(resp));
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