/**
 * Define la clase MultiplicaMatrices que multiplique dos matrices de enteros.
 * El usuario introducirá por teclado las dimensiones de las matrices (m x n, n x o).
 * Las matrices se inicializarán de forma aleatoria con enteros entre 1 y 10.
 * Se visualizarán factores y resultado.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MultiplicaMatrices {
	public static void main (String[]args){
		int filas1 = pedirDimension("Dame las filas de la primera matriz: ");
		int columnas1 = pedirDimension("Dame las columnas de la primera matriz: ");
		int [][] factor1 = crearMatriz(filas1, columnas1);
		mostrar(factor1, "MATRIZ 1: ");
		int filas2 = columnas1;
		int columnas2 = pedirDimension("Dame las columnas de la segunda matriz: ");
		int [][] factor2 = crearMatriz (filas2, columnas2);
		mostrar(factor2, "MATRIZ 2: ");
		int [][] producto = multiplicar (factor1,factor2,filas1,columnas2);
		mostrar(producto, "MATRIZ PRODUCTO: ");
	}

	static int pedirDimension (String cadena){		
		int dim=0;
		do{
			dim=Teclado.leerEntero(cadena);
		}while(dim<1);
		return dim;
	}
	
	static int[][] crearMatriz (int filas, int columnas){
		int[][]matriz = new int[filas][columnas];
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*11);
			}
		}	
		return matriz;
	}
	
	static void mostrar (int[][]factor, String cadena){
		System.out.println("\n"+cadena);
		for (int i=0; i<factor.length; i++){
			for (int j=0; j<factor[i].length; j++){
				System.out.print(factor[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	static int[][] multiplicar (int[][]factor1, int[][]factor2, int filas1, int columnas2){
		int[][]producto = new int[filas1][columnas2];
		for (int i=0; i<factor1.length; i++){
			for (int j=0; j<factor2[i].length; j++){
				for (int k=0; k<factor1[i].length; k++) {
					producto[i][j] += factor1[i][k]*factor2[k][j];
				}
			}
		}
		return producto;
	}
}
