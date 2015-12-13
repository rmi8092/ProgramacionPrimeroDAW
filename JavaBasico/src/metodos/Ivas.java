package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
*
* Clase Ivas. El iva es un impuesto aplicable al consumo en la CEE.
* En España hay tres tipos de ivas: superreducido 4%, reducido 10% y
* general 21%. Calcula y muestra de forma iterativa.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Ivas{
	public static void main (String[]args){
		double precio, iva1, iva2, iva3;

		do{
		System.out.println("\nIntroduce un precio y te dare el total con los tres tipos de ivas: ");
		precio = Teclado.leerEntero();

		iva1 = superreducido(precio);
		iva2 = reducido(precio);
		iva3 = general(precio);

		System.out.println("\nEl precio con iva superreducido aplicado es: "+iva1+" euros.");
		System.out.println("El precio con iva reducido aplicado es: "+iva2+" euros.");
		System.out.println("El precio con iva general aplicado es: "+iva3+" euros.");
		}while (deseaContinuar());
	}
	static double superreducido(double precio){
	return precio*1.04;
	}	
	static double reducido(double precio){
	return precio*1.10;
	}
	static double general(double precio){
	return precio*1.21;
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