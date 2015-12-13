/**
 * Crea una clase MayorDelVector que cree un vector con enteros
 * aleatorios y muestre el valor máximo. Para ello, implementa
 * los métodos pedirDimension(), inicializarVectorAleatoriamente(int[],
 * i, max) y hallarMaximo(int[]).
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MayorDelVector {
	public static void main (String[]args){
		int d;
		
		d=pedirDimension();
		int[]vector=new int[d];
		inicializarVectorAleatoriamente(vector);
		hallarMaximo(vector);
	}
	
	static int pedirDimension(){
		return Teclado.leerEntero("\nDame la dimension del vector que quieres crear: ");
	}
	
	static void inicializarVectorAleatoriamente(int[]vector){
		System.out.print("\nLos enteros aleatorios de tu vector son: ");
		for (int i=0; i<vector.length; i++){
			vector[i]=(int) (Math.random()*101);
			System.out.print(vector[i]+"\t");
		}
	}
	
	static void hallarMaximo(int[]vector){
		int mayor = vector[0];
        
        for(int i=1; i<vector.length; i++){ // o con un foreach (for mejorado): for (int: vector)
            if (vector[i]>mayor) // if(i>mayor)
            	mayor=vector[i]; // mayor=i;
        }
    System.out.println("\nEl mayor entero del vector es: "+mayor);
	}
}
