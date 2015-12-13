/**
 * Crea una clase DelReves que implemente el método mostrarDelReves(int []).
 * Se le pasará como argumento un vector de enteros inicializado mediante
 * llaves. Mostrará dicho vector del revés.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

public class DelReves {
	public static void main (String[]args){
		int[] enteros = {1,2,3,4,5};
		
		mostrarDelReves(enteros);
	}
	
	public static void mostrarDelReves(int[] enteros){
		for (int i=enteros.length-1; i>-1; i--)
			System.out.print(enteros[i]);
	}
}
