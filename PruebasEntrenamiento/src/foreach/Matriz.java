/**
 * Define la clase MatrizDecimales que cree una matriz de decimales.
 * Pide las dimensiones (filas y columnas). Se inicializa con valores
 * aleatorios entre 1 y 100 y visualiza el array.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package foreach;

import utiles.Teclado;

public class Matriz {
	public static void main (String[]args){		
		
		mostrarMatriz(inicializarMatriz(crearMatriz(pedirDimensionFila("Numero de filas"),pedirDimensionColumna("Numero de columnas"))));
	}
	
/**
 * Método con el que recogemos el numero de filas de la matriz.
 * @param cadena Cadena de caracteres a modo instrucción para usuario.
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
 * Método con el que recogemos el numero de columnas de la matriz.
 * @param cadena Cadena de caracteres a modo instrucción para usuario.
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
 * Método con el que creamos nuestra matriz con el numero de filas y columnas seleccionado.
 * @param fila Numero de filas de la matriz.
 * @param columna Numero de columnas de la matriz.
 * @return matriz creada
 */
	
	static int[][] crearMatriz(int fila, int columna){
		int[][]matriz=new int[fila][columna];
		return matriz;
	}

/**
 * Método con el que asignamos valores a nuestra matriz.
 * @param matriz Matriz creada anteriormente.
 * @return matriz inicializada con todos sus valores.
 */
	
	static int[][] inicializarMatriz(int[][]matriz){
		System.out.println("\nLos elementos de tu matriz son: ");
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				matriz[i][j]=(int)Math.rint((Math.random()*(10)+1)*10)/10; // FOREACH no se puede usar para asignar o modificar, solo para leer.
			}
		}
		return matriz;
	}

/**
 * Método con el que mostramos nuestra matriz.
 * @param matriz Matriz creada e inicializada anteriormente.
 */
	static void mostrarMatriz(int[][]matriz){
		for (int[] vector : matriz){ // FOREACH: Recorre cada elemento "a" del array "matriz"
			for (int dato: vector){ // FOREACH: Recorre cada elemento "b" dentro de cada elemento "a"
				System.out.print(dato + "\t");
				// vector == 1	2	3	4
				// vector == 5	6	7	8
				// Esta seria la matriz por ejemplo. El primer for hace dos rondas, y el segundo for hace cuatro.
			}
			System.out.println("\n");
		}
	}
}
