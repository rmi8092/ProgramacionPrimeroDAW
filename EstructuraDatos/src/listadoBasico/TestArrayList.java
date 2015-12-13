package listadoBasico;

/**
 * @author rafael miranda iba�ez
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[]args) {
		// creaci�n de una lista vac�a.
		ArrayList arrayList = new ArrayList();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		
		//Se a�aden distintos elementos, de distintos tipos
		arrayList.add(1);
		arrayList.add(new String("Hola"));
		arrayList.add(new String("hola"));
		arrayList.add(new Double(0));
		arrayList.add(new Date());
		
		/*a. �Qu� estructura de datos se instancia en este c�digo?
			Una colecci�n, del tipo clase ArrayList.
		b. �En qu� paquete se encuentra?
			En el paquete java.util.
		c. Localiza el interfaz java.util.Collection que implementa e indica al menos tres
		m�todos implementados por la clase (signatura y descripci�n).
		 -- M�todo add(element). Su signatura es un booleano, true.
		 -- M�todo remove(int indice). Su signatura es el elemento eliminado.
		 -- M�todo contains(Object). Su signatura es un booleano en funci�n de si contiene
		 	el elemento especificado o no.
		 -- M�todo clear(). Su signatura es void porque no devuelve nada.
		d. �Se permiten elementos duplicados?
			Si.
		e. �Hay que saber su tama�o en su creaci�n?
			No, ya que son estructuras de datos din�micas.
		f. �Es una estructura din�mica o est�tica?
			Din�mica.
		g. �Es una estructura homog�nea o heterog�nea?
			Heterog�nea.
		h. �Se utiliza el autoboxing?
			Si, el autoboxing es una funcionalidad que el compilador
			ejecuta de manera autom�tica en versiones modernas de Java.
		i. �Existe alg�n Wrapper?
		 	Si, "new Double(0)" es un wrapper.*/
		
	//--------------------------------------------------------
		
		System.out.println("Tama�o del ArrayList: " + arrayList.size());
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		System.out.println("arrayList.contains(\"hola\"): " +
		arrayList.contains("hola"));
		System.out.println("arrayList.contains(\"adios\"): " +
		arrayList.contains("adios"));
		System.out.println("arrayList.contains(1): " +
		arrayList.contains(1));
		
		//ultimo elemento
		System.out.println("arrayList.get(arrayList.size()-1): "+
		arrayList.get(arrayList.size()-1));
		//primer elemento
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(0) instanceof Integer: "
				+(arrayList.get(0) instanceof Integer));
		//recorrido con Iterator
		for(Iterator iterator = arrayList.iterator(); iterator.hasNext();){
			Object object = iterator.next();
			System.out.print(object + " - ");
		}
		System.out.println("\narrayList.indexOf(\"hola\"): "
				+arrayList.indexOf("hola"));
		//conversi�n a array
		Object[]array = arrayList.toArray();
		for(Object object : array){
			System.out.println(object + " - ");
		}
		//borrado de elementos
		System.out.println("\narrayList.remove(0): " + arrayList.remove(0));
		System.out.println("arrayList.remove(\"hola\"): "
				+arrayList.remove("hola"));
		//se borran todos los elementos de la lista
		arrayList.clear();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		
		/*
		 	a. La palabra reservada �instanceof� es un operador especial que compara un
			objeto con un tipo. Se puede utilizar para comprobar si un objeto es una
			instancia de una clase, una instancia de una subclase, o una instancia de una
			clase que implementa una interfaz concreta. En el c�digo, �d�nde se utiliza?
			�de qu� tipo es el objeto? �C�mo se introdujo el elemento en la estructura?
				Se utiliza en la linea 68 para comprobar si el elemento en la posicion 0 del arrayList es
				de tipo Integer. En este caso es de tipo Integer. Se introdujo con el metodo .add().
			b. El m�todo iterator(), �para qu� se utiliza? �Existe otra manera de hacerlo?
				Se utiliza para recorrer un ArrayList. Si se puede implementar de otra manera:
					Iterator iterator = arrayList.iterator();
					while(iterator.hasNext()){
						Object object = iterator.next();
						System.out.print(object + " - ");
					}
			c. Indica la signatura de los m�todos utilizados para:
				i. A�adir: .add(elemento). Devuelve boolean true.
				ii. Eliminar: .remove(elemento), devuelve el elemento borrado y clear(), devuelve el arrayList vacio.
				iii. Obtener: .get(indice). Devuelve un elemento.
				iv. Convertir a estructura est�tica: .toArray(). Devuelve un array.
				v. Averiguar:
					1. Tama�o: .size(). Devuelve el numero de elementos.
					2. Si la estructura est� vac�a: .isEmpty(). Devuelve boolean.
					3. Si un elemento est� en la estructura: .contains(elemento). Devuelve boolean.
					4. Posici�n de un elemento: .indexOf(elemento). Devuelve el valor de su posici�n.
		 */
	}
}
