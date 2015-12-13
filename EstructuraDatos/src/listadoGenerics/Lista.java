package listadoGenerics;

/**
 * Crea una clase generica Lista. Has de implementar los siguientes métodos:
 * a. Añada al final de la lista
 * b. Inserte un elemento en una determinada posición
 * c. Modifique un elemento reemplazándolo por otro
 * d. Conozca el tamaño de la lista
 * e. Elimine elementos de la lista
 * f. Busque elementos en la lista
 * g. Copie la lista
 * Utilízala en un ejemplo TestLista (por ejemplo, la alineación de un equipo de fútbol, con
 * titulares y reservas) y entrégalo correctamente identificado y documentado, incluyendo
 * JavaDoc.
 * Deberás implementar un menú con las opciones posibles para que el usuario lo utilice
 * fácilmente.
 * 
 * @author rafael miranda ibañez
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Lista<T> {

	private ArrayList<T> lista;
	
	public Lista() {
		lista = new ArrayList<T>();
	}

	private ArrayList<T> getLista() {
		return lista;
	}
	
	T obtenerElemento(int posicion){
		return lista.get(posicion);
	}
	
	void añadirFinal(T elemento){
		lista.add(elemento);
	}
	
	void insertarEnPosicion(int posicion, T elemento){
		lista.add(posicion,elemento);
	}
	
	boolean estaVacia(){
		if(lista.isEmpty())
			return true;
		return false;
	}
	
	ArrayList<T> reemplazarElemento(int posicion, T elemento){
		lista.set(posicion,elemento);
		return lista;
	}

	int tamañoLista(){
		return lista.size();
	}
	
	ArrayList eliminarElemento(int posicion){
		lista.remove(posicion);
		return lista;
	}
	
	void eliminarElemento(T element){
		lista.remove(element);
	}
	
	boolean buscarElemento(T elemento){
		return lista.contains(elemento);
	}
	
	/*String buscarElemento(T elemento){	//OTRA IMPLEMENTACION
		Iterator iterator = lista.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			if (element.equals(elemento))
				return "El elemento " + elemento.toString() + "pertenece a la lista.";
		}
		return "El elemento " + elemento.toString() + "no pertenece a la lista.";
	}*/
	
	Object copiarLista(){
		return lista.clone();
	}
	
	@Override
	public String toString() {
		return "Lista [lista=" + lista + "]";
	}
	
	String toStringNumerado(){
	  Iterator<T> it= lista.iterator();
	  int i=0;
	  String cadena="";
	  while(it.hasNext()){
		  cadena+="\t"+i+")- "+it.next()+"\n";
		  i++;
	  }
	  return cadena;
	}
}
