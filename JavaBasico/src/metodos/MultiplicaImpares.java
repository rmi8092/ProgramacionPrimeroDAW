package metodos;

/**
* Define la clase MultiplicaImpares que multiplique los 20 primeros
* números impares y muestre el resultado en pantalla.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MultiplicaImpares{
	public static void main (String[]args){
		int n, res=1;

		System.out.println("\nVoy a multiplicar los 20 primeros numeros impares.");
		
			for(n=1;n<21;n+=2){
				if (esImpar(n))
					res *= n;
			}
		System.out.println("\nEl resultado es: "+res);
	}

	/**
	* Booleano para saaber si nuestro entero es par o impar.
	*
	* @param entero objeto de asignar como par o impar.
	* @return Devuelve true si es impar o false si es par.
	*/
	static boolean esImpar(int n){
		return (n%2)!=0?true:false;
	}
}