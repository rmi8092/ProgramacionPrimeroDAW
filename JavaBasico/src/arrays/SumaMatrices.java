/**
 * Define la clase SumaMatrices que sume dos matrices de enteros. El usuario
 * introducirá por teclado las dimensiones de las matrices (m x n).
 * Las matrices se inicializarán de forma aleatoria con enteros entre 0 y 10.
 * Se visualizarán sumandos y suma.
 */

package arrays;

import utiles.Teclado;

public class SumaMatrices {
	public static void main(String[] args){
		int filas = pedirDimension("Dame las filas: ");
		int columnas = pedirDimension("Dame las columnas: ");
		int [][] sumando1 = crearMatriz(filas, columnas);
		mostrar(sumando1, "MATRIZ 1: ");
		int [][] sumando2 = crearMatriz (filas, columnas);
		mostrar(sumando2, "MATRIZ 2: ");
		int [][] suma = sumar (sumando1, sumando2);
		mostrar(suma, "MATRIZ SUMA: ");
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
	
	static void mostrar (int[][]sumando, String cadena){
		System.out.println("\n"+cadena);
		for (int i=0; i<sumando.length; i++){
			for (int j=0; j<sumando[i].length; j++){
				System.out.print(sumando[i][j]+"\t");
			}
		}
	}
	
	static int[][] sumar (int[][]sumando1, int[][]sumando2){
		int[][]suma = new int[sumando1.length][sumando1.length];
		for (int i=0; i<sumando1.length; i++){
			for (int j=0; j<sumando1[i].length; j++){
				suma[i][j] = sumando1[i][j]+sumando2[i][j];
			}
		}
		return suma;
	}
}
