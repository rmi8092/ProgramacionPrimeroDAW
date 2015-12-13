/**
 * Crea una clase MínimoMatriz que solicite al usuario el tamaño de una
 * nueva matriz y que la inicialice con valores aleatorios (solicita al usuario
 * el mínimo y el máximo de los valores). Hallará el valor mínimo de una matriz,
 * dando exactamente su posición fila-columna. Utiliza los métodos pedirFila(),
 * pedirColumna(), pedirMínimo(), pedirMaximo, mostrarMatriz(), mostrarMínimo().
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MinimoMatriz {
	public static void main (String[]args){
		
		int[][]matriz = new int [pedirFila("Digame el numero de filas:")]
				[pedirColumna("Digame el numero de columnas:")];
		inicializarMatriz(matriz,pedirMaximo("Cual será el valor maximo?:"),pedirMinimo("Cual será el valor minimo?:"));
		mostrarMatriz(matriz,"Su matriz es:");
		mostrarMinimo(matriz,"El valor minimo en la matriz es:");
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
	
	static int pedirMaximo(String cadena){
		int max;
		max=Teclado.leerEntero(cadena);
		return max;
	}
	
	static int pedirMinimo(String cadena){
		int min;
		min=Teclado.leerEntero(cadena);
		return min;
	}
	
	static int[][] inicializarMatriz(int[][]matriz, int max, int min){
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				matriz[i][j] = (int)(Math.random()*(max-min)+min);
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
			System.out.println("\n");
		}
	}
	
	static void mostrarMinimo(int[][]matriz, String cadena){
		System.out.println(cadena);
		int min=matriz[0][0], posicionA=0, posicionB=0;
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				if(matriz[i][j]<min){
					min=matriz[i][j];
					posicionA=i;
					posicionB=j;
				}
			}
		}
		System.out.println("\n"+min+" y está en la posición fila "+posicionA+" y columna "+posicionB);
	}
}
