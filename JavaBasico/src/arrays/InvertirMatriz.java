/**
 * Define la clase TraspuestaMatriz que invierta una matriz de enteros.
 * Se piden las dimensiones y toma valores aleatorios entre 1 y 10.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class InvertirMatriz {
	public static void main (String[]args){
		
		int filas = pedirDimension("Dame las filas: ");
		int columnas = pedirDimension("Dame las columnas: ");
		int[][]matriz = crearMatriz(filas,columnas);
		mostrarMatriz(matriz,"Su matriz es:");
		int[][]nuevamatriz = cambiarMatriz(matriz,filas,columnas);
		mostrarMatriz(nuevamatriz,"Su nueva matriz es:");
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
	
	static int[][] cambiarMatriz(int[][]matriz, int filas, int columnas){
		int[][]nuevamatriz = new int[columnas][filas];
		for (int i=0; i<nuevamatriz.length; i++){
			for (int j=0; j<nuevamatriz[i].length; j++) {
				nuevamatriz[i][j]=matriz[j][i];
			}
		}
	return nuevamatriz;
	}
	
	static void mostrarMatriz (int[][]nuevamatriz, String cadena){
		System.out.println(cadena);
		for (int i=0; i<nuevamatriz.length; i++){
			for (int j=0; j<nuevamatriz[i].length; j++){
				System.out.print(nuevamatriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
