/**
 * Define la clase Notas que almacene en un array 15 notas. Las notas
 * se inicializarán de forma aleatoria con enteros entre 0 y 10. 
 * Se visualizarán las notas resultantes.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

public class Notas {
	public static void main (String[]args){
		int[]notas=new int[15];
		
		inicializarVectorAleatoriamente(notas);
	}
	
	static void inicializarVectorAleatoriamente(int[]notas){
		System.out.println("\nLas quince notas son: ");
		for (int i=0; i<notas.length; i++){
			notas[i]=(int) (Math.random()*11);
			System.out.println(notas[i]+"\n");
		}
	}
}
