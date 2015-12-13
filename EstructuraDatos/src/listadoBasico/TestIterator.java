package listadoBasico;

/**
 * Un iterador es un objeto que se implementa en la interfaz Iterator o ListIterator. Se
 * utiliza para el recorrido, obtención o modificación de los elementos de una colección.
 * Basándote en el siguiente código y analizando el interfaz Iterator indica la descripción
 * y signatura de los siguientes métodos: hasNext() y next().
 * 
 * @author rafael miranda
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		// Creación de un ArrayList
		ArrayList arrayList = new ArrayList();
		
		// Se añaden elementos
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");
		
		// Recorrido hacia adelante
		System.out.print("Contenido original: \t");
		Iterator iterator = arrayList.iterator();// 1. Obtencion del iterador (al principio de la colección)
													// mediante iterator() de la colección.
		while(iterator.hasNext()){ // 2. Bucle con hasNext()
			Object element = iterator.next(); // 3. Dentro del bucle,
												// obtencion del elemento
												// mediante next().
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*Basándote en el siguiente código y analizando el interfaz Iterator indica la descripción
		y signatura de los siguientes métodos: hasNext() y next().
		-- hasNext() comprueba si existe otro elemento a la derecha del ultimo elemento devuelto. Su signatura es un boolean.
		-- next() devuelve el siguiente elemento en la colección y avanza hasta la siguiente posición. Su signatura es un objeto.*/
		
	// -------------------------------------------------
		
		//Modificación de los objetos
		ListIterator listIterator = arrayList.listIterator();// 4. Obtención
															//del iterador
															//al principio
															//del arrayList
															//(listIterator(0))
		while(listIterator.hasNext()){ //5. Bucle con hasNext()
			Object element = listIterator.next(); //6.Dentro del bucle,
			//obtención del elemento siguiente.
			listIterator.set(element + "*"); //7.Sustituye el ultimo elemento
			//devuelto por next() o previous()
		}
		//8. el listIterator está al final de la colección
		
		//Recorrido hacia adelante
		System.out.print("Lista modificada: \t");
		iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*a. Analiza el interfaz ListIterator e indica la descripción y signatura de los
		siguientes métodos: hasNext(), hasPrevious(), next() y previous().
		-- hasNext() comprueba si existe otro elemento a la derecha del ultimo elemento devuelto. Su signatura es un boolean.
		-- hasPrevios() comprueba si existe otro elemento a la izquierda del ultimo elemento devuelto. Su signatura es un boolean.
		-- next() devuelve el siguiente elemento (en avance a la derecha) en la colección y avanza hasta la siguiente posición.
			Su signatura es un objeto.
		-- previous() devuelve el siguiente elemento (en avance a la izquierda) en la colección y avanza hasta la siguiente posición.
			Su signatura es un objeto
		b. Analiza el interfaz ListIterator e indica la descripción y signatura del método
		set(). Identifica los requisitos para su uso.
		El metodo set() en el interfaz ListIterator cumple la función de modificar alguno de los elementos de la colección.
		Solo se puede usar si no se ha llamado ni a remove() ni a add() despues de la ultima llamada a next o previous.*/
		
		// -------------------------------------------------
		
		//8. el listIterator está al final de la colección
		
		//Recorrido hacia adelante
		System.out.print("Lista modificada: \t");
		iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			System.out.print(element + "\t");
		}
		System.out.println();
		
		//Recorrido hacia atras
		System.out.print("Lis mod (hacia atras): ");//9.el
													//listIterator
													//parte del
													//final de la
													//coleccion
		while(listIterator.hasPrevious()){//10.Bucle con hasPrevious()
			Object element = listIterator.previous();//11. Dentro del bucle,
													//obtención del elemento
													//mediante previous()
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*a. Indica los métodos implicados en el recorrido hacia delante.
		Los metodos implicados en este recorrido son hasNext() y next().
		b. Indica los métodos implicados en el recorrido hacia atrás.
		Los metodos implicados en este recorrido son hasPrevious() y previous().
		c. ¿Qué sucedería en el siguiente código si el listIterator no partiera del final de la
		colección en el recorrido hacia atrás?
		Si partiera de cualquier otro elemento mostraria solo los elementos restantes en su avance al principio.
		d. Averigua la forma de posicionar el iterador al final de la colección.
		Extrayendo un ListIterator(int index) indicandole en ese indice la ultima posicion del arraylist, ListIterator(size)*/
	}
}
