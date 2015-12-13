/**
 * Crea la clase MediaDelVector con un vector con numeros aleatorios
 * y que muestre la media del vector. 
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package foreach;

import utiles.Teclado;

public class MediaDelVector {
	public static void main (String[]args){
		int d;
		
		d=pedirDimension();
		int[]vector=new int[d];
		inicializarVectorAleatoriamente(vector);
		hallarMedia(vector);
	}
	
	static int pedirDimension(){
		return Teclado.leerEntero("\nDame la dimension del vector que quieres crear: ");
	}
	
	static void inicializarVectorAleatoriamente(int[]vector){
		System.out.print("\nLos enteros aleatorios de tu vector son: ");
		for (int i: vector){ // FOR MEJORADO: para cada elemento i del vector...
			i=(int) (Math.random()*101);
			System.out.print(i+"\t");
		}
	}
	
	static void hallarMedia(int[]vector){
		double media=1;
		
		for(int i=0; i<vector.length; i++){ // FOR CLÁSICO
			if(i==0)
				media=vector[0];
			else
				media=(media+vector[i])/2;
        }
    System.out.println("\nLa media del vector es: "+media);
	}
}
