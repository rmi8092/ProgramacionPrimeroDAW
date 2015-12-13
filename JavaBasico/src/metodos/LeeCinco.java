package metodos;

import utiles.Teclado;

/**
* Define la clase LeeCinco que lea cinco valores numéricos y calcule su producto.
* Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos
* (deseaContinuar, leerCincoNumeros, System.out.println(El producto es: + calcularResultado()…).
*
* @author Rafa Miranda
* @version 1.0
*/

public class LeeCinco{
	public static void main (String[]args){
		
		do{
			int n=0, c=0, res=1;
			System.out.println("\nDame cinco numero y los multiplicare.");
			while (c<5){
				n = leerCincoNumeros(n);
				c++;
				res = calcularResultado(n,res);
			}
			System.out.println("\nEl producto es: "+res);
		}while(deseaContinuar());
	}

	/**
	* Metodo para controlar si queremos repetir o no nuestro programa.
	*
	* @param n es cada uno de los numeros que queremos multiplicar.
	* @return el numero introducido.
	*/
	static int leerCincoNumeros(int n){
		return Teclado.leerEntero();
	}

	/**
	* Metodo para controlar si queremos repetir o no nuestro programa.
	*
	* @param n es cada uno de los numeros que queremos multiplicar.
	* @param res es el resultado de la multiplicacion.	
	* @return el resultado de la multiplicacion.
	*/
	static int calcularResultado(int n, int res){
		return res *= n;
	}

	/**
	* Metodo para controlar si queremos repetir o no nuestro programa.
	*
	* @param respuesta si (S) o no (N).
	* @return Booleano true o false.
	*/
	static boolean deseaContinuar(){
		char resp;
		System.out.println("\nQuiere repetir el programa? (s,n).");
		resp = Character.toUpperCase(Teclado.leerCaracter());
		return resp=='S'?true:false;
	}
}