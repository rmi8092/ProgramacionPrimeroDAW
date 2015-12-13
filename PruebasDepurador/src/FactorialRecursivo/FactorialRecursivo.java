package FactorialRecursivo;

import utiles.Teclado;

/**
* Define la clase Factorial que muestre el factorial recursivo de un número introducido
* por teclado. (Factorial (4) = 4*fact(3); Factorial (0) = 1).
*
* @author Rafa Miranda
* @version 1.0
*/

public class FactorialRecursivo{
	public static void main (String[]args){
		int n;

		do{
			System.out.println("\nIntroduce un numero y calculare su factorial.");
			n = Teclado.leerEntero();

			System.out.println("El factorial de su numero es: "+factorialRecursivo(n));
		} while(deseaContinuar());
	}

	/**
	* Metodo para calcular el factorial recursivo de un numero.
	*
	* @param n es el numero del que queremos calcular su factorial.
	* @return Resultado total del factorial.
	*/
	static int factorialRecursivo(int n){
		int total=1;
		if (n==0 || n==1)
			return total;
		else{
			total = n * factorialRecursivo(--n);
			return total;
		}
	}

	static boolean deseaContinuar(){
		char resp;
		System.out.println("\nDesea continuar? s/n.");
		resp = Character.toUpperCase(Teclado.leerCaracter());
		return resp=='S'?true:false;
	}
}
