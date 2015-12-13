/**
 * Define la clase MatrizDecimales2 basada en la clase anterior. Se ha de inicializar
 * con valores aleatorios (solicita al usuario el mínimo y el máximo de los valores).
 * Ha de localizar los valores máximo, mínimo y media de la matriz. Que muestre tanto
 * los valores como la posición que ocupan en la matriz. Utiliza los métodos pedirFila(),
 * pedirColumna(), pedirMínimo(), pedirMaximo(), crearMatriz(), mostrarMatriz(double[][]),
 * hallarMedia(double[][]).
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MatrizDecimales2 {
	public static void main (String[]args){		
		double[][]matriz=new double[pedirFila("Numero de filas:")][pedirColumna("Numero de columnas:")];
		IniciarMatriz(matriz,pedirMaximo("Valor maximo:"),pedirMinimo("Valor minimo:"));
		mostrarMatriz(matriz);
		hallarMedia(matriz);
	}
	
	static int pedirFila(String cadena){		
		int fila=0;
		do{
			fila=Teclado.leerEntero(cadena);
		}while(fila<1);
		return fila;
	}
	
	static int pedirColumna(String cadena){		
		int columna=0;
		do{
			columna=Teclado.leerEntero(cadena);
		}while(columna<1);
		return columna;
	}
	
	static int pedirMinimo(String cadena){
		int min=0;
		do{
			min=Teclado.leerEntero(cadena);
		}while(min<0);
		return min;
	}
	
	static int pedirMaximo(String cadena){
		int max=0;
		do{
			max=Teclado.leerEntero(cadena);
		}while(max<0);
		return max;
	}
	
	static double[][] IniciarMatriz(double[][]matriz, int max, int min){
		System.out.println("\nLos elementos de tu matriz son: ");
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				matriz[i][j]=(Math.random()*(max-min)+min);
			}
		}
		return matriz;
	}
	
	static void mostrarMatriz(double[][]matriz){
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	static void hallarMedia(double[][]matriz){
		double total=0, valmax=matriz[0][0], valmin=matriz[0][0];
		int i=0, j=0, posmaxA=0, posmaxB=0, posminA=0, posminB=0;
		
		for (i=0; i<matriz.length; i++){
			for (j=0; j<matriz[i].length; j++){
				total+=matriz[i][j];
				if(valmax<matriz[i][j]){
					valmax=matriz[i][j];
					posmaxA=i;
					posmaxB=j;
				}
				if(valmin>matriz[i][j]){
					valmin=matriz[i][j];
					posminA=i;
					posminB=j;
				}
			}
		}
		System.out.println("La media de la matriz es: "+total/(i*j));
		System.out.println("El valor maximo de la matriz es: "+valmax+
		" y está en la posicion: "+posmaxA+"-"+posmaxB);
		System.out.println("El valor minimo de la matriz es: "+valmin+
		" y está en la posicion: "+posminA+"-"+posminB);
	}
}

