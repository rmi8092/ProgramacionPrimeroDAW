/**
 * Crea una clase M�nimoMatriz que solicite al usuario el tama�o de una
 * nueva matriz y que la inicialice con valores aleatorios (solicita al usuario
 * el m�nimo y el m�ximo de los valores). Hallar� el valor m�nimo de una matriz,
 * dando exactamente su posici�n fila-columna. Utiliza los m�todos pedirFila(),
 * pedirColumna(), pedirM�nimo(), pedirMaximo, mostrarMatriz(), mostrarM�nimo().
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
		inicializarMatriz(matriz,pedirMaximo("Cual ser� el valor maximo?:"),pedirMinimo("Cual ser� el valor minimo?:"));
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
		System.out.println("\n"+min+" y est� en la posici�n fila "+posicionA+" y columna "+posicionB);
	}
}
