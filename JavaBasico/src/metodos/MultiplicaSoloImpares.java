package metodos;

import utiles.Teclado;

/**
* Define la clase MultiplicaSoloImpares que multiplique 20 números impares
* leídos desde teclado y muestre el resultado en pantalla. Define al menos
* los métodos mostrarInstrucciones y leerImpar.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MultiplicaSoloImpares{
	public static void main (String[]args){
		int num, c=0;
		long res=1; 
		
		mostrarInstrucciones();

		do{
			num = leerImpar();
			if(num%2!=0){	
				res = multiplicaImpares(res,num);
				c++;
			}
		}while(c<20);
		
		System.out.println("\nEl resultado de multiplicar los 20 primeros impares es: "+res);
	}

	/**
	* Muestra en pantalla las instrucciones del programa.
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduce numeros y multiplicare solo los 20 primeros "+
			"impares que me hayas dado.");
	}
	
	/**
	* Lee solo los numeros impares de todos los introducidos.
	*
	* @return El numero impar introducido por teclado.
	*/
	static int leerImpar(){
		int num;
			do{
				num = Teclado.leerEntero();
			}while(num%2==0);
		return num;
	}

	/**
	* Lee solo los numeros impares de todos los introducidos.
	*
	* @param res es la variable a la que se le asignara el resultado de las multiplicaciones.
	* @param num es el numero introducido
	* @return Devuelve el resultado de las sucesivas multiplicaciones.
	*/
	static long multiplicaImpares(long res, int num){
		return res *= num;
	}
}