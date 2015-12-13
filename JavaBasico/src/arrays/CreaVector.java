/**
 * Crea una clase CreaVector que solicite al usuario el tamaño de
 * un nuevo vector y que le pida los enteros necesarios para inicializarlo.
 * Utiliza los métodos pedirDimension() y pedirDatos(int[]).
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class CreaVector {
	public static void main (String[]args){
		int d;
		
		d=pedirDimension();
		int[]vector=new int[d];
		pedirDatos(vector);
		for (int i = 0; i<vector.length; i++){ // para mostrar el vector en pantalla
			System.out.print(vector[i]+" ");
		}
	}
	
	static int pedirDimension(){		
		return Teclado.leerEntero("\nDame la dimension del vector que quieres crear: ");
	}
	
	static void pedirDatos(int[]vector){
		System.out.print("\nDame los enteros de tu vector: ");
		for (int i = 0; i<vector.length; i++){
			vector[i]=Teclado.leerEntero();
		}
	}
}