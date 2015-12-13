/**
 * Define la clase ModificaVector. Realizará las siguientes opciones:
 * 
 * a. Creará un vector con la dimensión indicada por el usuario.
 * b. Inicializará con valores consecutivos (1, 2, 3…).
 * c. Después se solicitará al usuario un elemento del array (entre 1 y longitud)
 * 		y su nuevo valor para modificarlo.
 * d. Este proceso de modificación de un elemento se repetirá tantas veces como
 * 		quiera el usuario (¿quiere modificar otro(s/n)?)
 * e. Al acabar, se visualizarán el array ya modificado.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class ModificaVector {
	public static void main (String[]args){
				
		do{
			int[]vector=new int [pedirDimension()];
			inicializarVectorConsecutivamente(vector);
			cambiarValor(vector);
			mostrarNuevoVector(vector);
		}while(deseaContinuar());	
	}
	
	static int pedirDimension(){
		return Teclado.leerEntero("\nDame la dimension del vector que quieres crear: ");
	}
	
	static void inicializarVectorConsecutivamente(int[]vector){
		System.out.print("\nLos enteros consecutivos de tu vector son: ");
		for (int i=0; i<vector.length; i++){
			vector[i]=i+1;
			System.out.print(vector[i]+"\t");
		}
	}
	
	static void cambiarValor(int[]vector){
		int n=0;
		
		System.out.println("\nDe que posicion quieres ver el valor de tu vector?: ");
		do{
			n=Teclado.leerEntero();
			System.out.println("El valor de la posicion "+n+" en tu vector es: "+vector[n]);
			System.out.println("\nCual quieres que sea su nuevo valor?");
			vector[n]=Teclado.leerEntero();
		}while(n<0||n>vector.length);
	}
	
	private static void mostrarNuevoVector(int[] vector) {
		System.out.print("Tu nuevo vector es: ");
		for (int i=0; i<vector.length; i++) {
			System.out.print("\t"+vector[i]);
		}
	}
	
	static boolean deseaContinuar(){
		char resp;
		do{
			System.out.println("\nDesea continuar? (s/n)");
			resp = Character.toUpperCase(Teclado.leerCaracter());
			}while((resp!='S')&&(resp!='N'));
		return resp=='S'?true:false;
	}
}
