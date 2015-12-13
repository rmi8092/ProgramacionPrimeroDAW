package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
*
* Clase AreaCirculo. La fórmula del área un círculo es pi*r2,
* siendo r el radio del círculo. Calcula y muestra de forma iterativa.
*
* @author Rafa Miranda
* @version 1.0
*/

public class AreaCirculo{
	public static void main (String[]args){
		int r;
		double a;

		do{
		System.out.println("\nIntroduce el radio de tu circulo: ");
		r = Teclado.leerEntero();

		a = areaCirculo(r);

		System.out.println("\nEl area de tu circulo es: "+a);
		}while (deseaContinuar());
	}

	static double areaCirculo(int r){
	return Math.PI*r*r;
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
