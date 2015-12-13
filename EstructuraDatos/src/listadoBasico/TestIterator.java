package listadoBasico;

/**
 * Un iterador es un objeto que se implementa en la interfaz Iterator o ListIterator. Se
 * utiliza para el recorrido, obtenci�n o modificaci�n de los elementos de una colecci�n.
 * Bas�ndote en el siguiente c�digo y analizando el interfaz Iterator indica la descripci�n
 * y signatura de los siguientes m�todos: hasNext() y next().
 * 
 * @author rafael miranda
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		// Creaci�n de un ArrayList
		ArrayList arrayList = new ArrayList();
		
		// Se a�aden elementos
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");
		
		// Recorrido hacia adelante
		System.out.print("Contenido original: \t");
		Iterator iterator = arrayList.iterator();// 1. Obtencion del iterador (al principio de la colecci�n)
													// mediante iterator() de la colecci�n.
		while(iterator.hasNext()){ // 2. Bucle con hasNext()
			Object element = iterator.next(); // 3. Dentro del bucle,
												// obtencion del elemento
												// mediante next().
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*Bas�ndote en el siguiente c�digo y analizando el interfaz Iterator indica la descripci�n
		y signatura de los siguientes m�todos: hasNext() y next().
		-- hasNext() comprueba si existe otro elemento a la derecha del ultimo elemento devuelto. Su signatura es un boolean.
		-- next() devuelve el siguiente elemento en la colecci�n y avanza hasta la siguiente posici�n. Su signatura es un objeto.*/
		
	// -------------------------------------------------
		
		//Modificaci�n de los objetos
		ListIterator listIterator = arrayList.listIterator();// 4. Obtenci�n
															//del iterador
															//al principio
															//del arrayList
															//(listIterator(0))
		while(listIterator.hasNext()){ //5. Bucle con hasNext()
			Object element = listIterator.next(); //6.Dentro del bucle,
			//obtenci�n del elemento siguiente.
			listIterator.set(element + "*"); //7.Sustituye el ultimo elemento
			//devuelto por next() o previous()
		}
		//8. el listIterator est� al final de la colecci�n
		
		//Recorrido hacia adelante
		System.out.print("Lista modificada: \t");
		iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*a. Analiza el interfaz ListIterator e indica la descripci�n y signatura de los
		siguientes m�todos: hasNext(), hasPrevious(), next() y previous().
		-- hasNext() comprueba si existe otro elemento a la derecha del ultimo elemento devuelto. Su signatura es un boolean.
		-- hasPrevios() comprueba si existe otro elemento a la izquierda del ultimo elemento devuelto. Su signatura es un boolean.
		-- next() devuelve el siguiente elemento (en avance a la derecha) en la colecci�n y avanza hasta la siguiente posici�n.
			Su signatura es un objeto.
		-- previous() devuelve el siguiente elemento (en avance a la izquierda) en la colecci�n y avanza hasta la siguiente posici�n.
			Su signatura es un objeto
		b. Analiza el interfaz ListIterator e indica la descripci�n y signatura del m�todo
		set(). Identifica los requisitos para su uso.
		El metodo set() en el interfaz ListIterator cumple la funci�n de modificar alguno de los elementos de la colecci�n.
		Solo se puede usar si no se ha llamado ni a remove() ni a add() despues de la ultima llamada a next o previous.*/
		
		// -------------------------------------------------
		
		//8. el listIterator est� al final de la colecci�n
		
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
													//obtenci�n del elemento
													//mediante previous()
			System.out.print(element + "\t");
		}
		System.out.println();
		
		/*a. Indica los m�todos implicados en el recorrido hacia delante.
		Los metodos implicados en este recorrido son hasNext() y next().
		b. Indica los m�todos implicados en el recorrido hacia atr�s.
		Los metodos implicados en este recorrido son hasPrevious() y previous().
		c. �Qu� suceder�a en el siguiente c�digo si el listIterator no partiera del final de la
		colecci�n en el recorrido hacia atr�s?
		Si partiera de cualquier otro elemento mostraria solo los elementos restantes en su avance al principio.
		d. Averigua la forma de posicionar el iterador al final de la colecci�n.
		Extrayendo un ListIterator(int index) indicandole en ese indice la ultima posicion del arraylist, ListIterator(size)*/
	}
}
