package listadoBasico;

/**
 * @author rafael miranda iba�ez
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Estaticas_Dinamicas {

	public static void main(String[] args) {
		
		// Las estructuras est�ticas son aquellas que son inalterables en su dimensi�n
		// una vez declaradas. El ejemplo m�s com�n son los Arrays.
		int[] arrayEstatico = new int[2]; // Este array se declara con cuatro posiciones y tras
											// esto no se puede modificar su dimensi�n.
		arrayEstatico[0] = 2;
		arrayEstatico[1] = 6;
		arrayEstatico[2] = 8;
		arrayEstatico[3] = 3;
		arrayEstatico[4] = 1;
		
		for(int dato : arrayEstatico)
			System.out.println(dato);
		
		// Sin embargo, las estructuras din�micas son las que aunque ya declaradas con una dimensi�n de
		// partida esta se puede modificar posteriormente. Un ejemplo de ellos son los ArrayList.
		ArrayList arraylist = new ArrayList(3);
		arraylist.add(2);
		arraylist.add(6);
		arraylist.add(1);
		arraylist.add(9);
		arraylist.add(5);
		
		Iterator iterator = arraylist.iterator();
		
		while((iterator).hasNext())
			System.out.println("Elemento: " + iterator.next());
	}
}
