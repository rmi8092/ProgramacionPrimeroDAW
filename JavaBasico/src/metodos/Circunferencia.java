package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
*
* Clase  Circunferencia. La fórmula de la circunferencia de un
* círculo es 2*pi*r, siendo r el radio del círculo. Calcula y muestra
* la circunferencia de un círculo. Calcula y muestra de forma iterativa.
* 
* @author Rafa Miranda
* @version 1.0
*/

public class Circunferencia{
	public static void main (String[]args){
		int r;
		double c;

		do{
		System.out.println("\nIntroduce el radio de tu circunferencia: ");
		r = Teclado.leerEntero();
		
		c = circunferencia(r);

		System.out.println("\nLa circunferencia de tu circulo es: "+c);
		}while (deseaContinuar());
	}
	
	static double circunferencia(int r){
	return 2*Math.PI*r;
	}

	static boolean deseaContinuar(){
	char resp;
		do{
		System.out.println("\nDesea continuar? (s,S/n,N)");
		resp = Teclado.leerCaracter();
		}while (!((resp=='s')||(resp=='S')||(resp=='n')||(resp=='N')));
			if (resp=='s'||resp=='S')
				return true;
			else
				return false;
	}
}