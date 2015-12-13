package metodos;

import utiles.Teclado;

/**
* Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número
* de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2.
*
* @author Rafa Miranda
* @version 1.0
*/

public class CerosYUnos{
	public static void main (String[]args){
		int n, c=0;

		System.out.println("\nIntroduzca ceros y unos y le mostrare el total de ceros una vez que "+
			"finalice la secuencia introduciendo un dos.");
		do{
			n=Teclado.leerEntero();
			if (n==0)
				c++;
			else if (error(n))
				continue;
			else
				break;
		}while (n!=2);
		System.out.println("El numero total de ceros introducidos es: "+c);
	}

	/**
	* Evita que introduzcamos numeros diferentes a 0, 1 o 2.
	*
	* @param n Entero objeto introducido
	* @return Devuelve true si el entero introducido es diferente de 0, 1 o 2.
	*/
	static boolean error(int n){
		if (!((n==0)||(n==1)||(n==2)))
			System.out.println("\nEl numero introducido no es ni cero, ni uno, ni dos, introduzca un numero correcto.");
		return true;
	}
}