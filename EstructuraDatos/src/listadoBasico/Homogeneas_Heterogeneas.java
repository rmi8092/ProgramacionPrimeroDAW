package listadoBasico;

/**
 * @author rafael miranda ibañez
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Homogeneas_Heterogeneas {

	public static void main(String[] args) {
		
		// Las estructuras homogéneas son aquellas que solo permiten un tipo de dato como elementos.
		// El ejemplo más común son los Arrays.
		int[] arrayHomogeneo = new int[2]; // Este array se declara para datos tipo entero
		arrayHomogeneo[0] = 2;
		arrayHomogeneo[1] = 6;
		
		for(int dato : arrayHomogeneo)
			System.out.println(dato);
		
		// Sin embargo, las estructuras heterogéneas son las que aceptan diferentes tipos de datos.
		// Un ejemplo de ellos son los ArrayList.
		ArrayList arraylistHeterogeneo = new ArrayList();
		arraylistHeterogeneo.add(2);
		arraylistHeterogeneo.add("Hola");
		int[]vector = new int[2];
		arraylistHeterogeneo.add(vector);
		arraylistHeterogeneo.add('a');
		
		Iterator iterator = arraylistHeterogeneo.iterator();
		
		while(iterator.hasNext())
			System.out.println("Elemento: " + iterator.next());
	}
}