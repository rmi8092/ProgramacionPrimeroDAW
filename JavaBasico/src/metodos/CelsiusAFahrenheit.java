package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
* 
* Clase CelsiusAFahrenheit. En los EEUU sigue utilizándose los grados Fahrenheit
* para la medición de la temperatura. Solicita los datos al usuario por teclado
* para averiguar su correspondencia en grados Fahrenheit.
*
* @author Rafa Miranda
* @version 1.0
*/

public class CelsiusAFahrenheit{
	public static void main (String[]args){
		double cel, fah;

		do{
		System.out.println("\nIntroduce los celsius a convertir a fahrenheit: ");
		cel = Teclado.leerEntero();

		fah = fahrenheit(cel);

		System.out.println("\nLos celsius equivalen a: "+fah+" fahrenheit.");
		}while (deseaContinuar());
	}

	static double fahrenheit(double cel){
	return (1.8*cel)+32;
	}
	
	static boolean deseaContinuar(){
	char resp;
		do{
		System.out.println("\nDesea continuar? (s,S/n,N)");
		resp=Teclado.leerCaracter();
		} while (!((resp=='s')||(resp=='n')||(resp=='S')||(resp=='N')));
			if (resp=='s'||resp=='S')
				return true;
			else
				return false;
	}
}