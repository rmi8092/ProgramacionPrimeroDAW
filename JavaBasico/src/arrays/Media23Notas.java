package arrays;

/**
 * Sube el fichero "Media23Notas.java" que calcule la media de 23 notas
 * introducidas de forma aleatoria (enteros del 0 al 10). Ha de visualizar
 * las 23 notas y la media final. Utiliza un array.
 * @author Rafa Miranda
 * @version 1.0
 */

public class Media23Notas {
	public static void main(String[] args) {
		int i=0, n=0;
		double media=0;
		int[] nota = new int [23];
			
		do{
			nota[i]=(int)(Math.random()*11);
			n = nota[i];
			i++;
			System.out.println("\nNota: "+n);
			media=calcularMedia(n,media,i);
		}while(i<23);
		System.out.println("\nLa nota media es: "+media);
	}

	/**
	 * Metodo que calcula la media a partir de la nota y la media acumulada.
	 * @param nota Valor procedente de un array de valores aleatorios entre 1 y 10.
	 * @param m Valor de la media acumulada.
	 * @return Valor de la media acumulada.
	 */
	static double calcularMedia(int n, double media, int i){
		if (i==1)
			return n;
		else
			return (n+media)/2;
	}
}
