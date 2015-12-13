/**
 * Crea una clase CreaMatriz que solicite al usuario el tamaño de una nueva matriz
 * y que le pida los enteros necesarios para inicializarlo. Utiliza los métodos
 * pedirFila(), pedirColumna() y pedirDatos(int[]).
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class CreaMatriz {
	public static void main (String[]args){
		
		int[][]matriz = new int [pedirFila("Digame los elementos de cada fila.")]
				[pedirColumna("Digame los elementos de cada columna.")];
		pedirDatos(matriz);
	}
	
	static int pedirFila(String cadena){
		int fila;
		fila=Teclado.leerEntero(cadena);
		return fila;
	}
	
	static int pedirColumna(String cadena){
		int columna;
		columna=Teclado.leerEntero(cadena);
		return columna;
	}
	
	static int[][] pedirDatos(int[][]matriz){
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				matriz[i][j] = Teclado.leerEntero("Deme el dato para la posicion "+i+"-"+j);
			}
		}
		return matriz;
	}
}
