/**
 * Crea una clase MenorDelVector que cree un vector con enteros aleatorios
 * y muestre el valor mínimo. Para ello, implementa los métodos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], min, max) y hallarMinimo(int[]).
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class MenorDelVector {
	public static void main (String[]args){
		int d;
		
		d=pedirDimension();
		int[]vector=new int[d];
		inicializarVectorAleatoriamente(vector);
		hallarMinimo(vector);
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
	
	static void hallarMinimo(int[]vector){
		int menor = vector[0];
        
        for(int i=1; i<vector.length; i++){
            if (vector[i]<menor)
                menor=vector[i];
        }
    System.out.println("\nEl menor entero del vector es: "+menor);
	}
}
