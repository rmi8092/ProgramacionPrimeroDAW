package metodos;

import utiles.Teclado;

/**
* Define la clase Potencia que calcule y visualice la potencia de un número
* dada la base y el exponente. Se le preguntará al usuario si quiere repetir
* el programa. Utiliza métodos (deseaContinuar, mostrarInstrucciones…).
*
* @author Rafa Miranda
* @version 1.0
*/

public class Potencia{
	public static void main (String[]args){
		int b=0, e=0;

		mostrarInstrucciones();
		
		do{
			b = Teclado.leerEntero();
			e = Teclado.leerEntero();
			System.out.println("La potencia resultante es: "+calculoPotencia(b, e));
		}while (deseaContinuar());

	}

	/**
	* Muestra en pantalla las instrucciones del programa.
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduce numeros (primero la base y luego el exponente)"+
			" y te mostrare la potencia resultante. ");
	}

	/**
	* Muestra en pantalla las instrucciones del programa.
	*
	* @param b es la base de la potencia.
	* @param e es el exponente de la operacion.
	* @return Potencia de b elevado a e.
	*/
	static double calculoPotencia(int b, int e){
		return Math.pow(b, e);
	}
	
	/**
	* Devuelve true o false en función de si se desea continuar o no.
	*
	* @return Booleano true o false.
	*/
	static boolean deseaContinuar(){
		System.out.println("\nDesea continuar? (s/n)");
		char resp = Character.toUpperCase(Teclado.leerCaracter());
	return resp=='S'?true:false;
	}
}