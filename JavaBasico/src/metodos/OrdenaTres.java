package metodos;

import utiles.Teclado;

/**
* Define la clase OrdenaTres que ordene tres números enteros introducidos
* por teclado y los muestre por pantalla de forma decreciente. Se le
* preguntará al usuario si quiere repetir el programa. Utiliza métodos
* (deseaContinuar, leerTresEnteros, mostrarResultados…).
*
* @author Rafa Miranda
* @version 1.0
*/

public class OrdenaTres{
	public static void main (String[]args){
		
		do{
			int a=0, b=0, c=0;
			System.out.println("\nDame tres numeros y los ordenare de manera decreciente.");
			a = leerTresEnteros(a,b,c);
			b = leerTresEnteros(a,b,c);
			c = leerTresEnteros(a,b,c);

			System.out.println("\nTus numeros ordenados decrecientemente son: ");
			mostrarResultados(a,b,c);
		}while (deseaContinuar());
	}

	/**
	* Metodo tomar por teclado tres numeros enteros.
	*
	* @param a Es el primer numero entero.
	* @param b Es el segundo numero entero.
	* @param c Es el tercer numero entero.
	* @return devuelve el valor del numero introducido.
	*/
	static int leerTresEnteros(int a, int b, int c){
		return Teclado.leerEntero();
	}
	
	/**
	* Metodo para conseguir y mostrar el orden decreciente de los numeros. 
	*
	* @param a primer numero introducido.
	* @param b segundo numero introducido.
	* @param c tercer numero introducido.		
	* @return No devuelve nada, solo sale del metodo.
	*/
	static void mostrarResultados(int a, int b, int c){
		if ((a>b)&&(a>c)){
			if (b>c)
				System.out.println("\n "+a+" > "+b+" > "+c);
			else
				System.out.println("\n "+a+" > "+c+" > "+b);
		}
		else if ((a<b)&&(a<c)){
			if (b>c)
				System.out.println("\n "+b+" > "+c+" > "+a);
			else
				System.out.println("\n "+c+" > "+b+" > "+a);
		}
		else if ((b>a)&&(a>c))
			if (b>c)
				System.out.println("\n "+b+" > "+a+" > "+c);
			else
				System.out.println("\n "+c+" > "+a+" > "+b);
	return;
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