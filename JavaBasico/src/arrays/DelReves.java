/**
 * Crea una clase DelReves que implemente el m�todo mostrarDelReves(int []).
 * Se le pasar� como argumento un vector de enteros inicializado mediante
 * llaves. Mostrar� dicho vector del rev�s.
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
