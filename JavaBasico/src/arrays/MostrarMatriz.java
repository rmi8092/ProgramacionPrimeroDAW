/**
 * Crea una clase MostrarMatriz que solicite al usuario el tamaño de una
 * nueva matriz y que le pida los enteros necesarios para inicializarla.
 * Utiliza los métodos pedirFila(), pedirColumna(), pedirDatos(int[]) y mostrarMatriz();
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MostrarMatriz {
	public static void main (String[]args){
				
		int[][]matriz = new int [pedirFila("Digame el numero de filas:")]
				[pedirColumna("Digame el numero de columnas:")];
		pedirDatos(matriz);
		mostrarMatriz(matriz,"Su matriz es:");
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
	
	static void mostrarMatriz(int[][]matriz, String cadena){
		System.out.println(cadena);
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
