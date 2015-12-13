/**
 * Muestra el manejo de arrays.
 * Define la clase AsignandoArrays tal y como muestra la captura.
 * Indica en un comentario lo que almacenar�a la referencia a1 tras modificarse a2.
 * A�ade tambi�n los siguientes comentarios en las l�neas correspondientes:
 * a. se referencia al mismo objeto
 * b. modificaci�n de los elementos
 * c. declaraci�n de un array
 * d. se muestran los elementos del objeto array
 * e. declaraci�n, construcci�n e inicializaci�n de un array
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

public class AsignandoArrays {
	/**
	 * Declara, construye, inicializa y muestra arrays.
	 */
	public static void main (String[]args){
		int[]a1={3,5,7,11,13}; // Declaraci�n, construcci�n e inicializaci�n de un array.
		int[]a2; // Declaraci�n de un array.
		int i;
		
		a2=a1; // Iguala la referencia a objeto, a2 referenciar� al objeto 1.
		
		for(i=0; i<a2.length; i++)
			a2[i]++; // Al modificarse a2 se modifica tambien a1 (linea 27).
		
		for(i=0; i<a1.length; i++)
			System.out.println("a1["+i+"]="+a1[i]); // Se muestran los elementos del objeto array
	}
}
