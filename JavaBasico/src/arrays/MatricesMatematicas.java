/**
 * Entrega la clase MatricesMatemáticas. Mediante un menú te permitirá realizar
 * la suma, resta, multiplicación y traspuesta de un array matemático de enteros. 
 * El usuario podrá:
 * a. Indicar las dimensiones de la matriz
 * b. Rellenar la matriz mediante números aleatorios
 * c. Rellenar la matriz por teclado
 * Ten en cuenta los siguientes aspectos:
 * - El usuario puede intentar realizar operaciones con matrices no creadas (matriz ==null)
 * - El usuario puede intentar realizar operaciones con matrices no compatibles
 *  (dimensiones incorrectas)
 *  
 *  @author Rafa Miranda
 *  @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MatricesMatematicas {
	public static void main (String[]args){
		int opcion=0, f=0, c=0;
				
		do{
			mostrarMenu();
			opcion=recogerOpcion();
			elegirOpcion(opcion,f,c);
		}while(opcion!=5);
	}
	
	static void mostrarMenu(){
		System.out.println("Elija entre las siguientes operaciones:\n1.Sumar matrices.\n"+
			"2.Restar matrices.\n3.Multiplicar matrices.\n4.Invertir matriz.\n5.Salir");
	}
	
	static int recogerOpcion(){
		int opcion;
		do {
			opcion = Teclado.leerEntero();
		} while (opcion<1||opcion>5);
		return opcion;
	}
	
	static void elegirOpcion(int opcion, int f, int c){
		int[][] matriz1, matriz2, resultado=null;
		switch(opcion){
		case 1:
			matriz1=crearMatriz(pedirFilas("\nIndique numero de filas (primera matriz)."),
					pedirColumnas("\nIndique numero de columnas (primera matriz)."));
			matriz2=crearMatriz(pedirFilas("\nIndique numero de filas (segunda matriz)."),
					pedirColumnas("\nIndique numero de columnas (segunda matriz)."));
			resultado=sumarMatrices(matriz1,matriz2,resultado,f,c);
			mostrarMatriz(matriz1, "Su primera matriz es:");
			mostrarMatriz(matriz2, "Su segunda matriz es:");
			mostrarMatriz(resultado, "La matriz suma es:");
		case 2:
			matriz1=crearMatriz(pedirFilas("\nIndique numero de filas (primera matriz)."),
					pedirColumnas("\nIndique numero de columnas (primera matriz)."));
			matriz2=crearMatriz(pedirFilas("\nIndique numero de filas (segunda matriz)."),
					pedirColumnas("\nIndique numero de columnas (segunda matriz)."));
			resultado=restarMatrices(matriz1,matriz2,resultado);
			mostrarMatriz(matriz1, "Su primera matriz es:");
			mostrarMatriz(matriz2, "Su segunda matriz es:");
			mostrarMatriz(resultado, "La matriz resta es:");
		case 3:
			matriz1=crearMatriz(pedirFilas("\nIndique numero de filas (primera matriz)."),
					pedirColumnas("\nIndique numero de columnas (primera matriz)."));
			matriz2=crearMatriz(pedirFilas("\nIndique numero de filas (segunda matriz)."),
					pedirColumnas("\nIndique numero de columnas (segunda matriz)."));
			resultado=multiplicarMatrices(matriz1,matriz2,resultado);
			mostrarMatriz(matriz1, "Su primera matriz es:");
			mostrarMatriz(matriz2, "Su segunda matriz es:");
			mostrarMatriz(resultado, "La matriz producto es:");
		case 4:
			matriz1=crearMatriz(pedirFilas("\nIndique numero de filas."),
					pedirColumnas("\nIndique numero de columnas."));
			resultado=invertirMatriz(matriz1,resultado);
			mostrarMatriz(matriz1, "Su matriz es:");
			mostrarMatriz(resultado, "La matriz invertida es:");
		}
	}
	
	static int pedirFilas(String cadena){
		int f;
		do{
			f=Teclado.leerEntero(cadena);
		}while(f<1);
		return f;
	}
	
	static int pedirColumnas(String cadena){
		int c;
		do{
			c=Teclado.leerEntero(cadena);
		}while(c<1);
		return c;
	}
	
	static boolean aleatorioOManual(){
		char resp;
		
		do{
			System.out.println("\nQuiere generar manualmente sus matrices? s/n.");
			resp=Character.toUpperCase(Teclado.leerCaracter());
		}while(resp!='S'&&resp!='N');
		if(resp=='S')
			return true;
		else
			return false;
	}
	
	static int[][] crearMatriz(int f, int c){
		int[][]matriz=new int[f][c];
		if(aleatorioOManual()){
			System.out.println("Introduzca el valor para cada posición.");
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[i].length;j++){
					matriz[i][j]=Teclado.leerEntero();						
				}
			}
			return matriz;
		}
		else{
			for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[i].length;j++){
					matriz[i][j]=(int)(Math.random()*101);						
				}
			}
			return matriz;
		}
	}
	
	static void mostrarMatriz(int[][]matriz, String cadena){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	static int[][] sumarMatrices(int[][]matriz1,int[][]matriz2, int[][]resultado, int f, int c){
		resultado=new int[matriz1.length][matriz2[0].length];
		for(int i=0;i<resultado.length;i++){
			for(int j=0;j<resultado[i].length;j++){
				resultado[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		return resultado;
	}
	
	static int[][] restarMatrices(int[][]matriz1,int[][]matriz2, int[][]resultado){
		resultado=new int[matriz1.length][matriz2[0].length];
		for(int i=0;i<resultado.length;i++){
			for(int j=0;j<resultado[i].length;j++){
				resultado[i][j]=matriz1[i][j]-matriz2[i][j];
			}
		}
		return resultado;
	}
	
	static int[][] multiplicarMatrices(int[][]matriz1,int[][]matriz2, int[][]resultado){
	resultado = new int[matriz1.length][matriz2[0].length];
		if(matriz1[0].length==matriz2.length){	
			for (int i=0; i<matriz1.length; i++){
				for (int j=0; j<matriz2[0].length; j++){
					for (int k=0; k<matriz1[0].length; k++) {
						resultado[i][j] += matriz1[i][k]*matriz2[k][j];
					}
				}
			}
			return resultado;
		}
		else{
			System.out.println("\nLas matrices no pueden multiplicarse por sus tamaños. las "+
				"columnas de la primera matriz deben ser igual a las filas de la segunda.");
	        return null;
		}
	}
		
	static int[][]invertirMatriz(int[][]matriz, int[][]resultado){
	resultado = new int[matriz[0].length][matriz.length];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				resultado[j][i]=matriz[i][j];
			}
		}
		return resultado;
	}
}
