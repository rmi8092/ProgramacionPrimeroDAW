/**
 * Define la clase MatrizDecimales que cree una matriz de decimales.
 * Pide las dimensiones (filas y columnas). Se inicializa con valores
 * aleatorios entre 1 y 100 y visualiza el array.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MatrizDecimales {
	public static void main (String[]args){		
		
		mostrarMatriz(inicializarMatriz(crearMatriz(pedirDimensionFila("Numero de filas"),pedirDimensionColumna("Numero de columnas"))));
	}
	
/**
 * M�todo con el que recogemos el numero de filas de la matriz.
 * @param cadena Cadena de caracteres a modo instrucci�n para usuario.
 * @return numero de filas de la matriz 
 */
	
	static int pedirDimensionFila(String cadena){		
		int fila=0;
		do{
			fila=Teclado.leerEntero(cadena);
		}while(fila<1);
		return fila;
	}
	
/**
 * M�todo con el que recogemos el numero de columnas de la matriz.
 * @param cadena Cadena de caracteres a modo instrucci�n para usuario.
 * @return numero de columnas de la matriz 
 */
	
	static int pedirDimensionColumna(String cadena){		
		int columna=0;
		do{
			columna=Teclado.leerEntero(cadena);
		}while(columna<1);
		return columna;
	}

/**
 * M�todo con el que creamos nuestra matriz con el numero de filas y columnas seleccionado.
 * @param fila Numero de filas de la matriz.
 * @param columna Numero de columnas de la matriz.
 * @return matriz creada
 */
	
	static double[][] crearMatriz(int fila, int columna){
		double[][]matriz=new double[fila][columna];
		return matriz;
	}

/**
 * M�todo con el que asignamos valores a nuestra matriz.
 * @param matriz Matriz creada anteriormente.
 * @return matriz inicializada con todos sus valores.
 */
	
	static double[][] inicializarMatriz(double[][]matriz){
		System.out.println("\nLos elementos de tu matriz son: ");
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				matriz[i][j]=Math.rint((Math.random()*(100)+1)*100)/100;
			}
		}
		return matriz;
	}

/**
 * M�todo con el que mostramos nuestra matriz.
 * @param matriz Matriz creada e inicializada anteriormente.
 */
	static void mostrarMatriz(double[][]matriz){
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
